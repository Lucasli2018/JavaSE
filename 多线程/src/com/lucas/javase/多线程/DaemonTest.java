package com.lucas.javase.多线程;

public class DaemonTest {

	public static void main(String[] args) throws InterruptedException {
		InterTest t=new InterTest();
		System.out.println("Main start...");
		t.setDaemon(true);//线程守护设置一定需要在start方法之前，否则报错java.lang.IllegalThreadStateException
		t.start();
		
		Thread.sleep(3000);
		System.out.println("Main is end...");
	}

}
