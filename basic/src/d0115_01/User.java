package d0115_01;

public class User {
	private String id;
	private String password;
	
	User(String id, String password){
		this.id = id;
		this.password =password;
	}

	String getId() {
		return id;
	}

	void setId(String id) {
		this.id = id;
	}

	String getPassword() {
		return password;
	}

	void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "id: " + id + ", password : " + password;
	}
	
	
}
