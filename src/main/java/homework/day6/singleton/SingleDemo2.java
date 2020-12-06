package homework.day6.singleton;

/**
 * 饿汉式创建单例
 *  饿汉式的缺点是类加载就会创建该类，无论是否使用
 */
public final class SingleDemo2 {
    public static final SingleDemo2 singleDemo2 = new SingleDemo2();

    private SingleDemo2(){

    }
}
