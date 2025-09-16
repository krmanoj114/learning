
public class SwitchExample {
	
	public static void main(String args[]){
		
		final int i = 10;
		
		int a = 2;
		
		switch(a) {
		
		case 2:
			System.out.println("hi");
		case 3: 
			System.out.println("hello");
			
		case i:
			System.out.println("final"+i);
			
		}
	}

}
