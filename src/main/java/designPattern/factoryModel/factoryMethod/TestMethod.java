package designPattern.factoryModel.factoryMethod;

import org.testng.annotations.Test;

public class TestMethod {

    @Test
    public void testMethod1(){
        OrderPizza orderPizza = new BJOrderPizza();
        Pizza2 cheese = orderPizza.createPizza("cheese");
        cheese.prepare();
        cheese.bake();
        cheese.cut();
        cheese.box();


        Pizza2 pegge = orderPizza.createPizza("pegget");
        pegge.prepare();
        pegge.bake();
        pegge.cut();
        pegge.box();
    }
}
