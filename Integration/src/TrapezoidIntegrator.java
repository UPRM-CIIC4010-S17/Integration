
public class TrapezoidIntegrator implements Integrator {
	
	public double integrate(Integrable f, double a, double b, long iterations) {
		double deltaX = Math.abs(b - a) / iterations;
		double sum = 0.0;
		double nextX = a;
		for (long i=0; i < iterations; i++) {
			double leftHeight = f.eval(nextX);
			double rightHeight = f.eval(nextX + deltaX);
			double nextArea = deltaX * ((leftHeight + rightHeight) / 2.0);
			sum += nextArea;
			nextX += deltaX;
		}
		return sum;
	}
}
