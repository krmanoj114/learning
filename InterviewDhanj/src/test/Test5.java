package test;


interface Multiply {
	int mul(int a, int b, int c);
}

public class Test5 {
	public static void main(String args[]) {
//	int a= 10;
//	int b= 20;
//	int c= 30;
	
	Multiply multiply =  (a,b,c)-> {
		 return a*b*c;
	};
	
	System.out.println(multiply.mul(10,20,30));
	}

}

