package designPattern.factoryModel.abstractFactory;

public class LDPizzaFactory implements AbsFactory{



    @Override
    public Pizza3 createPizza(String type) {
        Pizza3 pizza3 = null;
        if (type.equals("cheese")){
            pizza3 = new LDCheesePizza3();
        }else if (type.equals("pegget")){
            pizza3 = new LDPeggetPizza3();
        }else {
            System.out.println(" no pizza3");
        }
        return pizza3;
    }
}
