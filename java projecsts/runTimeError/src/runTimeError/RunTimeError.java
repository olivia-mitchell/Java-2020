package runTimeError;

public class RunTimeError {
	
	public static void main(String[] args) 
	{
	    // initialize some variables
	    int numerator = 14;
	    int denominator1 = 3 + 5;   // do some math
	    int denominator2 = 7;

	    // result is "numerator divided by (denominator1 minus denominator2)"
    	int result = numerator / (denominator1 - denominator2);   
    	System.out.println("result is: " + result);

		String myString = " ";
		int length = myString.length();
		System.out.println("String length = " + length);

	}


}
