package designPattern.factoryModel.simpleFactory;

public class ChinaPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("chinaPizaa prepare");
    }
}
