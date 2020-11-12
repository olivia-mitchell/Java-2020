package olivia.mitchell.ch8lesson1;
import java.util.*;

public class ch1L8 {
	
	public ch1L8() {
		steve();
		print("hello");
		print(1);
		print(3.14);
		print(true);
		String x = input("will this work?");
		print(x);
		String y = input("testing a number input");
		print(y);

	}

	public static void main(String[] args) {
		new ch1L8();

	}
	
	public static String input(String question) {
		Scanner input = new Scanner(System.in);
		System.out.println(question);
		String x = input.nextLine();
		input.close();
		return x;
	}
	
	public static void steve() {
		System.out.println("my name is steve");
	}
	
	public static void print(Object x) {
		System.out.println(x);
	}

}
