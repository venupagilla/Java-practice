import java.io.FileInputStream;
public class FileInputStreamSingleChar {
    public static void main(String args[]){
    try{
        FileInputStream fp=new FileInputStream("C:\\Users\\pagil\\OneDrive\\Desktop\\24075A6706 (1)\\24075A6706\\24075A6706\\6th week\\example.txt");
        int n=fp.read();
        fp.close();
        System.out.println((char)n);
    } catch (Exception e){
        System.out.println(e);
    }
}
}
