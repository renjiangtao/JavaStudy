package designPattern.decorator;

public class Decorator extends Drink{

    private Drink obj;

    public Decorator(Drink obj){
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice()+obj.cost();
    }

    @Override
    public String getDesc(){
        return super.getDesc()+" "+super.getPrice()+"&&"+obj.getDesc();
    }
}
