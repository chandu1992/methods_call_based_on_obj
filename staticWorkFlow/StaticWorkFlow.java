package staticWorkFlow;

public class StaticWorkFlow {

    static int age =100;

    static {
        m1();
        System.out.println("First static block");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("Main method");

     /*   o/p
        m1 method : 0
        First static block
        second static block
        m1 method : 200
        Main method

        */
    }

    public static void m1(){
        System.out.println("m1 method : "+j);
    }

    static {
        System.out.println("second static block");
    }

    static int j=200;
}
