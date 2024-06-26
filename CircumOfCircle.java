import java.util.Scanner;

public class CircumOfCircle {
    public static void great(int n1,int n2){
        if(n1>n2){
            System.out.println(n1 + " is greater than " + n2);
        }
        else{
            System.out.println(n2 + " is greater than " + n1);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int v1=sc.nextInt();
        System.out.println("Enter the second numer");
        int v2=sc.nextInt();
        sc.close();
        great(v1, v2);
    }
}
