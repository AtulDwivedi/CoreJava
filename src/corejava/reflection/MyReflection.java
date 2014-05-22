package corejava.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @resource  http://tutorials.jenkov.com/java-reflection/index.html
 */


public class MyReflection {

	/**
	 * @param args http://tutorials.jenkov.com/java-reflection/index.html
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Get java.lang.Class object corresponding to MyAppForReflection class: compile time process
		Class<?> cObjCmplTm = MyAppForReflection.class;
	
		
		//Simple class name
		System.out.println("Fully qualified class name: "+cObjCmplTm.getName());
		System.out.println("Simple class name: "+cObjCmplTm.getSimpleName());
	
		
		//Fully qualified class name
		try{
		Class<?> cObjRunTm =	Class.forName(args[0]);
		System.out.println("Class name from runtime object: "+cObjRunTm.getSimpleName());
		}
		catch(ClassNotFoundException e){
			System.out.println("Class is not found in classpath at run time.");
		}
				
		//Modifiers
		int modifiers = cObjCmplTm.getModifiers();
		if (Modifier.isPublic(modifiers)) {
			System.out.println("The provided class is public.");
		}
		if (Modifier.isStatic(modifiers)) {
			System.out.println("The provided class is public.");
		}
		
		/*
		Similerly for 	Abstract, Final, Interface, 
						Private, Native, Protected, 
						Public, Static, Strict, 
						Synchronized, Transient, Volatile
		*/
		
		
		
		//Obtaining package object and use this object for accessing package info
		Package packageObj = cObjCmplTm.getPackage();
		
		
		
		
		//Implemented Interfaces
		Class[] interfaces = cObjCmplTm.getInterfaces();
		
		
		
		//Constructors
		Constructor[] constructors = cObjCmplTm.getConstructors();
		
		
		//Superclass		
		//Obtaining Class object associated with super class of current class
		//Do inspection on this super class object just in same way as the current class.
		Class superClassObj = cObjCmplTm.getSuperclass();
		System.out.println("Super class name is: "+superClassObj.getName());
		
		
		
		
		
		
		//Methods
		Method[] methods = cObjCmplTm.getMethods();
		int i=0;
		for(Method method : methods){
		    System.out.println("method"+ ++i +" = " + method.getName());
		}
		
		
		//Fields
		Field[] fields = cObjCmplTm.getFields();
		
		
		//Annotations
		Annotation[] anootations = cObjCmplTm.getAnnotations();
	}

}
