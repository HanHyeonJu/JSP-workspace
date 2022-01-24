package todoApp.model;
// 가입할 때 사용할 자바빈 객체
public class User {
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	
	public User() {
		// 기본 생성자는 자바 반응용으로 필요(자바빈용)-setAttribute를 사용하려면 필수, DB에 저장되어 있는 데이터가 없을 때 필요
	}

	public User(String firstName, String lastName, String userName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
	}
	
	// 자바 빈 생성을 위해서는 getter setter 필수
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}		
}
