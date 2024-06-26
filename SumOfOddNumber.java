import java.util.Scanner;

public class SumOfOddNumber{
    public static int sum(int n){
        int y=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                y=y+i;
            }
        }
        return y;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum no");
        int n=sc.nextInt();
        sc.close();
        int sum1=sum(n);
        System.out.println(sum1);

    }
}
