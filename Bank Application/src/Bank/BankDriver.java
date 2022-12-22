package Bank;

import java.util.Random;
import java.util.Scanner;

public class BankDriver 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		BAnk b=new BAnk();
		Random r=new Random();
		boolean start=true;
		while (start) 
		{
			System.out.println("welcome to the Bank");
			System.out.println("Select your options \n 1.create user \n 2.creat Account \n 3.deposite ");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1 :
			{
				System.out.println("Enter Account Holder Name : ");
				String accountHolderName=sc.next();
				System.out.println("Enter MobileNo : ");
				long mobileno=sc.nextLong();
				System.out.println("Enter Aadhar number");
				long aadhar=sc.nextLong();
				System.out.println("enter Age");
				int age=sc.nextInt();
				System.out.println("enter Gender");
				String gender=sc.next();
				b.setU(new User(accountHolderName,mobileno,aadhar,age,gender));
				System.out.println("Account Created Successfully....!!!!");
				break;
			}
			case 2 :
			{
				System.out.println("Enetr the Account Type");
				String Accounttype=sc.next();
				b.getU().setA(new Account(Accounttype));
				System.out.println("Account created Successfully");
				System.out.println("your Account Number Is : "+r.nextInt(10000000));
				break;
			}
			case 3 :
			{
				System.out.println("Enter the Deposite Amount");
				int amount=sc.nextInt();
				b.deposite(amount);
				break;
			}
			}
		}
	}
}
