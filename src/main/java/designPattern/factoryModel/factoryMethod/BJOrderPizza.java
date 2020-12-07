package designPattern.factoryModel.factoryMethod;

public class BJOrderPizza extends OrderPizza{
    @Override
    public Pizza2 createPizza(String type) {
        Pizza2 pizza2 = null;
        if (type.equals("cheese")){
            pizza2 = new BJCheesePizza2();
        }else if (type.equals("pegget")){
            pizza2 = new BJPeggetPizza2();
        }else{
            System.out.println("没有这种pizza");
        }

        return pizza2;
    }
}
