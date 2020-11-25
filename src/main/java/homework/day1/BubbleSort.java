package homework.day1;

import java.util.stream.Stream;

public class BubbleSort {


    //将一组无序的数组的按照从小到大排列
    public int[] mpSort(int[] arr) {

        //如果数组是空的,直接返回空数组就好了
        if (arr.length == 0) {
            return arr;
        }
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    //优化冒泡排序算法
    //在传入的数组的顺序后面一部分本来就是正确的情况下,可以提高效率
    public int[] mpSort2(int[] arr) {

        //如果数组是空的,直接返回空数组就好了
        if (arr.length == 0) {
            return arr;
        }
        int temp;
        boolean flag;
        //每次都从第一个数值进行比较,如果第一个数值比第二个数值大,交换位置,反之,不交换位置
        for(int i=arr.length;i<0;i--){
            flag = true;
            for (int j=0;j<i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    //说明本次比较中有过交换数值
                    flag = false;
                }
            }
            if(flag){
                return arr;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
//        int[] arr = new int[]{9,4,2,8,44,24,76,88,3,5,2,4,6,1,22,82,88};
        int[] arr = Stream.iterate(0,i->i=i+1).limit(10000).mapToInt(Integer::valueOf).toArray();
        BubbleSort bubbleSort = new BubbleSort();
        long startTime=System.currentTimeMillis();            //获得当前时间
        int[] result = bubbleSort.mpSort(arr);
        long endTime=System.currentTimeMillis();            //获得当前时间
        System.out.println("方法一总共耗费时长="+(endTime-startTime));
//        for (int i=0;i<result.length;i++){
//            System.out.printf("%d\t",result[i]);
//        }

        System.out.println();
        System.out.println("=================================");
        System.out.println("优化后的冒泡排序算法");
        System.out.println("=================================");
        startTime=System.currentTimeMillis();
        int[] sort2 = bubbleSort.mpSort2(arr);
        endTime=System.currentTimeMillis();
        System.out.println("方法二总共耗费时长="+(endTime-startTime));
//        for (int i=0;i<sort2.length;i++){
//            System.out.printf("%d\t",result[i]);
//        }
    }
}
