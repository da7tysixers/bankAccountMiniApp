package conditionalStatementTutorial;

public class bankAccount {

  private double balance;  // created a variable for original balance
	
	public bankAccount(double amount) {  // constructor sets the input amount
		
		balance = amount;
	}
	
	/* 
	 * This method/function displays the final amount after deposit 
	 * or withdrawal is made to this account.
	 * */
	public void Display() {
		
		System.out.println("Balance = $"+balance);
		
	}
	
	// deposit method
	public void accountDeposit(double deposit) {
		
		// deposit variable
		balance = (balance + deposit);
	}
	 
	// withdrawal method that calculate the withdrawal made.
	public void accountWithdrawal(double withdrawal) {
		
		balance = balance - withdrawal;
		
	}
}
