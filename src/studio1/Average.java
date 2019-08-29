import support.cse131.ArgsProcessor;
public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int x1 = ap.nextInt("number 1");
        int x2 = ap.nextInt("number 2");
        double sum = 0.0;
        sum = (x1+x2) / 2.0;
        System.out.println(sum);
    }
}