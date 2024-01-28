import java.util.Arrays;
import java.util.List;

public class Counter {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 5);
		int count = nums.stream()
			.map(num -> 1)
			.reduce(0, Integer::sum);
		System.out.println(count);
	}
}
