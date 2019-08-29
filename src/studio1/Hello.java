import support.cse131.ArgsProcessor;
public class Hello {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String Name1 = ap.nextString("Please enter your name: ");
		System.out.println("Hi " + Name1 + " How are you?");
	}
}

