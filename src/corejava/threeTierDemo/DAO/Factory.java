package corejava.threeTierDemo.DAO;

public class Factory{
	public static DAOInterface factoryMethod(){
		return new Client();
	}
}

class Client implements DAOInterface{
	static int count=0;
	static ClientDB[] clientObj = new ClientDB[5];
	
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
	
	
}
