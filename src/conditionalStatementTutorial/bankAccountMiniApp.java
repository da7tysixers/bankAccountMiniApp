package conditionalStatementTutorial;



public class bankAccountMiniApp {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		bankAccount newAccount = new bankAccount(4500);  //instance of bankAccount class
		
		System.out.print("Before deposit "); // before deposit
		newAccount.Display();				// object displays the current balance
		
		
		newAccount.accountDeposit(200.50);  // deposit amount
		newAccount.Display();
		
		// After a withdrawal is made.
		
		System.out.println("After Withdrawal is made");
		newAccount.accountWithdrawal(133.3);
		newAccount.Display();
	}

}
