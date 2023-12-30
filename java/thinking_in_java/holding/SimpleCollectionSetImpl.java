import java.util.*;

public class SimpleCollectionSetImpl {
	public static void main(String[] args) {
		Collection<Integer> nums = new HashSet<Integer>();
		for (int i = 0; i < 10; i++)
			nums.add(i);
		for (Integer num: nums)
			System.out.print(num + " ,");
	}
}
