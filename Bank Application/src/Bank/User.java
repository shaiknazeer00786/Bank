package Bank;

public class User 
{

	private String username;
	private long mobileno;
	private long aadharno;
	private int age;
	private String gender;
	private Account a;

	public User(String username, long mobileno, long aadhar, int age, String gender)
	{
		this.username = username;
		this.mobileno = mobileno;
		this.aadharno = aadhar;
		this.age = age;
		this.gender = gender;
	}

	private String getUsername() {
		return username;
	}

	private void setUsername(String username) {
		this.username = username;
	}

	private long getMobileno() {
		return mobileno;
	}

	private void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	private long getAadharno() {
		return aadharno;
	}

	private void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}

	private int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	private String getGender() {
		return gender;
	}

	private void setGender(String gender) {
		this.gender = gender;
	}

	private Account getA() {
		return a;
	}

	void setA(Account a) {
		this.a = a;
	}

}
