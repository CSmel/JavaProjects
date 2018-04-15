// This application will accept two variables from the SavingsAccountTest
// and perform a calculation to determine the interest rate.
// Once the calculations determine to appropriate interest rate, then 
// the new interest rate will be added to the initial balance.

public class SavingsAccount {
private static double annualInterestRate; // variable will hold the interest rate value
private double savingsBalance; // variable will hold the balance for each savings account balance
private String saver; // I used this variable to display the name of the account



public SavingsAccount( String saver, double newBalance) {
	this.saver = saver;
setSavingsBalance(newBalance);
}

public void setSavingsBalance(double newBalance) {
savingsBalance = newBalance;
	
}
// get the most recent savingsBalnce
public double getSavingsBalance() {
	return savingsBalance;
}

// A method that will calculate the current savings account and add the NEW interest rate to the NEW balance.
public double calculateMonthlyInterest() {
	double newInterest;
	newInterest = (annualInterestRate * savingsBalance) / 12;
	savingsBalance += newInterest;
	return newInterest;
}

// Return the string SAVER, so it can be displayed.
public String getSaverName() {
	return saver;
}

// This method will assign the appropriate interest rate when it is called.
public static double modifyInterestRate(double newAnnualInterestRate)
{ return annualInterestRate = newAnnualInterestRate;


}

}