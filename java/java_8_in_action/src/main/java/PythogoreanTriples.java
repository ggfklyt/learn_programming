import java.util.List;
import java.util.Math;
import java.util.stream.IntStream;
import java.util.Collectors;

public class PythogoreanTriples {
	public static void main(String[] args) {
		List<int[]> pairs = IntStream.rangeClosed(1, 100)
			.flatMap(a -> {
				IntStream.rangeClosed(1, 100)
				.filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
				.map(b -> new int[]{ a, b });
			})
			.collect(Collectors.toList());
	}
}
