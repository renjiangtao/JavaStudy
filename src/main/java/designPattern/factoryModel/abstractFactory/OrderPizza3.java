package designPattern.factoryModel.abstractFactory;

public class OrderPizza3 {

    AbsFactory factory;

    public OrderPizza3(AbsFactory factory){
        this.factory = factory;
    }


    public void orderPizza(String type){
        Pizza3 pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }



}
