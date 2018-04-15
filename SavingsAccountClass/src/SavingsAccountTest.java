
public class SavingsAccountTest {

	public static void main(String[] args) {
		System.out.println("Starting Balances");
		System.out.println("====================");
SavingsAccount s1 = new SavingsAccount("Saver1", 2000.00); // Saver variable, //savingsBalance
SavingsAccount s2 = new SavingsAccount("Saver2", 3000.00);

// Everything below just displays the output in a column format.

System.out.printf("%-10s  $%.2f%n",s1.getSaverName(), s1.getSavingsBalance());
System.out.printf("%-10s  $%.2f%n",s2.getSaverName(), s2.getSavingsBalance());
System.out.println("====================");
System.out.printf("%%4 Annual Interest Rate:%n");
System.out.format("%-10s %-10s %-10s%n", "Account", "Rate", "Balance");
SavingsAccount.modifyInterestRate(.04); // assign the %4 to the modifyInterestRate method.  This could also be done using a variable, instead of using integers.  
System.out.printf("%-10s $%-10.2f $%.2f%n", s1.getSaverName(),s1.calculateMonthlyInterest(),s1.getSavingsBalance());
System.out.printf("%-10s $%-10.2f $%.2f%n", s2.getSaverName(),s2.calculateMonthlyInterest(),s2.getSavingsBalance());
System.out.println("================================");
SavingsAccount.modifyInterestRate(.05); // assign the %5 to the modifyInterestRate method.

System.out.printf("%%5 Annual Interest Rate%n");
System.out.format("%-10s %-10s %-10s%n", "Account", "Rate", "Balance");
System.out.printf("%-10s $%-10.2f $%.2f%n", s1.getSaverName(),s1.calculateMonthlyInterest(),s1.getSavingsBalance());
System.out.printf("%-10s $%-10.2f $%.2f%n", s2.getSaverName(),s2.calculateMonthlyInterest(),s2.getSavingsBalance());
System.out.println("================================");
	}
	
}
