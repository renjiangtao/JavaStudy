package designPattern.buildModel;

public class Client {

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();

        HouseDiertor houseDiertor = new HouseDiertor(commonHouse);

        House house = houseDiertor.constructHouse();

        System.out.println(house);
    }
}
