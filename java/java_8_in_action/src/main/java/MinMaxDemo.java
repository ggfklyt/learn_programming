import java.util.Arrays;
import java.util.List;

public class MinMaxDemo {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(17, 14, 10, 12);

		int min = nums.stream()
			.reduce(nums.get(0), Integer::min);
		System.out.println(min);
	}
}
