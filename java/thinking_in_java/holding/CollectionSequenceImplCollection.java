import java.util.Collection;
import java.util.Iterator;

public class CollectionSequenceImplCollection implements Collection<Pet> {
    private Pet[] pets = Pets.createArray(8);

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            public boolean hasNext() {
                return pets.length > index;
            }

            public Pet next() {
                return pets[index++];
            }
        };
    }

    public void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {

    }
}
