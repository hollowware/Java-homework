package homework;

public class Op007 {
	public static void main(String[] args) {
		humanKMI();
	}
	private static void humanKMI() {
		System.out.println("--------------Method calculates your KMI----------------"); // what's wrong with this one, why he prints in-line???
		double myHeight = 1.87;
		double myWeight = 96;
		double yourKMI = myWeight / (myHeight * myHeight);
		System.out.format("%.2f%n", yourKMI);
	}
}
