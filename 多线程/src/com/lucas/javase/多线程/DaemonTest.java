package com.lucas.javase.���߳�;

public class DaemonTest {

	public static void main(String[] args) throws InterruptedException {
		InterTest t=new InterTest();
		System.out.println("Main start...");
		t.setDaemon(true);//�߳��ػ�����һ����Ҫ��start����֮ǰ�����򱨴�java.lang.IllegalThreadStateException
		t.start();
		
		Thread.sleep(3000);
		System.out.println("Main is end...");
	}

}
