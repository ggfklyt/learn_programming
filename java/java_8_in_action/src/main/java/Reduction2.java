import java.util.List;
import java.util.Arrays;

public class Reduction2 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3);
		int sum = nums.stream()
			.reduce(0, Integer::sum);
		System.out.println(sum);
	}
}
