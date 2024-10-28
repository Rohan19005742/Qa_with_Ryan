package mypackage;
 
public class MyClass {
    private String name;
    private int age;
    private static int instanceCount = 0;
 
    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
        instanceCount++;
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
 
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
