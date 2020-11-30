package algorithm.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] array = {8,0,4,5,7,8,3,2,1};
        mergeSort(array, 0, array.length-1);
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(array));
    }


    //拆分数组并且排序
    public static void mergeSort(int[] array, int left, int right) {
        int[] mergeArray = new int[array.length];
        while (left < right) {
            int middle = (left+right)/2;
            mergeSort(array,left,middle);
            mergeSort(array,middle+1,right);
            merge(array, left, middle, right);
        }

    }

    //合并两个有序数组
    public static void merge(int[] array, int left, int middle, int right) {
        int[] temp = new int[array.length];
        int tempRight = middle + 1;
        int tempLeft = left;
        int t = 0;

        //按照顺序将两个有序数组合并到一起
        while (tempLeft <= middle && tempRight <= right) {
            if (array[tempLeft] <= array[tempRight]) {   //第一个数组第一个数小于第二个数组的第一个数，就将小的数放在临时数组中
                temp[t] = array[tempLeft];
                t++;
                tempLeft++;
            } else {
                temp[t] = array[tempRight];
                t++;
                tempRight++;
            }
        }

        //如果循环完，之后第一个数据还没有结束，那么要把剩下的数组加入到数组最后
        while (tempLeft <= middle) {
            temp[t] = array[tempLeft];
            t++;
            tempLeft++;
        }

        while (tempRight <= right) {
            temp[t] = array[tempRight];
            t++;
            tempRight++;
        }

        tempLeft = left;
        t=0;
        while (tempLeft<=right){
            array[tempLeft]=temp[t];
            t++;
            tempLeft++;
        }
//        for (t = 0; t < temp.length; t++) {
//            array[left] = temp[t];
//            left++;
//        }

    }
}
