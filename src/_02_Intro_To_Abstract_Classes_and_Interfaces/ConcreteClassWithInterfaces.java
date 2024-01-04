package _02_Intro_To_Abstract_Classes_and_Interfaces;

public class ConcreteClassWithInterfaces extends AbstractClassDemo implements InterfaceDemo, DemoInterface {

    @Override
    public void abstractDemo() {
        System.out.println("ConcreteClassWithInterfaces - abstractDemo");
    }

    @Override
    public int abstractNumDemo() {
        return 42;
    }

    @Override
    public double interDemo() {
        return 3.14;
    }

    @Override
    public String faceDemo() {
        return "Interface implemented!";
    }

    public static void main(String[] args) {
        ConcreteClassWithInterfaces concreteObj = new ConcreteClassWithInterfaces();

        concreteObj.abstractDemo();
        int result = concreteObj.abstractNumDemo();
        System.out.println("Result: " + result);

        double interResult = concreteObj.interDemo();
        System.out.println("Interface Result: " + interResult);

        String faceResult = concreteObj.faceDemo();
        System.out.println("Face Demo Result: " + faceResult);

        concreteObj.demo();
    }
}