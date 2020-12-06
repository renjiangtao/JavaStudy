package designPattern.singleton;

/**
 * 懒汉式
 *    优点：使用这个方法的时候才会创建，起到lazy loading的效果，线程安全
 *    缺定：效率太低，每个线程在获取get方法的时候，都要进行同步
 */
public final class SingletonLazyTest2 {

    private SingletonLazyTest2(){

    }

    private static SingletonLazyTest2 instance;

    //解决了线程不安全的问题
    public static synchronized SingletonLazyTest2 get(){
        if (instance==null){
            instance = new SingletonLazyTest2();
        }
        return instance;
    }
}
