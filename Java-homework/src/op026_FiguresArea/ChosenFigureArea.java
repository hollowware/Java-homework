package op026_FiguresArea;

public class ChosenFigureArea extends AbstractFigure {
	
	double answer;

	@Override
	public void squareArea(int a) {
		answer = a * a;
		System.out.println("Square area is: " + answer);
	}

	@Override
	public void circleArea(int r) {
		answer = (r * r) * Math.PI;
		System.out.println("Circle area is: " + answer);
	}

	@Override
	public void rectangleArea(int a, int b) {
		answer = a * b;
		System.out.println("Square area is: " + answer);
	}

}
