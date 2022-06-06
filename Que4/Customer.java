package Que4;

public class Customer {

	private String username;
	private String password;
	private String mobileNumber;
	private String email;
	
	public Customer(String n , String p , String m, String e){
		this.username=n;
		this.password=p;
		this.mobileNumber=m;
		this.email=e;
	}
	
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getEmail() {
		return email;
	}
	
	
}
