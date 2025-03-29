package java_topic_part1;

public class DummyCar {

    String color;
    String brand;
    int airBagsCount;

    public void drive(){
        System.out.println(brand +" in Driving");
    }

    public void stop(){
        System.out.println(brand +" has Stopped");
    }
}

class MyDriver {
    public static void main(String[] args) {
        DummyCar car = new DummyCar();
        car.drive();
        car.stop();

    }
}
