package collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void listExample() {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
