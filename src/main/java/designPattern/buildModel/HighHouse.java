package designPattern.buildModel;

public class HighHouse extends HouseBuilder{


    @Override
    public void buildBasic() {
        System.out.println("高楼房子打地基50米");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼房子砌墙100米");
    }

    @Override
    public void buildRoofed() {
        System.out.println("高楼房子搭屋顶20米");
    }
}
