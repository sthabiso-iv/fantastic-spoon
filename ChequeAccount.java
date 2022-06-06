/**
 .
 *
 * @author (32465092)
 * @version (28 May 2022)
 */

import java.util.Scanner;

public class ChequeAccount {


		public ChequeAccount() {
			System.out.println("Account no " +getAccNumber() +"of " +getAccHolder());
		}
		
		private String accNumber;
		private String accHolder;
		private static int accBalance;
		private static int ovdLimit;
		
		 //constructor method
		ChequeAccount(String accNumber, String accHolder, int accBalance, int ovdLimit){
			accHolder = getAccHolder();
			accNumber = getAccNumber();
			accBalance = getAccBalance();
			ovdLimit = getOvdLimit();
			
			
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
			ChequeAccount.accBalance = accBalance;
		}
		public static int getOvdLimit() {
			return ovdLimit;
		}
		public void setOvdLimit(int ovdLimit) {
			ChequeAccount.ovdLimit = ovdLimit;
		}
		
		//Calculate Interest Calculator
		public static void main(String args[]) 
	    {
		int accBalance = getAccBalance(), ovdLimit = getOvdLimit(), intRate, calculateInterest, zeroStat = 0;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter the interest rate: ");
			intRate = scan.nextInt();
		}
	    if (accBalance < ovdLimit) { calculateInterest = (accBalance * 4 * (intRate / 100));
	    System.out.print("The interest earned is: " +calculateInterest);
	    }
		else if (ovdLimit <= accBalance && accBalance < zeroStat) { calculateInterest = (accBalance * 4 * (intRate / 100));
	    System.out.print("The interest earned is: " +calculateInterest);
	    }
		else calculateInterest = (accBalance * (intRate / 100));
	    System.out.print("The interest earned is: " +calculateInterest);
	    }
	    

	}

