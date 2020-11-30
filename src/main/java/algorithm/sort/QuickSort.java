package algorithm.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {23, 10, 3, 9, 55, 32, 1};
        int[] ints = quickSort(array, 0, array.length - 1);
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
    }

    public static int[] quickSort(int[] array, int left, int right) {
        int temp;
        int leftArrow = left;
        int rightArrow = right;
        int middleArrow = (left + right) / 2;
        while (leftArrow < rightArrow) {
            while (array[leftArrow] < array[middleArrow]) {
                leftArrow = leftArrow + 1;
            }
            while (array[rightArrow] > array[middleArrow]) {
                rightArrow = rightArrow - 1;
            }

            if (leftArrow >= rightArrow) {
                break;
            }
            temp = array[leftArrow];
            array[leftArrow] = array[rightArrow];
            array[rightArrow] = temp;
        }
//        if (array[leftArrow] == array[middleArrow]) {
//            leftArrow = leftArrow - 1;
//        }
//        if (array[rightArrow] == array[middleArrow] && rightArrow < right) {
//            rightArrow = rightArrow + 1;
//        }
//        if (leftArrow == rightArrow) {
//            leftArrow = leftArrow + 1;
//            rightArrow = rightArrow - 1;
//        }
//
//
//        if (left < rightArrow) {
//            quickSort(array, left, rightArrow);
//        }
//        if (right > leftArrow) {
//            quickSort(array, leftArrow, right);
//        }


        return array;
    }
}
