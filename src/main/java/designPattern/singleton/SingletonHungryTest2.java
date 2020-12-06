package designPattern.singleton;

public class SingletonHungryTest2 {

    private SingletonHungryTest2(){

    }

    private static SingletonHungryTest2 instance;

    //类装载的时候就会执行静态代码块
    static {  //在静态代码块中创建单例对象
        instance = new SingletonHungryTest2();
    }

    //提供一个公用的静态方法创建对象
    public static SingletonHungryTest2 get(){
        return instance;
    }
}
