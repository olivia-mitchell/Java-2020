package olivia.mitchell.ch11;
import java.util.*;
public class Knight {
	private String name;
	
	public Knight() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String inputname = input.nextLine();
		setName(inputname);
	}
	
	public Knight(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}


}
