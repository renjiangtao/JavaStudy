package designPattern.singleton;

import java.util.Random;

public enum SingletonEnum {
    INSTANCE;

    public String getRandomInt(){
        Random random = new Random();
        return random.nextInt()+"";
    }
}
