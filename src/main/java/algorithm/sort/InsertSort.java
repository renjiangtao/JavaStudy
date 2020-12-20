package algorithm.sort;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 7, 1, 8, 2, 6, 23, 44, 23};
        int[] ints = insertSort(array);
        Arrays.stream(ints).forEach(System.out::println);

    }

    //测试汉子试试
    public static int[] insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int insertValue = array[i];
            int index = i - 1;
            while (index >= 0 && array[index] > insertValue) {
                array[index + 1] = array[index];
                index--;
            }

            if (index != i - 1) {
                array[index + 1] = insertValue;
            }
        }
        return array;
    }
}
