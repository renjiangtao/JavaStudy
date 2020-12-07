package designPattern.factoryModel.abstractFactory;

public class BJPizzaFactory implements AbsFactory {


    @Override
    public Pizza3 createPizza(String type) {

        Pizza3 pizza3 = null;
        if (type.equals("cheese")) {
            pizza3 = new BJCheesePizza3();
        } else if (type.equals("pegget")) {
            pizza3 = new BJPeggetPizza3();
        } else {
            System.out.println(" no pizza3");
        }
        return pizza3;

    }
}
