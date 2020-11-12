package lesson2act;

public class AtringMethods {

	public AtringMethods() {
		String let ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		//String name =
	
		String myString2 = "moon";
		String myString3 = "Moon";
		String test1 = myString2.toUpperCase();
		String test2 = myString3.toLowerCase();
		System.out.println(test1);
		System.out.println(test2);
		
		String newtest = myString2.replace("o", "z");
		String newsub = let.substring(7,12);
		
		int lastO = myString3.lastIndexOf("O");
		System.out.println(newsub);
		System.out.println(newtest);
		System.out.println(lastO);
		System.out.println(let.length());
		
		int first = let.indexOf("O");
		int second = let.indexOf("L");
		int third = let.indexOf("I");
		int forth = let.indexOf("V");
		int fith = let.indexOf("I");
		int sixth = let.indexOf("A");
		
		char one = let.charAt(14);
		char two = let.charAt(11);
		char three = let.charAt(8);
		char four = let.charAt(21);
		char five = let.charAt(8);
		char six = let.charAt(0);
		
		System.out.print(one);
		System.out.print(two);
		System.out.print(three);
		System.out.print(four);
		System.out.print(five);
		System.out.println(six);
		
		System.out.print(first);
		System.out.print(second);
		System.out.print(third);
		System.out.print(forth);
		System.out.print(fith);
		System.out.print(sixth);
	}

	public static void main(String[] args) {
		new AtringMethods();

	}

}
