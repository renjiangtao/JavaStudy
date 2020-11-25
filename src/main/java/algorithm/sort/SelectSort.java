package algorithm.sort;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {
        int[] array = new int[]{3,2,7,1,8,2,6,23,44,23};
        int[] ints = selectSortMethod(array);
        Arrays.stream(ints).forEach(System.out::println);
    }


    public static int[] selectSortMethod(int[] array){
        for (int i=0;i<array.length;i++){
            int minIndex = i;
            int minValue = array[i];
            for (int j=i+1;j<array.length;j++){
                if (minValue > array[j]){
                    minIndex = j;
                    minValue = array[j];
                }
            }

            if (i != minIndex){
                array[minIndex] = array[i];
                array[i]=minValue;
            }
        }
        return array;
    }
}
