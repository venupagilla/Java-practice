import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(3, "Cherry");
        treeMap.put(4, "Date");
        treeMap.put(5, "Elderberry");

        int key = 3;  // Example key
        if (treeMap.containsKey(key)) {
            String value = treeMap.get(key);
            System.out.println("Value associated with key " + key + ": " + value);
        } else {
            System.out.println("Key not found!");
        }
    }
}
