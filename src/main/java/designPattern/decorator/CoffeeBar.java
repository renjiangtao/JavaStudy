package designPattern.decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        //装饰者模式下的订单：2份巧克力+1份牛奶的LongBlack

        Drink order = new LongBlack();
        System.out.println("单品咖啡"+order.getDesc()+" "+order.cost());

        //加一份牛奶
        order = new Milk(order);
        System.out.println("单品咖啡"+order.getDesc()+" "+order.cost());
    }
}
