
public class Polindrum {
	
	static boolean polindrumTest(String str) {
		
		int length = str.length();
		
		int forward = 0;
		int backward = length-1;
		
		while(backward > forward) {
			
			char  forwardChar = str.charAt(forward++);
			char backwordChar = str.charAt(backward--);
			if(forwardChar != backwordChar) {
				return false;
			}			
		}		
		return true;
	}
	
	
	//Polindrum test using StringBuilder
	
	static boolean polindrumString(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		//char arr[] = str.toCharArray();
		
		for(int i= str.length()-1; i>=0; i--) {
			//sb.append(arr[i]);
			sb.append(str.charAt(i));
		}
		
		return sb.toString().equals(str);
		
	}
	
	public static void main(String args[]) {
		
		String str = "madam";
		boolean polindrum = polindrumTest(str);
		boolean polindrumString = polindrumString(str);
		if(polindrumString) {
			System.out.println("Polindrum Number");
		}
		else {
			System.out.println("Not a Polindrum Number");
		}
	}

}
