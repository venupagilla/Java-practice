package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void setExample() {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");

        for (String item : set) {
            System.out.println(item);
        }
    }
}
