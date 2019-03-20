package com.lucas.javase.���߳�;

public class InterruptTest{

	

	public static void main(String[] args) throws InterruptedException {
		Thread t=new InterTest();
		t.start();
		Thread.sleep(1000);
		t.interrupt();
		System.out.println("Main is end...");
	}

}

class InterTest extends Thread{

	@Override
	public void run() {
		while (!isInterrupted()) {
			System.out.println("Thread run");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Thread is interrupted ...");
				break;//����������Ҫ�������޷��˳�while
			}
		}
		System.out.println("Thread is end...");
	}
	
}
