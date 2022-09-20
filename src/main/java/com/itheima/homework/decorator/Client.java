package main.java.com.itheima.homework.decorator;

public class Client {
    public static void main(String[] args) {
        Beverage beverage=new Espresso();
        System.out.println("饮料："+beverage.getDescription()+"\t"+"价格："+beverage.getCost());
        System.out.println("---------------------------------");
        Beverage mike=new Mike(beverage);
        System.out.println("饮料："+mike.getDescription()+"\t"+"价格："+mike.getCost());
        System.out.println("==================================");
        Beverage beverage_mo=new Mocha(beverage);
        System.out.println("饮料："+beverage_mo.getDescription()+"\t"+"价格："+beverage_mo.getCost());
    }
}
