//This solution's time complexity is O(m+n)
import java.util.Arrays;
public class BinarySearchIn2dArray {
    public static void main(String args[]){
        int[][] array1={
            {10,20,30,40},
            {50,60,70,80},
            {90,100,110,120},
            {130,140,150,160}
        };
        System.out.println(Arrays.toString(binarysearching(array1,120)));
    }

    static int[] binarysearching(int[][] array2,int target){
        int row=0;
        int column=array2[0].length-1;
        while(row<array2.length && column>=0){
            if(array2[row][column]==target){
                return new int[]{row,column};
            }
            else if(target > array2[row][column]){
                row++;;
            }
            else{
                column--;
            }
        }
        return new int[]{-1,-1};
    }
}
