package com.wjy.aspectj;

public class HelloWord {
	public void sayHello() {
		System.out.println("hello aspectj");
	}

	public static void main(String[] args) {
		HelloWord helloWord = new HelloWord();
		helloWord.sayHello();
	}
}
