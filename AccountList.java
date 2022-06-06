/**
 *
 * @author (32465092)
 * @version (28 May 2022)
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AccountList {

	public AccountList() {
		
	}
	//Arrays
	SavingsAccount saobjects[];{
		SavingsAccount("1678323452","Doe, J",500,250);
		SavingsAccount("1456723452","Doyle, C",340,500);
	}	
	
	ChequeAccount caobjects[];{
		ChequeAccount("2357964244","Peters, D",230,-50);
		ChequeAccount("2678975425","Shelley, M",-320,-500);
		ChequeAccount("2451348675","Peters, M",430,-450);
		ChequeAccount("2567843428","Greystoke, J",-320,-50);
	}
	private void ChequeAccount(String accNumber, String accHolder, int accBalance, int minAccBalance) {
		System.out.println("Account number " +accNumber +"of " +accHolder +"has balance" + accBalance +"and minimum balance " +minAccBalance);
		
	}
	private void SavingsAccount(String accNumber, String accHolder, int accBalance, int ovdLimit) {
		System.out.println("Account number " +accNumber +"of " +accHolder +"has balance" + accBalance +"and overdraft limit " +ovdLimit);
		
	}

	 
	public class ObjectIO {
	 
	    private static final String filepath="C:\\Users\\Mthokozisi Dhlamini\\eclipse-workspace\\Accounts28052022\\src\\ObjectWrite";
	 
	    public static void main(String args[]) {
	 
	        ObjectIO objectIO = new ObjectIO();
	 
	        ChequeAccount ChequeAccount = new ChequeAccount("John","Frost",22);
	        objectIO.WriteObjectToFile(ChequeAccount);
	    }
	 
	    public void WriteObjectToFile(Object serObj) {
	 
	        try {
	 
	            FileOutputStream fileOut = new FileOutputStream(filepath);
	            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
	            objectOut.writeObject(serObj);
	            objectOut.close();
	            System.out.println("The Object  was succesfully written to a file");
	 
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }
}
