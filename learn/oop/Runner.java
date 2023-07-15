package learn.oop;

public class Runner {
    public static void main(String[] args){
        Car myCar = new Car("Maruti",1000000);
        System.out.println("My Car brand is : "+myCar.getBrand());
        System.out.println("My Car price is : "+myCar.getPrice()+".00 /-");
    }
}
