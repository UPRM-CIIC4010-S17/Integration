
public class Main {
	public static void main(String[] args) {

		Integrator i = new TrapezoidIntegrator();

		Integrable sqrt = new SquareRootFunction();

		Integrable square = new SquareFunction();

		double result1 = i.integrate(sqrt, 0.0, 2.0, 1000);

		double result2 = i.integrate(
				new Integrable() { 
					public double eval(double x) {
						return Math.sqrt(x);
					}
				},

				0.0, 2.0, 1000);

		double result3 = i.integrate(x -> Math.sqrt(x), 0.0, 2.0, 1000);

		double result4 = i.integrate(x -> (x * x - x + 1), 0.0, 2.0, 1000);

		double result5 = i.integrate(square, 0.0, 2.0, 1000);

		double result6 = i.integrate(x -> (0.0 / 0.0), 0.0, 2.0, 1000);

		System.out.println(result6);
		
		System.out.println("Integral of square root from 0 to 2 = " + result1);
		System.out.println("Integral of square from 0 to 2 = " + result2);

	}
}
