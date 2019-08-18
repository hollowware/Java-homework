package op029_quadraticEquation;

public class QuadraticEquation {
	
	private double a;
	private double b;
	private double c;

	public QuadraticEquation(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double determinant () {
		return Math.pow(b, 2) - (4 * a * c);
	}
	
	public void calculation () {
		double root1;
		double root2;
		if(determinant() > 0) {
			root1 = (-b + Math.sqrt(determinant())) / (2 * a);
			root2 = (-b - Math.sqrt(determinant())) / (2 * a);
			System.out.format("root1 = %.2f and root2 = %.2f", root1 , root2);
		}
    // Condition for real and equal roots
			else if(determinant() == 0) {
				root1 = root2 = -b / (2 * a);
				System.out.format("root1 = root2 = %.2f;", root1);
			}
    // If roots are not real
			else {
				double realPart = -b / (2 *a);
				double imaginaryPart = Math.sqrt(-determinant()) / (2 * a);
				System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
			}
		}
}
