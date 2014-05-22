package corejava.threeTierDemoReflection.DAO;

public class ClientDB {
		
		private String userID;
		private String password;
		private String email;

		
		
		public final String getUserID() {
			return userID;
		}

		public final void setUserID(String userID) {
			this.userID = userID;
		}

		public final String getPassword() {
			return password;
		}

		public final void setPassword(String password) {
			this.password = password;
		}

		public final String getEmail() {
			return email;
		}

		public final void setEmail(String email) {
			this.email = email;
		}

		public ClientDB(String userID, String password, String email) {
			this.userID = userID;
			this.password = password;
			this.email = email;
		}

		

		
}
