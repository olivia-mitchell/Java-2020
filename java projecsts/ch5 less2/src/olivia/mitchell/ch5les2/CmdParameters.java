package olivia.mitchell.ch5les2;

public class CmdParameters {

	public static void main(String[] args) {
		
		//run configurations - Arguments
		
		int numArgs = args.length;
		
		if (numArgs > 0) {
			System.out.println(args[0]);
		}
		if (numArgs > 1) {
			System.out.println(args[1]);
		}
		if (numArgs > 2) {
			System.out.println(args[2]);
		}
		if (numArgs > 3) {
			System.out.println(args[3]);
		}
		if (numArgs > 4) {
			System.out.println(args[4]);
		}
		if (args[0].equals("Hello")) {
			System.out.println("hello to you");
		}
		
		
		
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		//System.out.println(args[2]);
		//System.out.println(args[3]);
		//System.out.println(args[4]);

	}

}
