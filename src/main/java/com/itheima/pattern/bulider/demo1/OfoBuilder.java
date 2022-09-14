package main.java.com.itheima.pattern.bulider.demo1;

public class OfoBuilder extends Builder {


    @Override
    public void buildFrame() {
       mbike.setSeat("碳纤维");
    }

    @Override
    public void buildSeat() {
        mbike.setSeat("香蕉座位");
    }

    @Override
    public Bike createBike() {
        return mbike;
    }
}
