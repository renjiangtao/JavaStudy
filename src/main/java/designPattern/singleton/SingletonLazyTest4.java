package designPattern.singleton;

/**
 * 懒汉式（双重检查方式）
 * 优点：使用这个方法的时候才会创建，起到lazy loading的效果，解决了线程不安全的问题
 * 缺定：
 *  比较好的一种方式
 */
public final class SingletonLazyTest4 {

    private SingletonLazyTest4() {

    }

    private static volatile SingletonLazyTest4 instance;

    //解决了线程不安全的问题
    public static SingletonLazyTest4 get() {
        if (instance == null) {
            synchronized (SingletonLazyTest4.class) {
                if (instance == null) {
                    {
                        instance = new SingletonLazyTest4();
                    }
                }
            }
        }
        return instance;
    }
}
