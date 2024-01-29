import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class CountLettersDemo {
	public static void main(String[] args) {
		String str = "Hello world";
		List<String> letters = Arrays.stream(str.split(" "))
			.map(word -> word.split(""))
			.flatMap(Arrays::stream)
			.distinct()
			.collect(Collectors.toList());
		System.out.println(letters);
	}
}
