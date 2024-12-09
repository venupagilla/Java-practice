package week8;

import java.util.*;
public class CollectionArrayList {
    public static void main(String args[]){
        ArrayList<Integer> tim=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of elements you want to enter : ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" elements");
        while(n>0){
            tim.add(sc.nextInt());
            n--;
        }
        System.out.print(tim);
    }
}
