package TestPackage;
public class DefaultSampler implements Sampler {
	public double read() {
		System.out.println("Cos function!");
		return Math.cos(Math.random()) * 100;
	}
}