import java.util.Scanner;
public class AverageOfThreeNumbers {
    public static int average(int n1,int n2,int n3){
        return (n1+n2+n3)/3;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no's");
        int v1=sc.nextInt(); 
        int v2=sc.nextInt();
        int v3=sc.nextInt();
        sc.close();
        int average=average(v1,v2,v3);
        System.out.println(average);
    }
}
