package main.java.com.itheima.pattern.bulider.demo1;

//这个可以说是生产零件的人  加工零件，组装零件；之后由指挥者指挥，产品诞生
public abstract class Builder {
    protected Bike mbike= new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();
    //构建自行车的方法
    public abstract Bike createBike();

}
