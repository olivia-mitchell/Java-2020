package tempconv;
import java.util.*;

public class TempConverter {

	/**
	 * The FahrenheitToCelsius function will convert values from
	 * Fahrenheit to Celsius.
	 * @param tempText The Fahrenheit temperature value as a String
	 * 
	 */
	private static String FahrenheitToCelsius(String tempText)
	{
		// Create a variable to hold the Celsius value
		double celsiusTemp = 0;

		// Create a variable to hold the Fahrenheit value
		double fahrenheitTemp = 0;
		
		// Convert the String value to a Double and place the result
		// in our fahrenheitTemp variable
		fahrenheitTemp = Double.parseDouble(tempText);
		
		// Calculate the Celsius temperature
		celsiusTemp = (fahrenheitTemp - 32.0) * 5.0 / 9.0;
				
		// Return the result of the calculation
		return Double.toString(celsiusTemp);
	}
	
	/**
	 * The CelsiusToFahrenheit function will convert values from
	 *  Celsius to Fahrenheit.
	 * @param tempText The Celsius temperature value as a String
	 * 
	 */
	private static String CelsiusToFahrenheit(String tempText)
	{
		// Create a variable to hold the Fahrenheit value
		double fahrenheitTemp = 0;
		
		// Create a variable to hold the Celsius value
		double celsiusTemp = 0;
		
		// Convert the String value to a Double and place the result
		// in our celsiusTemp variable
		celsiusTemp = Double.parseDouble(tempText);
		
		// Calculate the Fahrenheit temperature value
		fahrenheitTemp = (celsiusTemp * 9.0 / 5.0) - 32.0;
					
		// Return the result of the calculation
		return Double.toString(fahrenheitTemp);
	}
	/**
	 * The main function will run the code for our program, which will 
	 * convert input temperature values from fahrenheit to celsius 
	 * and from celsius to fahrenheit. 
	 * @param args These are the command line arguments supplied to the program
	 * 
	 */
	public static void main(String[] args) 
	{
		// Create String variables to hold the user's information
		String temp = "";
		String celsiusTemp = "";
		String fahrenheitTemp = "";
		
		// Create a Scanner class variable to handle user input
		Scanner input = new Scanner(System.in);
		
		// Ask the user for a temperature in Fahrenheit
		// Place the result in a variable
		System.out.print("Enter a temperature in Fahrenheit: ");
		fahrenheitTemp = input.nextLine();
		
		// Convert the user's value from Fahrenheit to Celsius and output the result
		celsiusTemp = FahrenheitToCelsius(fahrenheitTemp);
		System.out.println("The temperature in Celsius is: " + celsiusTemp);

		// Print a blank line to the screen 
		System.out.println("");
		
		// Ask the user for a temperature in Celsius
		// Place the result in a variable
		System.out.print("Enter a temperature in Celsius: ");
		temp = input.nextLine();
		
		// Convert the user's value from Celsius to Fahrenheit and output the result
		fahrenheitTemp = CelsiusToFahrenheit(temp);
		System.out.println("The temperature in Fahrenheit is: " + fahrenheitTemp);
	}
	


}
