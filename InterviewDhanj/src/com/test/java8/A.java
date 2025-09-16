package com.test.java8;

public class A {
	public void method() {
		System.out.println("Class A ");
	}
	
	public static void main(String args[]) {
		
		A a = new A();		
		A a1 = new B();
		A a2 = new C();
		
//		B b = new A();
//		C c = new A();
		B b1= new B();
//		B b2= new C();
		C c1 = new C();
//		C c3 = new B();
	}

}

 class B extends A {
	
	public void method() {
		System.out.println("Claa B");
	}
}

class C extends A {
	
	public void method() {
		System.out.println("Class C");
	}
}
