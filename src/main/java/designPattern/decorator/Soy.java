package designPattern.decorator;

public class Soy extends Decorator{

    public Soy(Drink obj) {
        super(obj);
        setDesc("豆浆");
        setPrice(1.5f);   //当前调味品的价格
    }
}
