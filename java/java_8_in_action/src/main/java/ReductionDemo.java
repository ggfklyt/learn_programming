import java.util.Arrays;
import java.util.List;

public class ReductionDemo {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3);
		int sum = nums.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);
	}
}
