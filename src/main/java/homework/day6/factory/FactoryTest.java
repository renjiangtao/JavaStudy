package homework.day6.factory;

import org.testng.annotations.Test;

public class FactoryTest {

    @Test
    public void test(){
        Animal cat = AnimalFactory.createAnimal("cat");
        System.out.println("cat.say() = " + cat.say());
    }

    @Test
    public void testDog(){
        Animal dog = AnimalFactory.createAnimal("dog");
        System.out.println("dog.say() = " + dog.say());
    }


    @Test
    public void testNo(){
        AnimalFactory.createAnimal("pig");

    }
}
