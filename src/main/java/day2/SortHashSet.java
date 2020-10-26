package day2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortHashSet {
    public static void main(String[] args) {
        HashSet<Integer> sets = new HashSet<>();
        sets.add(10);
        sets.add(23);
        sets.add(1);
        sets.add(4);
        sets.add(88);
        sets.add(77);
        sets.add(43);

        TreeSet treeSet = new TreeSet();
        treeSet.addAll(sets);
        System.out.println(treeSet);

    }


    public void sortSetAndPrint(Set set){
        TreeSet treeSet = new TreeSet();
        treeSet.addAll(set);
        System.out.println(treeSet);
    }
}
