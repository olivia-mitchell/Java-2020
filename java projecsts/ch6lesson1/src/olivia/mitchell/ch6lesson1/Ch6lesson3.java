package olivia.mitchell.ch6lesson1;
import java.util.*;

public class Ch6lesson3 {

	public Ch6lesson3() {
		Scanner input = new Scanner(System.in);
		double gpa;
		
		
		gpa = 0.0;
		boolean good = input.hasNextDouble();
		if (good) {
			gpa = input.nextDouble();
		}
		else {
			while(good == true) {
				input.nextLine();
				System.out.print("Not a Good Value");
				System.out.print("Enter Your GPA and Press Enter: ");
				good = input.hasNextDouble();
				if (good == true) {
					gpa = input.nextDouble();
				}
			}
		}

							/*
							notes relational operators
							<
							a>b
							<=
							>=
							= assignment
							== comparison
							!=
							&& and
							|| or
							! not
							*/
								
		//System.out.println("Your GPA is " +gpa);
		
		/*
		 * 		if(input.hasNextDouble()) {
			gpa = input.nextDouble();
			input.nextLine();
		}
		else {
			System.out.println("That Wasn't Good");
			gpa = 0.1;
		}
		*/
		
		input.close();
	}

	public static void main(String[] args) {
		new Ch6lesson3();

	}

}
