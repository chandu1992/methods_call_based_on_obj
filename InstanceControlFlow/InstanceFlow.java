package InstanceControlFlow;

public class InstanceFlow {

    int i=10;

    {
        m1();
        System.out.println("First Instance block");
    }

    InstanceFlow(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        InstanceFlow obj = new InstanceFlow();
        System.out.println("====================");
        InstanceFlow obj1 = new InstanceFlow();

    }

    public void m1(){
        System.out.println("M1 method : "+j);
    }

    {
        System.out.println("second instance block");
    }

      int j=20;
}

/*
o/p
        M1 method : 0
        First Instance block
        second instance block
        Constructor
        ====================
        M1 method : 0
        First Instance block
        second instance block
        Constructor
        Main method
*/
