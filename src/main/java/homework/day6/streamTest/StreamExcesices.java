package homework.day6.streamTest;



import org.testng.annotations.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StreamExcesices {
    static List ints ;
    static List strings;
    static {
        ints = Arrays.asList(10,3,4,5,6,7);
        strings = Arrays.asList("abc","def","eef","erg","fca","abc");
    }

    @Test
    public void test(){
        ints.parallelStream().forEach(System.out::println);
        System.out.println("==============");
        ints.parallelStream().forEachOrdered(System.out::println);
    }

    @Test
    public void test2(){
        strings.stream().skip(1).forEach(System.out::println);
        strings.stream().limit(1).forEach(System.out::println);
        long count = strings.stream().count();
        System.out.println(count);
        Optional any = strings.stream().findAny();
        System.out.println(any.get());
        strings.stream().distinct().forEach(System.out::println);


    }


    @Test
    public void test3(){
        Map<String, Long> collect = (Map<String, Long>) strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
