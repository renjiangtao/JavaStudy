package designPattern.singleton;

/**
 * 最推荐使用的方式
 */
public class SingletonStaticInnerClass {

    private SingletonStaticInnerClass(){

    }

    public static SingletonStaticInnerClass get(){
        return SingletonInnerClass.INSTANCE;
    }


    private static class SingletonInnerClass{
        private static final SingletonStaticInnerClass INSTANCE = new SingletonStaticInnerClass();
    }

}
