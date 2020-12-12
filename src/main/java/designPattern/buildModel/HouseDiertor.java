package designPattern.buildModel;

public class HouseDiertor {

    HouseBuilder houseBuilder = null;

    public HouseDiertor(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public HouseDiertor() {

    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //建造房子的流程
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.buildRoofed();
        return houseBuilder.buildHouse();
    }

}
