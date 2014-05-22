package corejava.threeTierDemoReflection.DAO;

import java.util.ResourceBundle;

public class Factory{
	public static DAOInterface factoryMethod(){
		return new Client();
	}
}

class Client implements DAOInterface{
	static int count=0;
	static String user="";
	static int occurance=0;
	static ClientDB[] clientObj = new ClientDB[5];
	ResourceBundle rb = ResourceBundle.getBundle("configure");
	
	
	
	
/*	
	public boolean login(String userID, String password) {
		// TODO Auto-generated method stub
		
			for (int i = 0; i < clientObj.length; i++) {
				if ((clientObj[i].getUserID().equals(userID))
						&& (clientObj[i].getPassword().equals(password))) {
					return true;
				}
				}
			return false;
		}
*/	

	private boolean checkDuplicate(String userID){
		if(count > 0){
		for (int i = 0; i < clientObj.length; i++) {
			if((clientObj[i].getUserID()).equals(userID)){
				return false;
			}
		}
		}return true;
					
	}
		
	private boolean checkSpace() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < clientObj.length; i++) {
			if(clientObj[i]!=null)
			count++;
		}
		
		if(count<5){
			return true;
		}
		else{
			return false;
		}
	}



	public boolean addUser(ClientDB client) {
		// TODO Auto-generated method stub
		if (checkSpace()) {
			if (checkDuplicate(client.getUserID())) {
				for (int i = 0; i < clientObj.length; i++) {
					if(clientObj[i]==null){
						clientObj[i]=client;
						return true;
					}
				}
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
		
			return false;
				
	}


	public String update(String string, String string2) {
		// TODO Auto-generated method stub
		for (int i = 0; i < clientObj.length; i++) {
				if((clientObj[i].getPassword()).equals(string)){
					clientObj[i].setEmail(string2);
					return clientObj[i].getEmail();
				}
			}
		
		return null;
	}
/*
	@property class stuffs starts from here!
*/	
	@Override
	public boolean showMenu() {
		// TODO Auto-generated method stub
		if(rb.getString("validate").equals("1"))
			return true;
		else
				return false;
	}

	
	@Override
	public boolean login(String userID, String password) {
		// TODO Auto-generated method stub
		if(validate(userID)){
		String[] userIds= (rb.getString("userIds")).split(" ");
		String[] passwords= (rb.getString("passwords")).split(" ");
		String[] status= (rb.getString("status")).split(" ");
		for (int i = 0; i < userIds.length; i++) {
			if (userIds[i].equals(userID)) {
				if (passwords[i].equals(password)) {
					if (status[i].equals("true")) {
						return true;
					} else {
						return false;
					}
				} else {
					occurance++;
					return false;
				}
			} else {
				occurance++;
				return false;
			}
		}
		}return false;
	}

	private boolean validate(String userID) {
		// TODO Auto-generated method stub
		if(userID.equals(user)){
			if(occurance<3)
				return true;
			else
				return false;
		}
		else{
			occurance=0;
			return true;
		}
	}
	
	
}
