package homework.day6.streamTest;


import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamCreater {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> integerStream = Stream.of(1);
        System.out.println("难道");
    }

    @Test
    public void TestCreate1() {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
    }

    @Test
    public void TestCreate2() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> integerStream = Stream.of(1);
    }

    @Test
    public void TestCreate3() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = integers.stream();
    }

    @Test
    public void TestCreate4() {
        Stream.generate(new Random()::nextDouble).limit(10).forEachOrdered(System.out::println);
        System.out.println("123");
    }
}
