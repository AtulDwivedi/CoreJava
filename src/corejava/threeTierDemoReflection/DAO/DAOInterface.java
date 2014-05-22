package corejava.threeTierDemoReflection.DAO;

public interface DAOInterface{
	boolean showMenu();
	public boolean addUser(ClientDB client);
	public boolean login(String userID, String password);
	public String update(String string, String string2);
	
}




