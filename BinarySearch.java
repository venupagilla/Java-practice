import java.util.Arrays;

public class BinarySearch {
    static int binarySearch2(int[] array2,int target){
        int start=0;
        int end=array2.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(array2[mid]<target){
                start=mid+1;
            }else if(array2[mid]>target){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        //declaring and defining an array
        int[] array={88,5,8987,56,9897};
        System.out.println("Before sorting : "+Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After sorting : "+Arrays.toString(array));
        System.out.println("Target is located at : "+binarySearch2(array,8987));

    }
}
