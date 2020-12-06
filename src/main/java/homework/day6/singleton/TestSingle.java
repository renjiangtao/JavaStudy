package homework.day6.singleton;

public class TestSingle {

    public static void main(String[] args) {
//        SingleDemo singleDemo1 = SingleDemo.get();
//        SingleDemo singleDemo2 = SingleDemo.get();
//        System.out.println("singleDemo1 = " + singleDemo1);
//        System.out.println("singleDemo2 = " + singleDemo2);
//        System.out.println(singleDemo1==singleDemo2);
//
//
//
//        SingleDemo2 singleDemo21 = SingleDemo2.singleDemo2;
//        SingleDemo2 singleDemo22 = SingleDemo2.singleDemo2;
//        System.out.println("singleDemo21 = " + singleDemo21);
//        System.out.println("singleDemo22 = " + singleDemo22);
//        System.out.println(singleDemo21==singleDemo22);

//        SingleDemo3 singleDemo31 = SingleDemo3.get();
//        SingleDemo3 singleDemo32 = SingleDemo3.get();
//        System.out.println("singleDemo31 = " + singleDemo31);
//        System.out.println("singleDemo32 = " + singleDemo32);
//        System.out.println(singleDemo31==singleDemo32);

        SingleDemo4 singleDemo41 = SingleDemo4.INSTANCE;
        SingleDemo4 singleDemo42 = SingleDemo4.INSTANCE;
        System.out.println("singleDemo41 = " + singleDemo41);
        System.out.println("singleDemo42 = " + singleDemo42);
        System.out.println(singleDemo41==singleDemo42);
    }
}
