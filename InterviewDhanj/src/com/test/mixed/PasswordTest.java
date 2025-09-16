package com.test.mixed;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordTest {

	
	private Pattern pattern;
    private Matcher matcher;
 
    private static final String PASSWORD_PATTERN = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})";
 
    public PasswordTest() {
        pattern = Pattern.compile(PASSWORD_PATTERN);
    }
 
    public boolean validate(final String password) {
 
        matcher = pattern.matcher(password);
        return matcher.matches();
 
    }
	public static void main(String args[]) {
		
		PasswordTest passwordTest =  new PasswordTest();
		
		String password= "India$123";
		boolean passwordMatch = passwordTest.validate(password);
		
		System.out.println("PasswordMatch :::::"+passwordMatch);
		
	}
	
}
