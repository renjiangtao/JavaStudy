package designPattern.singleton;

/**
 * 懒汉式
 *    优点：使用这个方法的时候才会创建，起到lazy loading的效果
 *    确定：线程不安全，同时多个线程一起创建的时候有概率出错
 *
 *    实际开发中不要使用这种方式
 */
public final class SingletonLazyTest {

    private SingletonLazyTest(){

    }

    private static SingletonLazyTest instance;

    public static SingletonLazyTest get(){
        if (instance==null){
            instance = new SingletonLazyTest();
        }
        return instance;
    }
}
