package main.java.com.itheima.homework.decorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        String description=super.getDescription();
        return description+"加摩卡";
    }

    @Override
    public int getCost() {
        int cost=super.getCost();
        return cost+10;
    }
}
