package main.java.com.itheima.homework.decorator;

public class Espresso extends Beverage {
    @Override
    public String getDescription() {
        return "浓缩咖啡";
    }

    @Override
    public int getCost() {
        return 25;
    }
}
