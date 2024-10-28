package mypackage;
 
public class Main {
    public static void main(String[] args) {
        MyClass person1 = new MyClass("Alice");
        MyClass person2 = new MyClass("Bob", 25);
 
        System.out.println(person1);
        System.out.println(person2);
        System.out.println("Instance Count: " + MyClass.getInstanceCount());
    }
}
