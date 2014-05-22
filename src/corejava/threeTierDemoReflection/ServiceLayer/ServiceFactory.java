package corejava.threeTierDemoReflection.ServiceLayer;

import corejava.threeTierDemoReflection.DAO.ClientDB;
import corejava.threeTierDemoReflection.DAO.DAOInterface;
import corejava.threeTierDemoReflection.DAO.Factory;

public class ServiceFactory {
	public static ServiceInterface factoryMethod(){
		return new ServiceClass();
		
	}
}


class ServiceClass implements ServiceInterface {
	DAOInterface getFact = Factory.factoryMethod();
	public boolean register(String userID, String password, String email) {
		// TODO Auto-generated method stub
		ClientDB c = new ClientDB(userID, password, email);
		
		if(getFact.addUser(c)){
			return true;
		}
		else
			return false;
	}

	public boolean login(String userID, String password) {
		// TODO Auto-generated method stub
		if (getFact.login(userID, password)) {
			return true;
		}
		else
			return false;
	}

	public String update(String string, String string2) {
		// TODO Auto-generated method stub
			String str=getFact.update(string, string2);
			return str;
		}
		
	

}