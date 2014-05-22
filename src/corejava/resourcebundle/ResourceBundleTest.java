package corejava.resourcebundle;

import java.util.ResourceBundle;

public class ResourceBundleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o;
		PlzAdd pa = null;
		ResourceBundle rb = ResourceBundle.getBundle("hello");
		Class clsObj = null;
		try {
			clsObj = Class.forName(rb.getString("cn").trim());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			o = clsObj.newInstance();
			 pa = (PlzAdd)o;
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(pa.add(2,3));
		
	}

}

interface PlzAdd{
	int add(int x, int y);
}
 
class addClass1 implements PlzAdd{
	

	@Override
	public int add(int x, int y){
		// TODO Auto-generated method stub
		return x+y;
	}
}

class addClass2  implements PlzAdd{

	@Override
	public int add(int x, int y){
		// TODO Auto-generated method stub
		return x+y;
	}	
}
