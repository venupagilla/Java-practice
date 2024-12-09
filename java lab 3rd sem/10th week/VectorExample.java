import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Date");
        vector.add("Elderberry");

        int index = 2; // Example index
        if (index >= 0 && index < vector.size()) {
            String element = vector.get(index);
            System.out.println("Element at index " + index + ": " + element);
        } else {
            System.out.println("Index out of bounds!");
        }
    }
}
