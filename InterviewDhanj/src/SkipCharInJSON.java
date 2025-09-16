import java.util.regex.Pattern;

//import org.json.JSONException;
//import org.json.JSONObject;

public class SkipCharInJSON {
	
	
	public static String removeSpecialChar(String json) {
        String xml10pattern = "[^"
            + "\u0009\r\n"
            + "\u0020-\uD7FF"
            + "\uE000-\uFFFD"
            + "\ud800\udc00-\udbff\udfff"
            + "]";

        Pattern xmlInvalidChars =
            Pattern.compile("[^\\u0009\\u000A\\u000D\\u0020-\\uD7FF\\uE000-\\uFFFD\\x{10000}-\\x{10FFFF}]");

        String formattedString = json.replaceAll(xml10pattern, "");
      //  String formattedString =

       // return xmlInvalidChars.matcher(json).replaceAll("");
        return formattedString;

    }
	
	public static void main(String args[]) {
		 String data = "{\r\n" + 
		 		"  \"Calls\" : {\r\n" + 
		 		"    \"SPCallID\" : \"INC0000000009891\",\r\n" + 
		 		"    \"ShortDescription\" : \"Trap Received: ciscoLwappAAARadiusReqTimedOut | Trap Detail: claRadiusAddressType: 1; claRadiusAddress: \\n??\u0015; claRadiusPortNum: 1813; claRadiusClientMacAddress:\",\r\n" + 
		 		"    \"Remarks\" : \"\",\r\n" + 
		 		"    \"Solution\" : \"\",\r\n" + 
		 		"    \"CustomerRequestedStartTime\" : \"2019-11-12T10:54:12.000+0000\",\r\n" + 
		 		"    \"CustomerRequestedEndTime\" : \"2019-11-12T11:09:46.000+0000\",\r\n" + 
		 		"    \"SysSpecField1\" : \"EBINCO000000000136350\",\r\n" + 
		 		"    \"SysSpecField2\" : \"37089c061b8940908aa4db9ebd4bcb7e\",\r\n" + 
		 		"    \"ProviderReasonCategory1\" : \"\",\r\n" + 
		 		"    \"ProviderReasonCategory2\" : \"\"\r\n" + 
		 		"  }\r\n" + 
		 		"}";

		 
		 
//		    try {
//		    	JSONObject json = null;
//		    //	JSONObject.quote("u0015");
//		    	if(data.contains("u0015")) {
//		    		data.replace("u0015", "dhananjay");
//		    		
//		    		 json = new JSONObject(data);
//		    		System.out.println("Count"+data);
//		     // JSONObject json = new JSONObject(data);
//		    	}
//		    //  json.quote("u0015");
//		    	
//		     
//		      System.out.println("Success: json = ");
//		     // System.out.println(json.toString(2));
//		    } catch(JSONException ex) {
//		      System.out.println("Error: " + ex);
//		    }
		 
		 
		 
		 
		 String xml10pattern = "[^"
                 + "\u0009\r\n"
                 + "\u0020-\uD7FF"
                 + "\uE000-\uFFFD"
                 + "\ud800\udc00-\udbff\udfff"
                 + "]";
		 
		 String xml11pattern = "[^"
                 + "\u0001-\uD7FF"
                 + "\uE000-\uFFFD"
                 + "\ud800\udc00-\udbff\udfff"
                 + "\\u0015"
                 + "]+";
		 
		 SkipCharInJSON charInJSON = new SkipCharInJSON();
		 String modifiedData = charInJSON.removeSpecialChar(data);
		 System.out.println("Original String data:::"+data);
		 System.out.println("Modified Data::::"+modifiedData);
		 
//		 String xml = "Trap Received: ciscoLwappAAARadiusReqTimedOut | Trap Detail: claRadiusAddressType: 1; claRadiusAddress: \\n??\u0015; claRadiusPortNum: 1813; claRadiusClientMacAddress:\\";
//		 String legal = data.replaceAll(xml10pattern, "");
//		 System.out.println("legal::::::::"+legal);
		 
		 Pattern xmlInvalidChars =
				 Pattern.compile("[^\\u0009\\u000A\\u000D\\u0020-\\uD7FF\\uE000-\\uFFFD\\x{10000}-\\x{10FFFF}]");
		 
//System.out.println(xmlInvalidChars.matcher(data).replaceAll(""));
		 
		  }   
	}


