package com.mindgate.main;



public class MyClassMain {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main start");

//		MyClass myClass = new MyClass();
//		myClass.display(); // 10 10 20 20
//		System.out.println(myClass.getObjectCounter()); // 1
//		System.out.println("------------------");
//		MyClass myClass2 = new MyClass();
//		myClass2.display(); // 10 10 20 20
//		System.out.println(myClass2.getObjectCounter()); // 2
//		System.out.println("------------------");
//		MyClass myClass3 = new MyClass();
//		System.out.println(myClass.getObjectCounter());

		//MyClass.display();

		// MyClass myClass = new MyClass();

		Class.forName("com.mindgate.domain.MyClass");

		System.out.println("main end");
	}

	static {
		System.out.println("static block of main");
	}

}
