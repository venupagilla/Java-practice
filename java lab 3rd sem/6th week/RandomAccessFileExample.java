import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("sample.txt", "rw");
            file.writeUTF("Hello, World!");
            file.writeInt(2024);

            file.seek(0);
            System.out.println(file.readUTF());
            System.out.println(file.readInt());

            file.seek(0);
            file.writeUTF("Updated Message");

            file.seek(0);
            System.out.println(file.readUTF());
            System.out.println(file.readInt());

            file.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
