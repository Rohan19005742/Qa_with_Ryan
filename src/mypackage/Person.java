package mypackage;
 
public abstract class Person {
    protected String name;
 
    public Person(String name) {
        this.name = name;
    }
 
    // Abstract method
    public abstract void displayRole();
 
    @Override
    public String toString() {
        return "Name: " + name;
    }
}
