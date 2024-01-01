public class Pets {
    public static Pet[] createArray(int capacity) {
        Pet[] pets = new Pet[capacity];
        for (int i = 0; i < capacity; i++) {
            pets[i] = new Pet();
        }
        return pets;
    }
}