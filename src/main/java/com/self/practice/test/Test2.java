package com.self.practice.test;

public class Test2 {

	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo() {
			public void run() {
				System.out.print(" Foo ");
			};
		};

		t1.start();
	}
}

class ThreadDemo extends Thread {

	public ThreadDemo() {
		System.out.print("Thread Demo");
	}

	@Override
	public void run() {
		System.out.print("Bar");
	}

	public void run(String s) {
		System.out.print("s=" + s);
	}
}
