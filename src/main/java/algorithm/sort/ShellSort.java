package algorithm.sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] array = {8,9,1,7,2,3,5,4,6,0};
        int[] ints = shellSwapSort(array);
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));


        int[] ints1 = shellMoveSort(array);
        System.out.println("Arrays.toString(ints1) = " + Arrays.toString(ints));
    }

    public static int[] shellSwapSort(int[] array){
        for (int i=array.length/2;i>0;i=i/2){
            int temp = 0;
            for (int j=i+1;j<array.length;j++){
                for (int k=j-i;k>=0;k=k-i){
                    if (array[k]>array[k+i]){
                        temp = array[k];
                        array[k]=array[k+i];
                        array[k+i]=temp;
                    }
                }
            }
        }
        return array;
    }


    public static int[] shellMoveSort(int[] array){
        for (int gap=array.length/2;gap>0;gap/=2){
            for (int i=gap;i<array.length;i++){
                int j= i;
                int insertValue = array[i];
                if (array[j]<array[j-gap]){
                    while(j-gap>=0&&insertValue<array[j]){
                        array[j+gap]=array[j];
                        j-=gap;
                    }
                    array[j]=insertValue;
                }


            }
        }
        return array;
    }
}
