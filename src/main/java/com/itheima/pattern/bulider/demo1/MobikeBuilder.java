package main.java.com.itheima.pattern.bulider.demo1;

public class MobikeBuilder extends Builder {
    @Override
    public void buildFrame() {
        mbike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        mbike.setSeat("真皮座位");
    }

    @Override
    public Bike createBike() {
        return mbike;
    }
}
