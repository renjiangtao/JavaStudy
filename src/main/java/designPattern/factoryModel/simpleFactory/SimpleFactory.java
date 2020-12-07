package designPattern.factoryModel.simpleFactory;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleFactory {


    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Pizza chinaPizza = simpleFactory.createPizza("chinaPizza");
        chinaPizza.prepare();
        chinaPizza.bake();
        chinaPizza.cut();
        chinaPizza.box();
    }



    public Pizza createPizza(String type){
        Pizza pizza = null;

        do {
            type = getType();
            if (type.equals("chinaPizza")){
                pizza = new ChinaPizza();
                break;
            }else if(type.equals("usaPizza")){
                pizza = new USAPizza();
                break;
            }
        }while (true);

        return pizza;
    }

    private String getType() {
        System.out.println("please input pizza type");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}
