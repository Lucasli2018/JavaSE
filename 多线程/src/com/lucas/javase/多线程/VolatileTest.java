package com.lucas.javase.多线程;

public class VolatileTest {

	public static void main(String[] args) throws InterruptedException {
		Volati t=new Volati();
		t.start();
		Thread.sleep(1000);
		t.running=false;
		System.out.println("Main is end...");
	}

}
class Volati extends Thread{

	volatile boolean running=true;
	@Override
	public void run() {
		while (running) {
			System.out.println("Thread run");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Thread is interrupted ...");
				break;//这个语句最重要，否则无法退出while
			}
		}
		System.out.println("Thread is end...");
	}
	
}