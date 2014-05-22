package corejava.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class clsObj=null;
		try{
			clsObj = Class.forName("UsingAnnotation");
		}
		catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}
		try {
			Method mthd = clsObj.getMethod("fun", null);
			if(mthd.isAnnotationPresent(MyAnnotation.class))
			{
				MyAnnotation myAnnObj = mthd.getAnnotation(MyAnnotation.class);
				int level = myAnnObj.level();
				mthd.invoke(null, null);
			}
		} catch (IllegalAccessException e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		catch (IllegalArgumentException e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
		catch (InvocationTargetException e3) {
			// TODO: handle exception
			e3.printStackTrace();
		}
		catch (SecurityException e4) {
			// TODO: handle exception
			e4.printStackTrace();
		}
		catch (NoSuchMethodException e5) {
			// TODO: handle exception
			e5.printStackTrace();
		}

	}

}
