package homework.day6.singleton;

public final class SingleDemo {

    private SingleDemo() {

    }

    static class ClassLorder{
        private static final SingleDemo singleDemo = new SingleDemo();
    }

    public static SingleDemo get(){
        return ClassLorder.singleDemo;
    }

}
