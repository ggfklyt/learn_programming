public class AvgDemo {
	public static void main(String[] args) {
		Stats<Integer> ints = new Stats<Integer>(new Integer[]{ 1, 2, 3 });
		Stats<Double> doubles = new Stats<Double>(new Double[]{ 1.0, 2.0, 3.0 });

		System.out.println("ints average is " + ints.avg());
		System.out.println("doubles average is " + doubles.avg());
		System.out.println("equals = " + ints.sameAvg(doubles));
	}
}

class Stats<T extends Number> {
	private T[] nums;

	public Stats(T[] nums) {
		this.nums = nums;
	}

	public double avg() {
		double sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i].doubleValue();
		}
		return sum / nums.length;
	}

	public boolean sameAvg(Stats<?> stats) {
		return avg() == stats.avg();
	}
}
