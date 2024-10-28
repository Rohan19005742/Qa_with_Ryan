package mypackage;
 
public class Student extends Person {
 
    public Student(String name) {
        super(name);
    }
 
    @Override
    public void displayRole() {
        System.out.println("I am a student.");
    }
}
