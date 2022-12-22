package Bank;

public class BAnk {

	private String bankname;
	private int IFSCcode;
	private String branch;
	private User u;
	int balance=0;
	public BAnk()
	{
		
	}
	public BAnk(String bankname, int iFSCcode, String branch) 
	{
		this.bankname = bankname;
		this.IFSCcode = iFSCcode;
		this.branch = branch;
	}
	private String getBankname() {
		return bankname;
	}
	private void setBankname(String bankname) {
		this.bankname = bankname;
	}
	private int getIFSCcode() {
		return IFSCcode;
	}
	private void setIFSCcode(int iFSCcode) {
		IFSCcode = iFSCcode;
	}
	private String getBranch() {
		return branch;
	}
	private void setBranch(String branch) {
		this.branch = branch;
	}
	User getU() {
		return u;
	}
	void setU(User u) {
		this.u = u;
	}
	private int getBalance() {
		return balance;
	}
	private void setBalance(int balance) {
		this.balance = balance;
	}
	public void bankDeatils()
	{
		System.out.println("Name of the Bank : "+getBankname());
		System.out.println("the Branch Name is : "+getBranch());
		System.out.println("IFSC code is : "+getIFSCcode());
	}
	public void createUser(User u)
	{
		if(this.u==null)
		{
			this.u=u;
		}
		else
		{
			System.out.println("User not created ....!!!!!");
		}
	}
	public void deposite(int amount)
	{
		balance=balance+amount;
		System.out.println("current balance is : "+balance);
	}
	public void withdraw(int amount)
	{
		balance=balance-amount;
		System.out.println("After withdrwing the current balance is : "+balance);
	}
}
