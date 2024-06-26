import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Bufferedreader1 {
    public static void main(String args[]) throws IOException{
        BufferedReader koushik=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first number : ");
        int num1=Integer.parseInt(koushik.readLine());
        System.out.println("Enter the second number : ");
        int num2=Integer.parseInt(koushik.readLine());
        System.out.println("Addition is : "+  (num1+num2) );
        System.out.println("subtraction is : "+ (num1-num2) );
        System.out.println("multiplication is : " + (num1*num2) );
        System.out.println("division is : " + (num1/num2) );
    }
}
