
public class Home {

	public static void main(String[] args) {
		Dog myDog = new Dog();
		String name = myDog.getName();
		System.out.println("A day in the lige of my dog "+name);
		myDog.wakeUp();
		myDog.feed();
		myDog.hear("ding-dong");
		myDog.hear("ding-dong");
		myDog.hear(name);
		myDog.hear("ding-dong");
		myDog.hear("ding-dong");
		myDog.feed();
		myDog.feed();
		
		System.out.println("\nNight-time...");
		myDog.sleep();
		myDog.feed();
		myDog.hear("ding-dong");
		myDog.wakeUp();
		
		System.out.println("\nAnother day...");
		myDog.hear("ding-dong");
		myDog.feed();
		myDog.feed();
		myDog.feed();
	}
	
}
