public class Matrixmultiplication {
    public static void main(String args[]){
        int[][] arr1={{1,2,6},{3,4,8},{1,3,2}};
        int[][] arr2={{5,6,7},{5,7,8},{9,1,9}};
        int[][] arr3=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    arr3[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}