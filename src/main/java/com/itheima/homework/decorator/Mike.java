package main.java.com.itheima.homework.decorator;

public class Mike extends CondimentDecorator {
    public Mike(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        String description=super.getDescription();
        return description+"加牛奶";
    }

    @Override
    public int getCost() {
        int cost=super.getCost();
        return cost+6;
    }
}