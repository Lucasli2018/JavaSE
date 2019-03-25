package com.lucas.javase.∂‡œﬂ≥Ã;

public class JoinTest extends Thread{

	@Override
	public void run() {
		int num=3;
		for (int i = 0; i < num; i++) {
			System.out.println("Thread run");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t=new JoinTest();
		t.start();
		t.join();
		System.out.println("Thread is end......");
		int num=3;
		for (int i = 0; i < num; i++) {
			System.out.println("Main run");
		}
	}

}
