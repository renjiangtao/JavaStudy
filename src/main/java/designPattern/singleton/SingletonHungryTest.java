package designPattern.singleton;

/**
 * 饿汉式
 *    缺点：在类装载的时候就完成了实例化，没有达到lazy loading的效果，如果从始至终从未使用过这个实例，会造成内存浪费
 *    优点：写法简单，在类装在的时候完成实例化，避免了线程同步问题
 */
public final class SingletonHungryTest {
    private SingletonHungryTest(){

    }

    private static SingletonHungryTest singleton = new SingletonHungryTest();

    public static SingletonHungryTest get(){
        return singleton;
    }
}
