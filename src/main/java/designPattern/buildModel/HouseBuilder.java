package designPattern.buildModel;

public abstract class HouseBuilder {

    protected  House house = new House();

    //将建造的流程写好

    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void buildRoofed();


    public House buildHouse(){
        return house;
    }

}
