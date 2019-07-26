package homework;

public class Op005 {
	public static void main(String[] args) {
		yourWeightOnOtherPlanets();
	}
	private static void yourWeightOnOtherPlanets() {
		double myWeightOnEarth = 96;
		double myWeightOnMercury = myWeightOnEarth * 0.38;
		double myWeightOnVenus = myWeightOnEarth * 0.91;
		double myWeightOnMars = myWeightOnEarth * 0.38;
		double myWeightOnJupiter = myWeightOnEarth * 2.34;
		double myWeightOnSaturn = myWeightOnEarth * 1.06;
		double myWeightOnUranus = myWeightOnEarth * 0.92;
		double myWeightOnNeptune = myWeightOnEarth * 1.19;
		double myWeightOnPluto = myWeightOnEarth * 0.06;
		System.out.format("Your weight on the Mercury is %.2f%n", myWeightOnMercury);
		System.out.format("Your weight on the Venus is %.2f%n", myWeightOnVenus);
		System.out.format("Your weight on the Mars is %.2f%n", myWeightOnMars);
		System.out.format("Your weight on the Jupiter is %.2f%n", myWeightOnJupiter);
		System.out.format("Your weight on the Saturn is %.2f%n", myWeightOnSaturn);
		System.out.format("Your weight on the Uranus is %.2f%n", myWeightOnUranus);
		System.out.format("Your weight on the Neptune is %.2f%n", myWeightOnNeptune);
		System.out.format("Your weight on the Pluto is %.2f%n", myWeightOnPluto);
	}
}
