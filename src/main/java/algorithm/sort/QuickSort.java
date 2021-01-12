package algorithm.sort;


import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] array = {23, 10, 3, 9, 55, 32, 1,19,-2,55,23,14,46,0,9,-90};
        System.out.println("排序前Arrays.toString(array) = " + Arrays.toString(array));
        quickSort(array,0,array.length-1);
        System.out.println("==================================");
        System.out.println("排序后Arrays.toString(array) = " + Arrays.toString(array));

    }

    private static void quickSort(int[] array, int left, int right) {
        int l = left;
        int r = right;
        int pivot = array[(left + right) / 2];
        int temp = 0;
        while (true){
            while (array[l]<pivot){
                l++;
            }
            while (array[r]>pivot){
                r--;
            }
            //左侧和右侧相遇，直接退出循环
            if (l>=r){
                break;
            }
            temp = array[l];
            array[l] = array[r];
            array[r] = temp;

            if (array[l]==pivot){
                r--;
            }
            if (array[r]==pivot){
                l++;
            }
        }
        if (l==r){
            l++;
            r--;
        }
        if (left<r){
            quickSort(array,left,r);
        }
        if (l<right){
            quickSort(array,l,right);
        }
    }
}
