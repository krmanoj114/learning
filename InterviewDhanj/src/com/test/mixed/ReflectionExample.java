package com.test.mixed;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
	
	public static void main(String [] args){
		Class<Person> personClass = null;
		try {
			personClass = (Class<Person>)Class.forName("com.test.mixed.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(personClass.getName());
		
		
//		Field [] fields = personClass.getFields();
//		
//		for(Field field: fields) {
//			System.out.println(field.getName());
			
			
//		Method [] methods = personClass.getMethods();
//		
//		for(Method methodName : methods){
//			System.out.println("Method Name::"+methodName.getName());			
//		
//		}
		
//		Field [] fields = personClass.getDeclaredFields();
//		
//		for(Field f : fields) {
//			f.setAccessible(true);
//			System.out.println(f.getName());
//		}
		
		
		Method [] m = personClass.getMethods();
		for(Method method: m) {
			if(method.isAnnotationPresent(MyAnnotation.class)) {
				System.out.println(method.getName());
			}
		}
	}

}
