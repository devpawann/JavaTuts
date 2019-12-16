package Day1;

public class Myclass implements InterfaceOne,InterfaceTwo {
    @Override
    public void test() {
        System.out.println("Interface 1 test method");
    }



    @Override
    public void test2() {
        System.out.println("Interface 1 test method2");
    }
}
