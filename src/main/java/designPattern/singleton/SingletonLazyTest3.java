package designPattern.singleton;

/**
 * 懒汉式
 *    优点：使用这个方法的时候才会创建，起到lazy loading的效果，线程安全
 *    缺定：解决不了线程不安全的问题
 *
 *    实际开发中不能使用，会创建多个实例
 */
public final class SingletonLazyTest3 {

    private SingletonLazyTest3(){

    }

    private static SingletonLazyTest3 instance;

    //解决了线程不安全的问题
    public static  SingletonLazyTest3 get(){
        if (instance==null){
            synchronized(SingletonLazyTest3.class){
                instance = new SingletonLazyTest3();
            }
        }
        return instance;
    }
}
