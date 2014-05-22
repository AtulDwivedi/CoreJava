package corejava.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * @resource http://www.mkyong.com/java/how-to-use-reflection-to-call-java-method-at-runtime/
 */



public class ReflectApp {
	public static void main(String[] args)throws Exception {
		 
		//no parameter
		Class noparams[] = {};
	 
		//String parameter
		Class[] paramString = new Class[1];	
		paramString[0] = String.class;
	 
		//int parameter
		Class[] paramInt = new Class[1];	
		paramInt[0] = Integer.TYPE;
	 
		try{
		        //load the AppTest at runtime
			Class cls = Class.forName("corejava.reflection.AppTest");
			Object obj = cls.newInstance();
	 
			//call the printIt method
			Method method = cls.getDeclaredMethod("printIt", noparams);
			method.invoke(obj, null);
	 
			//call the printItString method, pass a String param 
			method = cls.getDeclaredMethod("printItString", paramString);
			method.invoke(obj, new String("Atul"));
	 
			//call the printItInt method, pass a int param
			method = cls.getDeclaredMethod("printItInt", paramInt);
			method.invoke(obj, 123);
	 
			//call the setCounter method, pass a int param
			try {
				method = cls.getDeclaredMethod("setCounter", paramInt);
				method.setAccessible(true);
				method.invoke(obj, 100);
			}
			catch(NoSuchMethodException e){
				e.printStackTrace();
			}
			catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IllegalAccessException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			catch (InvocationTargetException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			catch (IllegalArgumentException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	 
			//call the printCounter method
			method = cls.getDeclaredMethod("printCounter", noparams);
			method.invoke(obj, null);
	 
		}catch(Exception ex){
			ex.printStackTrace();
		}
	  }
}