package com.lucas.javase.tcp多线程;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

/**
 * 服务器端
 * @author Administrator
 *
 */
public class TCPServer {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		ServerSocket ss=new ServerSocket(9090);
		System.out.println("TCP Server ready.");
		System.out.println("wait for port:9090");
		
		for(;;){
			//程序会在这里等待9090端口发送数据
			Socket sock=ss.accept();
			System.out.println("accept from " +sock.getRemoteSocketAddress());
			TimeHandler handler=new TimeHandler(sock);
			handler.start();
		}
	}

}

class TimeHandler extends Thread{
	Socket sock;

	TimeHandler(Socket sock) {
		this.sock = sock;
	}

	@Override
	public void run() {
		try(BufferedReader reader=new BufferedReader(
				new InputStreamReader(sock.getInputStream(), StandardCharsets.UTF_8))){
			try(BufferedWriter writer=new BufferedWriter(
					new OutputStreamWriter(sock.getOutputStream(),StandardCharsets.UTF_8))){
				for(;;){

					String cmd=reader.readLine();
					if("q".equals(cmd)){
						writer.write("bye!\n");
						writer.flush();
						break;
					}else if("time".equals(cmd)){
						writer.write(LocalDateTime.now().toString()+"\n");//注意若没有换行符，客户端readline会一直读取不到数据
						writer.flush();
					}else{
						writer.write("Sorry?\n");
						writer.flush();
					}
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				this.sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}