package in.co.oop.encapsulation;

public class TestAccount {

	public static void main(String[] args) {

		Account ac = new Account();

		ac.setNumber("785489624569");
		ac.setAccountType("Saving");
		ac.setBalance(5000000.00);

		System.out.println("Account Number = " + ac.getNumber());
		System.out.println("Account Types = " + ac.getAccountType());
		System.out.println("Balance = " + ac.getBalance());
		System.out.println("---------------------------------");

		Account ac1 = new Account();
		ac1.setNumber("5500402015523");
		ac1.setAccountType("Current");
		ac1.setBalance(500000);

		System.out.println("Account = " + ac1.getAccountType());
		System.out.println("Account = " + ac1.getNumber());
		System.out.println("Account = " + ac1.getBalance());

	}

}
