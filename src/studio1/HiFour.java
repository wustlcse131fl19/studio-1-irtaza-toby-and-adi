import support.cse131.ArgsProcessor;
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String Name1 = ap.nextString("Enter name 1 ");
		String Name2 = ap.nextString("Enter name 2");
		String Name3 = ap.nextString("Enter name 3");
		String Name4 = ap.nextString("Enter name 4");
		System.out.println("Greetings," + Name1 + "," + Name2 + "," + Name3 + "," + Name4);
	}
}

