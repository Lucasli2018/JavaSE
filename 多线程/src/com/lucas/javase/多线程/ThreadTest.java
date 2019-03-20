package com.lucas.javase.∂‡œﬂ≥Ã;

public class ThreadTest extends Thread{

	public static void main(String[] args) throws InterruptedException {
		Thread t=new ThreadTest();
		t.start();
		int num=3;
		for (int i = 0; i < num; i++) {
			System.out.println("Main");
			Thread.sleep(100);
		}
	}

	@Override
	public void run() {
		int num=3;
		for (int i = 0; i < num; i++) {
			System.out.println("Thread");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
