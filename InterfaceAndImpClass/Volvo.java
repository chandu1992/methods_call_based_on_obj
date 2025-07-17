package InterfaceAndImpClass;

public class Volvo implements Car{
    @Override
    public void engine() {
        System.out.println("1000 horse power");
    }

    @Override
    public void color() {
        System.out.println("Red color");
    }

    public void carType(){
        System.out.println("Racing car");
    }
}
