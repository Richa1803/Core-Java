package in.co.oop.encapsulation;

public class Account {

	private String number;
	private String accountType;
	private double balance;

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return this.balance;

	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}

	public void withdrowal(double amount) {
		if (amount > this.balance) {
			System.out.println("insufficint fund");
		} else {
			this.balance = this.balance - amount;
		}
	}

	public void payBill(double bill) {
		if (bill > this.balance) {
			System.out.println("insufficint balance");
		} else {
			this.balance = this.balance - bill;
			System.out.println("bill payment successfull");
		}

	}
	public void fundTransfer(Account reciver, double amount) {
		if(amount>this.balance) {
			System.out.println("insufficint balance");
		}else {
			this.balance = this.balance-amount;
			reciver.balance =reciver.balance+amount;
			System.out.println("Fund transfer successfully....");
		}
	}

}
