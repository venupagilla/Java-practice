import java.io.FileOutputStream;


class FileOutputStreamExample{
    public static void main(String args[]){
        try {
            FileOutputStream ex=new FileOutputStream("C:\\Users\\pagil\\OneDrive\\Desktop\\24075A6706 (1)\\24075A6706\\24075A6706\\6th week\\example.txt");
            ex.write(78);
            ex.close();
            System.out.println("Successfully closed the program");
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}