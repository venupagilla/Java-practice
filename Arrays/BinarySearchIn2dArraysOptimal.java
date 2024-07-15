import java.util.Arrays;

public class BinarySearchIn2dArraysOptimal {
    //This solution's time complexity is O(log n base 2)
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
        int row_len=array2.length;
        int col_len=array2[0].length;
        int low=0;
        int high=row_len*col_len-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row_num=mid/col_len;
            int col_num=mid%col_len;
            if(array2[row_num][col_num]==target){
                return new int[]{row_num,col_num};
            }
            else if(array2[row_num][col_num]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return new int[]{-1,-1};
        }
    }
