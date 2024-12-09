import java.io.FileInputStream;
public class FileInputStreammultiple {
    public static void main(String args[]){
        try {
            FileInputStream fp=new FileInputStream("C:\\Users\\pagil\\OneDrive\\Desktop\\24075A6706 (1)\\24075A6706\\24075A6706\\6th week\\stringexample.txt");
            int i=0;
            while((i=fp.read())!=-1){
                System.out.print((char)i);
            }
            fp.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
