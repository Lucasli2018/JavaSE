package com.lucas.javase.∂‡œﬂ≥Ã;

public class RunnableTest implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		Runnable r=new RunnableTest();
		Thread t=new Thread(r);
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
			System.out.println("Thread run");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
