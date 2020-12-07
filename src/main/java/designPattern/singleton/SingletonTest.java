package designPattern.singleton;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SingletonTest {

    @Test
    public void test1(){
        SingletonHungryTest instance = SingletonHungryTest.get();
        SingletonHungryTest instance2 = SingletonHungryTest.get();
        Assert.assertTrue(instance==instance2);
    }


    @Test
    public void test8(){
        SingletonEnum instance = SingletonEnum.INSTANCE;
        String randomInt = instance.getRandomInt();
        System.out.println(randomInt);
    }
}
