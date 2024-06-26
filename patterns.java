// Diamond pattern
// public class patterns {
//     public static void main(String args[]){
//         int l=0;
//         int p=50;
//         for(int i=l;i<p;i++){
//             for(int k=p;k>i;k--){
//                 System.out.print(" ");
//             }
//             for(int j=l;j<=i;j++){
//                 System.out.print("#");
//                 System.out.print("#");
//             }
//             System.out.println();
//         }
//         for(int i=l;i<p;i++){
//             for(int k=l;k<=i;k++){
//                 System.out.print(" ");
//             }
//             for(int j=p;j>i;j--){
//                 System.out.print("#");
//                 System.out.print("#");
//             }
//             System.out.println();
//         }
//     }
// }

//Hollow rectangle pattern
import java.util.Scanner;
public class patterns{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the no of rows : ");
        int rows=sc.nextInt();
        System.out.print("Enter the no of columns : ");
        int columns=sc.nextInt();
        sc.close();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=columns;j++){
                if(i==1 || i==rows || j==1 || j==columns){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}