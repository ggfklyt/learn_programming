import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class ListDistinctChars {
	public static void main(String[] args) {
		String str = "Hello world";
		List<String> distinctChars = Arrays.stream(str.split(" "))
			.map(word -> word.split(""))
			.flatMap(Arrays::stream)
			.distinct()
			.collect(Collectors.toList());
		System.out.println(distinctChars);
	}
} 
