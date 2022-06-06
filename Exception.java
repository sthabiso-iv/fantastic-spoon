import java.util.Arrays;

public class Exception {
	
	private static String accNumber = "1780306403";
	
	    public static void main(String[] args) {
	 
	        boolean validAccNumber = isValidAccNumber(accNumber);
	 
	        if(validAccNumber)
	        {
	            System.out.println(accNumber+" is valid as per luhn algorithm");
	        }
	        else
	        {
	            System.out.println(accNumber+" is not valid as per luhn algorithm");
	        }
	    }
	 
	    public static boolean isValidAccNumber(String accNumber)
	    {
	        // int array for processing the accNumber
	        int[] accIntArray=new int[accNumber.length()];
	 
	        for(int i=0;i<accNumber.length();i++)
	        {
	            char c= accNumber.charAt(i);
	           accIntArray[i]=  Integer.parseInt(""+c);
	        }
	 
	        for(int i=accIntArray.length-2;i>=0;i=i-2)
	        {
	            int num = accIntArray[i];
	            num = num * 2;  // step 1
	            if(num>9)
	            {
	                num = num%10 + num/10;  // step 2
	            }
	            accIntArray[i]=num;
	        }
	 
	        int sum = sumDigits(accIntArray);  // step 3
	 
	        System.out.println(sum);
	 
	        if(sum%10==0)  // step 4
	        {
	            return true;
	        }
	 
	        return false;
	 
	    }
	 
	    public static int sumDigits(int[] arr)
	    {
	        return Arrays.stream(arr).sum();
	    }
}
