package main.java.com.itheima.pattern.bulider.demo1;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //建造
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        Bike bike = builder.createBike();
        return bike;
    }
}
