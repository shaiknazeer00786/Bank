package Bank;

public class Account {

	private String accounttype;

	public Account()
	{
		
	}
	public Account(String accounttype)
	{
		this.accounttype=accounttype;
	}
	public String getaccounttype()
	{
		return accounttype;
	}
	public void setAccountType(String accounttype)
	{
		this.accounttype=accounttype;
	}
}
