package corejava.interfaces;

interface I1{
	String methodfI1(String strArg);
}

interface I2 extends I1 {
	String methodfI2(String strArg);
}


class A implements I1{

	@Override
	public String methodfI1(String strArg) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class B implements I2{

	@Override
	public String methodfI2(String strArg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String methodfI1(String strArg) {
		// TODO Auto-generated method stub
		return null;
	}

	
}