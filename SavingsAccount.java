/**
 * A savings account earns interest if the balance is greater than the minimum balance.
 *
 * @author (32465092)
 * @version (28 May 2022)
 */

import java.util.Scanner;
public class SavingsAccount {


	public SavingsAccount() {
		System.out.println("Account no " +getAccNumber() +"of " +getAccHolder());
	}
	
	private String accNumber;
	private String accHolder;
	private static int accBalance;
	private static int minAccBalance;
	
	 //constructor method
	SavingsAccount(String accNumber, String accHolder, int accBalance, int minAccBalance){
		accHolder = getAccHolder();
		accNumber = getAccNumber();
		accBalance = getAccBalance();
		minAccBalance = getMinAccBalance();
		
	}
	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public static int getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(int accBalance) {
		SavingsAccount.accBalance = accBalance;
	}
	public static int getMinAccBalance() {
		return minAccBalance;
	}
	public static void setMinAccBalance(int minAccBalance) {
		SavingsAccount.minAccBalance = minAccBalance;
	}
	
	//Calculate Interest Calculator
	public static void main(String args[]) 
    {
	int accBalance = getAccBalance(), intRate, calculateInterest;
	try (Scanner scan = new Scanner(System.in)) {
		System.out.print("Enter the interest rate: ");
		intRate = scan.nextInt();
	}
    if (accBalance < minAccBalance) { calculateInterest = 0;
    System.out.print("The interest earned is: " +calculateInterest);
    }
	else calculateInterest = (accBalance * (intRate / 100));
    System.out.print("The interest earned is: " +calculateInterest);
    }
    

}
