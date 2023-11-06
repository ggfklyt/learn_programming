import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("Input x!");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println("Square x is " + x * x);
	}
}
