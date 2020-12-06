package homework.day6.singleton;

/**
 * 饱汉式
 *  饱汉式是只有在需要的时候才创建，节省空间
 *  但是实现的时候要注意线程安全
 */
public final class SingleDemo3 {
    private static SingleDemo3 singleDemo3;

    private SingleDemo3(){

    }

    public static SingleDemo3 get(){
        if (singleDemo3==null){
            synchronized (SingleDemo3.class){
                if (singleDemo3==null){
                    singleDemo3 = new SingleDemo3();
                }
            }
        }
        return singleDemo3;
    }
}
