package com.test.mixed;

public class Test {
	
	
	 public String getDomain(String sender) {
	        if (sender == null) {
	            return null;
	        }
	        int p = sender.indexOf("@");
	        if (p < 0) {
	            return sender.toLowerCase();
	        }
	        return sender.substring(p+1).toLowerCase();
	    }
	
	
//	 public String getFromAnyCache(String sender) {
//	        Object result = null;
//	        if (sender == null) {
//	            return null;
//	        }
//	        sender = sender.toLowerCase();
//	        for (int p = sender.indexOf("."); p >= 0 && result == null; p = sender.indexOf(".")) {
//	           // result = aCache.get(sender.toLowerCase());
//	            //if (sender.endsWith("simac.de")) {
//	            //    System.out.println("######## " + sender + " / found in aCache: " + result);
//	            //}
//	            if (sender.indexOf('@') >= 0) {
//	                p = sender.indexOf('@');
//	            }
//	            sender = sender.substring(p+1);
//	        }
//	        return sender;
//	    }

	public static void main(String[] args) {
		
		Test t =new Test();
		String str = t.getDomain("redmine@mrpips.gov.pl");
		
		System.out.println("STR:::"+str);

	}

}
