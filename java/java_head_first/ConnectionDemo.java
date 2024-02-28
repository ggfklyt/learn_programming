public class ConnectionDemo {
	public static void main(String[] args) {
		Socket chatSocket = new Socket("127.0.0.1", 5000);
		InputStreamReader stream = new InputStreamReader(chatSocket.getInputStream());
		BufferReader reader = new BufferedReader(stream);
		String message = reader.readLine();
		
		PrintWriter writer = new PrintWriter(chatSocket.getOutputStream());
		writer.println("message to send");
		writer.print("another mesage");
	}
}
