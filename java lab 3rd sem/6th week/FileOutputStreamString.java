import java.io.FileOutputStream;
import java.util.Scanner;
public class FileOutputStreamString {
    public static void main(String args[]){
        try {
            FileOutputStream ex=new FileOutputStream("C:\\Users\\pagil\\OneDrive\\Desktop\\24075A6706 (1)\\24075A6706\\24075A6706\\6th week\\stringexample.txt");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the text you want to insert into the file");
            String s= sc.nextLine();
            byte b[]=s.getBytes();
            ex.write(b);
            ex.close();
            sc.close();
            System.out.println("Success fully written in the file");

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
