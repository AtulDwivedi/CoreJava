package corejava.threeTierDemo.DAO;

public interface DAOInterface{
	public boolean addUser(ClientDB client);
	public boolean login(String userID, String password);
	public String update(String string, String string2);
	
}




