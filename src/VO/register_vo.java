package VO;

public class register_vo {
		private String User_name;
		
		private String First_Name;
		private String Last_Name;
		private String Password;
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		private int CID;
		
		public int getCID() {
			return CID;
		}
		public void setCID(int cID) {
			CID = cID;
		}
		public String getUser_name() {
			return User_name;
		}
		public void setUser_name(String user_name) {
			User_name = user_name;
		}
		
		public String getFirst_Name() {
			return First_Name;
		}
		public void setFirst_Name(String first_Name) {
			First_Name = first_Name;
		}
		public String getLast_Name() {
			return Last_Name;
		}
		public void setLast_Name(String last_Name) {
			Last_Name = last_Name;
		}
		
}

