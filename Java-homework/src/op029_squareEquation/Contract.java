package op029_squareEquation;

public class Contract {
	
	double a = 0;
    double b = 0;
    double c = 0;
    double x1 = 0;
    double x2 = 0;
    double discriminant = 0;

    public Contract(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double Discriminant (double a, double b, double c){
        discriminant = Math.pow(b,2) - (4*a*c);
        return discriminant;
    }

    public void Answer(double a, double b, double discriminant){
        if (discriminant > 0){
            x1 = ((b*-1) + Math.sqrt(discriminant))/(2*a);
            x2 = ((b*-1) - Math.sqrt(discriminant))/(2*a);
            System.out.println("x1 = "+x1+"\nx2 = "+x2);
        }
        else if(discriminant == 0){
            x1 = (b*-1)/(2*a);
            System.out.println("x1 = "+x1);
        }
    }
}
