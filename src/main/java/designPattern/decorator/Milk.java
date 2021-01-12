package designPattern.decorator;

public class Milk extends Decorator{
    public Milk(Drink obj) {
        super(obj);
        setDesc("牛奶");
        setPrice(2.0f);   //当前调味品的价格
    }
}
