package olivia.mitchell.ch11;

public class NewKnight {

	public NewKnight() {
		Knight knight1 = new Knight();
		Knight knight2 = new Knight("Olivia");
		System.out.println(knight1.getName());
		System.out.println(knight2.getName());
	}

	public static void main(String[] args) {
		new NewKnight();

	}

}
