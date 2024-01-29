import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Pairs3 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5);

		List<int[]> pairs = list1.stream()
			.flatMap(n1 -> list2.stream()
					.map(n2 -> new int[]{ n1, n2 }))
			.collect(Collectors.toList());
		for (int[] pair: pairs) {
			for (int num: pair) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
