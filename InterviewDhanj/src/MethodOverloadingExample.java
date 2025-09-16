

class Parent {
	
	public void method(){
		System.out.println("Parent Class");
	}
}

class Child extends Parent {
	
	public void method(){
		System.out.println("Child class");
	}
	
	public void display(){
		System.out.println("display method");
	}
}


public class MethodOverloadingExample {
	
	public static void main(String args[]){
		
		Parent parent = new Parent();
		parent.method();
		
		Parent child = new Child();
		
		child.method();
	//	child.display();
		
	}

}
