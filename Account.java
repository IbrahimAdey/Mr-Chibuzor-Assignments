public class Account{
	private double balance;
	private String name;
	private String AccountNumber;

	public Account(String name, String accountNumber, double balance){
			
		this.balance=balance;
		this.accountnumber=accountNumber;
		this.name=name;

}

public double getbalance(){
       return balance;

}

public String getAccountNumber(){
       return null;

}

public void withdraw(double amount){
       this.balance = balance - amount;

}

}