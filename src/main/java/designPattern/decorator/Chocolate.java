package designPattern.decorator;

public class Chocolate extends Decorator{

    public Chocolate(Drink obj) {
        super(obj);
        setDesc("巧克力");
        setPrice(3.0f);   //当前调味品的价格
    }
}
