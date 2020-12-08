package homework.day6.factory;

import designPattern.factoryModel.abstractFactory.AbsFactory;

public class AnimalFactory {


    public static Animal createAnimal(String type){
        Animal animal = null;
        if (type.equals("cat")){
            animal = new Cat();
        }else if (type.equals("dog")){
            animal = new Dog();
        }else {
            System.out.println("No animal be created");
        }
        return animal;
    }
}
