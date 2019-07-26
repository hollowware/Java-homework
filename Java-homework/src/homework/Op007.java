package homework;

public class Op007 {
	public static void main(String[] args) {
		humanKMI();
	}
	private static void humanKMI() {
		double myHeight = 1.87;
		double myWeight = 96;
		double yourKMI = myWeight / (myHeight * myHeight);
		System.out.format("%.2f%n", yourKMI);
	}
}
