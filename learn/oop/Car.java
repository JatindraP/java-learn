package learn.oop;

public class Car {
    private String brand;
    private int price;
     
    public Car(String brand,int price){
        this.brand=brand;
        this.price=price;
    }

    public String getBrand(){
        return this.brand;
    }
    public int getPrice(){
        return this.price;
    }
}
