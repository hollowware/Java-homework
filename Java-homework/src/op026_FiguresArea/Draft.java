package op026_FiguresArea;

public class Draft {
	
	private int a;
	private int b;
	private int r;
	private int answer1;
	private double answer;
	
	public void squareArea (int a) { // abstract classes. Abstract figure -> then construct figures.
		answer1 = a * a;
		System.out.println("Square area is: " + answer1);
	}
	
	public void circleArea (int r) {
		answer = (r * r) * Math.PI;
		System.out.println("Circle area is: " + answer);
	}
	
	public void rectangleArea(int a, int b) {
		answer1 = a * b;
		System.out.println("Rectangle area is: " + answer1);
	}
	
}
