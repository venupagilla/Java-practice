import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopying {
    public static void main(String args[]){
        FileInputStream a1=null;
        FileOutputStream a2=null;
        try{
            a1=new FileInputStream("C:\\Users\\pagil\\OneDrive\\Desktop\\24075A6706 (1)\\24075A6706\\24075A6706\\6th week\\stringexample.txt");
            a2=new FileOutputStream("C:\\Users\\pagil\\OneDrive\\Desktop\\24075A6706 (1)\\24075A6706\\24075A6706\\6th week\\stringexample.txt");
            int i=0;
            while((i=a1.read())!=-1){
                a2.write(i);
            }
            System.out.println("copied successfully");
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
            if(a1!=null){
                a1.close();
            }
            if(a2!=null){
                a2.close();
            }
            }catch(Exception f){
                System.out.println(f);
            }
        }
    }
}
