package com.test.thread;

abstract class abc {
	
	private int i;
	private String name;
	abstract void method();
	
	public abc(int i, String name) {
		this.i =i;
		this.name =name;
	}
	
	void method2() {
		System.out.println("instance variable i:: "+i +" and name ::"+name);
	}

}

public class Test  extends abc{
   String cmp;
	public Test(int i, String name, String cmp) {
		super(i, name);
		// TODO Auto-generated constructor stub
		this.cmp =cmp;
	}

	@Override
	void method() {
		System.out.println("Abstrct method implementation:::"+cmp);		
	}
	
	public static void main(String[] args) {
		
		Test t= new Test(10, "Dhananjay","coforge");
		t.method();
		t.method2();
	}
	
	
}