package corejava.annotation.customannotation.test;

public class MyTest {

	@Test(enabled=true)
	public static void test1(){
		System.out.println("running test1");
	}
	
	@Test(enabled=false)
	public static void test2(){
		System.out.println("running test2");
	}
	
	@Test
	public static void test3(){
		System.out.println("running test3");
	}
	
	public static void test4(){
		System.out.println("running test4");
	}
}
