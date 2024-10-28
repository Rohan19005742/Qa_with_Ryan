package mypackage;
 
public class MyClass {
    private String name;
    private int age;
    private static int instanceCount = 0;
 
    // Constructor 1
    public MyClass(String name) {
        this(name, 0); // Calls Constructor 2
    }
 
    // Constructor 2
    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
        instanceCount++;
    }
 
    // Static method to get instance count
    public static int getInstanceCount() {
        return instanceCount;
    }
 
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
