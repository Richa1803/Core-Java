package in.co.oop.encapsulation;

public class TestAccount {

	public static void main(String[] args) {

		Account ac = new Account();

		ac.setNumber("785489624569");
		ac.setAccountType("Saving");
		ac.setBalance(5000);
		
		Account ac1 = new Account();
		ac1.setNumber("5500402015523");
		ac1.setAccountType("Current");
		ac1.setBalance(5000);

		System.out.println("---------------------------------");

		System.out.println("Account Number = " + ac.getNumber());
		System.out.println("Account Types = " + ac.getAccountType());
		System.out.println("Balance = " + ac.getBalance());
		ac.deposit(10000);
		System.out.println("new after deposit = " + ac.getBalance());
		ac.withdrowal(2000);
		
		System.out.println("new  withdrowal = " + ac.getBalance());
		ac.payBill(200);
		
		System.out.println(" after pay balance = " + ac.getBalance());
		
		ac.fundTransfer(ac1, 10000);
		System.out.println("Fund Transefer = " + ac.getBalance());


		System.out.println("---------------------------------");

		System.out.println("Account = " + ac1.getAccountType());
		System.out.println("Account = " + ac1.getNumber());
		System.out.println("Account = " + ac1.getBalance());
		
		ac.fundTransfer(ac1, 10000);
		//System.out.println("Fund Transefer = " + ac.getBalance());
		
		System.out.println("Recive fund amount  = " + ac1.getBalance());



	}

}
