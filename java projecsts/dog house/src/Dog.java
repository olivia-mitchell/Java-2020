
public class Dog {
	private int numTimesFed = 0;
	private boolean sleeping = false;
	private String name = "Ruffer";
	
	public String getName() {
		return this.name;
	}
	
	public int getNumTimesFed() {
		return numTimesFed;
	}

	public int setNumTimesFed(int numTimesFed) {
		return this.numTimesFed = numTimesFed;
	}

	public boolean isSleeping() {
		return sleeping;
	}

	public boolean setSleeping (boolean sleeping) {
		return this.sleeping = sleeping;
	}

	public void wakeUp() {
		System.out.println("WAKING UP");
		this.sleeping = this.setSleeping(false);
		this.numTimesFed = this.setNumTimesFed(0);
	}
	
	public void sleep() {
		System.out.println("Sleeping");
		this.sleeping = setSleeping(true);
	}
	
	public void hear(String sound) {
		if (sleeping == true) {
			return;
		}
		else if (sound.equals(name)) {
			System.out.println("Wag Tail");
		}
		else if (sound.equals("ding-dong")) {
			System.out.println("BARK");
		}
		else {
			return;
		}
	}
	public void feed() {
		if (this.sleeping) {
			return;
		}
		else {
			this.numTimesFed ++;
			if (this.numTimesFed > 2) {
				System.out.println("yawn");
			}
			else {
				System.out.println("yummy");
			}
		}
	}

	public Dog() {
		
	}

}
