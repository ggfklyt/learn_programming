public class SerializationDemo {
	public static void main(String[] args) {
		// if the file "MyGame.ser" doesn't exist, it wiil be created automatically
		// fileStream object knows how to connect to (and create) a file
		FileOutputStream fileStream = new FileOutputStream("MyGame.ser");
		ObjectOutputStream os = new ObjectOutputStream(fileStream);
		// os let's you write objects, but it can't directly connect to a file.
		// It needs to be fed 'a helper'. This is actually called 'chaining' one stream to another.
		os.writeObject(characterOne);
		os.writeObject(characterTwo);
		os.writeObject(characterThree);
		os.close())
	}
}
