package algorithm.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{6, 18, -7, 2, 19, 66};

        int temp = 0;


        for (int i=0;i<array.length-1;i++){
            for (int j = 0; j < array.length - 1-i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        printArray(array);

    }

    public static void printArray(int[] array){
        for (int i:array){
            System.out.print(i+" ");
        }
    }
}
