package ParentAndChildClassMethodCall;

public class Test {

    public static void main(String[] args) {

        Parent p = new Child();
        p.m1();  // o/p parent class m1() - overridden method (Runtime call)
        p.m2();  // o/p child class m2() - m2() is override in child class
//        p.m3();  // not allowed
        ((Child) p).m3(); // o/p child class m3()
    }
}
