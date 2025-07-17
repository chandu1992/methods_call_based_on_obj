package InterfaceAndImpClass;

public class Test {

    /*
        - Call only methods declared in the interface.
        - For abstraction, flexibility, loose coupling
    */
    public static void main(String[] args) {
        Car obj = new Volvo();
        obj.color(); // o/p Red color
        obj.engine(); // o/p 1000 horse power
//        obj.carType();  // not allowed carType() in not present in Car Interface
        ((Volvo) obj).carType();  // Racing car
    }
}
