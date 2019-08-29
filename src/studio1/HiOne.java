import support.cse131.ArgsProcessor;
public class HiOne {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("Enter x: ");
		int y = ap.nextInt("Enter y: ");
		int z = ap.nextInt("Enter z: ");
		boolean isOrdered;
		isOrdered = (x<y && x<z) || (x>y && x>z);
		System.out.println(isOrdered);
	}
}

