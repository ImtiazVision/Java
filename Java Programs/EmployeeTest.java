class Bike {
    void speed() {
        System.out.println("6okm/hr");
    }
}
class Honda extends Bike {
    void color() {
        System.out.println("Red");
    }
}
class Pulsar extends Bike {
    void color() {
        System.out.println("Black");
    }
}
class EmployeeTest {
    public static void main(String args[]){
        Honda hh = new Honda();         hh.color();     hh.speed();
        Pulsar pu = new Pulsar();       pu.color();     pu.speed();
    }
}