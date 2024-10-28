package mypackage;
 
public class Teacher extends Person {
 
    public Teacher(String name) {
        super(name);
    }
 
    @Override
    public void displayRole() {
        System.out.println("I am a teacher.");
    }
}
