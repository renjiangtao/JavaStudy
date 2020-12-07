package designPattern.factoryModel.simpleFactory;

public class USAPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("USAPizza = ");
    }
}
