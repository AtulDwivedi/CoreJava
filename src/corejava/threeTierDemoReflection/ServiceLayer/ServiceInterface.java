package corejava.threeTierDemoReflection.ServiceLayer;

public interface ServiceInterface{
	public boolean register(String userID, String password, String email);
	public boolean login(String userID, String password);
	public String update(String string, String string2);
}
