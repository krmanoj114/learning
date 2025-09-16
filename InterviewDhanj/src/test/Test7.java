package test;

abstract class A {
	
	public A() {
		
	}
	abstract void method();
	
	void method2() {
		System.out.println("Abstract class method 2");
	}
}

public class Test7 extends A{

	@Override
	void method() {
		System.out.println("Implementation of method");
		
	}
	
	public static void main(String[] args) {
		
		Test7 a = new Test7();
		//Test7 b = new A();
		
		A aa= new Test7();
		//A bb = new A();
		a.method2();
		a.method();
		
		aa.method();
		aa.method2();
		
	}

}
