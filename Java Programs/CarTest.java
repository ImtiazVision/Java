class Car {
    int wheel;
    float price;
    String color;    
    void start() {
        int temp=100;
        System.out.println("Car Start");
        System.out.println("Wheel "+wheel);
        System.out.println("Price "+price);
        System.out.println("Color "+color);
        System.out.println("Temp "+temp);
    }
    void stop() {
        String msg="Welcome";
        System.out.println("Car Stop");
        System.out.println("Wheel "+wheel);
        System.out.println("Price "+price);
        System.out.println("Color "+color);
        System.out.println("Msg "+msg);
    }
}
class CarTest {
    public static void main(String args[]){
        Car innova = new Car();     // heap memory
        innova.start();
        innova.stop();
    }
}