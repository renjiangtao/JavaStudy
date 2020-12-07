package designPattern.factoryModel.abstractFactory;

public abstract class Pizza3 {


    public abstract void prepare();

    public void bake(){
        System.out.println("bake");
    }

    public void cut(){
        System.out.println("cut");
    }

    public void box(){
        System.out.println("box");
    }
}
