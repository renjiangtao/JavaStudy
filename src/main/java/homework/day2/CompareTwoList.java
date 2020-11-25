package homework.day2;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoList {


    public static void main(String[] args) {

        List<String> first = new ArrayList<>();
        first.add("a");
        first.add("b");
        first.add("c");
        first.add("d");
        first.add("e");
        first.add("f");
        first.add("g");


        List<String> second = new ArrayList<>();
        second.add("f");
        second.add("a");
        second.add("c");
        second.add("h");
        second.add("z");
        second.add("y");

        List<String> third = new ArrayList<>();
        third.add("ddd");

        List<String> fouth = new ArrayList<>();
//        first.addAll(second);
//        first.retainAll(second);
        second.retainAll(fouth);
        printArray(second);
    }

    public List<String> sameElements(List<String> sourceList,List<String> targetList){
        sourceList.retainAll(targetList);
        return sourceList;
    }


    public static void printArray(List<String> array){
        array.stream().forEach(System.out::println);
    }

}
