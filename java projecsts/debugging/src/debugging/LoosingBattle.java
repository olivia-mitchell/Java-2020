package debugging;

public class LoosingBattle {

	public LoosingBattle() {
		System.out.println("Your lone hero is surrounded by a massive army of trolls.");
		System.out.println("Theier decaying green bodies strech out, melting into the horizon");
		System.out.println("Your hero unsheathes his sword for the last fight of his life.\n");
		
		int heroHealth = 100;
		int deadTrolls = 0;
		int trollDamage = 7;
		int heroDamage = 10;
		int trollHealth = 10;
		
		
		while (heroHealth >= 0) {
			int heroAttack = heroDamage;
			int trollAttack = trollDamage;
			heroHealth -= trollAttack;
			if (heroAttack >= trollHealth) {
				deadTrolls +=1;
				System.out.println("Your hero swings and defeats an evil troll,");
				System.out.println("but takes "+trollAttack+" damage point.\n");
			}
		}
		System.out.println("Your hero fought valiantly and defeated "+deadTrolls+" trolls.");
		System.out.println("But alas, your hero is no more.");
	}

	public static void main(String[] args) {
		new LoosingBattle();
	}

}
