package homework;

public class Op004 {
	public static void main(String[] args) {
		printPi();
	}
	private static void printPi() {
		System.out.println("--------------System prints PI with 5 numbers after dot----------------");
		double pi = Math.PI;
		System.out.println(pi);
		System.out.format("%.5f%n", pi);
	}
}
