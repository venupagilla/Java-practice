import java.util.Arrays;
public class selection_sort{
    public static int[] selectionSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            int min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[min]>array[j]){
                    min=j;
                }
            }
            int temp=array[i];
            array[i]=array[min];
            array[min]=temp;
            
        }
        return array;
    }
    public static void main(String args[]){
        //declaring and defining an array
        int[] array={88,97,44,12,5};

        //printing the array without sorting
        System.out.print("Array before sorting : ");
        System.out.println(Arrays.toString(array));

        //calling the selection sort function and printing it as a string
        System.out.print("Array after sorting : ");
        System.out.println(Arrays.toString(selectionSort(array)));
        

    }
}