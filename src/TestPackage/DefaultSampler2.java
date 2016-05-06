package TestPackage;
public class DefaultSampler2 implements Sampler {
	public double read() {
		System.out.println("Sin function!");
		return Math.sin(Math.random()) *100;
	}
}