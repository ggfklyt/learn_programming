import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class SquareNumber {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 });
		List<Integer> squaredNums = nums.stream()
			.map(num -> num * num)
			.collect(Collectors.toList());
		System.out.println(squaredNums);
	}
}
