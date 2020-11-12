package olivia.mitchell.ch6lesson1;
import java.util.*;

public class Ch6lesson1 {

	
	
	public Ch6lesson1() {
		Scanner input = new Scanner(System.in);
		/*
		System.out.print("Type your name and press enter: ");
		String username = input.nextLine();
		
		System.out.print("Type your name and press enter: ");
		int userage = input.nextInt();
		userage+=5;
		input.nextLine();
		
		System.out.print("Type you job title and press enter: ");
		String jobtitle = input.nextLine();
		
		System.out.print("Type a boolean and press enter: ");
		boolean inputbool = input.nextBoolean();
		
		System.out.print("Type a double and press enter: ");
		double inputdub = input.nextDouble();
		
		System.out.println("Hello " +username);
		System.out.println("You will be " +userage+ " in five years");
		System.out.println("your job is " +jobtitle);
		
		System.out.println("test bool " + inputbool);
		System.out.println("test dub " + inputdub);	
		
		//converting integer to string
		String num = Integer.toString(5555);
		
		String test2 = "age " +userage;
		System.out.println(test2);
		*/
		
		System.out.println("enter a number");
		String test2 = input.nextLine();
		
		int int2 = Integer.parseInt(test2);
		int2+=42;
		
		System.out.println(int2);
		
		
	}

	public static void main(String[] args) {
		new Ch6lesson1();
	}
}
