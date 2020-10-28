package day2.listUse;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {



    public static void main(String[] args) {
        ArrayListTest arrayListTest = new ArrayListTest();
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(19);
        //add 方法
        for (int i = 0; i < 10; i++) {

            arrayList.add(i);
        }
        arrayList.add(19);

//        arrayListTest.printList(arrayList);

        //清楚多余的list位置,实际数据内容没有变
        arrayList.trimToSize();
//        arrayListTest.printList(arrayList);


        int i = arrayList.indexOf(0);
        System.out.println(i);

        boolean containTrue = arrayList.contains(5);
        System.out.println(containTrue);

        boolean containFalse = arrayList.contains(50);
        System.out.println(containFalse);  //false

        boolean empty = arrayList.isEmpty();
        System.out.println(empty);  //false

        int i1 = arrayList.lastIndexOf(19);
        System.out.println(i1);

        List clone = (List)arrayList.clone();
        System.out.println(clone);

        arrayList.add(5,213);
//        System.out.println(arrayList.get(100));
        arrayListTest.printList(arrayList);

        System.out.println("==================");
        Object[] objects = arrayList.toArray();
        for (int i2 = 0; i2 < objects.length; i2++) {
            System.out.println(objects[i]);
        }
    }


    public void printList(List list){
        list.stream().forEach(System.out::println);
    }




}
