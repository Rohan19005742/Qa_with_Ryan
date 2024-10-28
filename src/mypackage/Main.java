package mypackage;
 
public class Main {
    public static void main(String[] args) {
        // Using abstract class with polymorphism
        Person[] people = {
            new Student("Alice"),
            new Teacher("Bob")
        };
 
        System.out.println("Abstract Class Polymorphism:");
        for (Person person : people) {
            System.out.println(person);
            person.displayRole();
            System.out.println();
        }
 
        // Using interface with polymorphism
        Workable[] workers = {
            new Doctor(),
            new Engineer()
        };
 
        System.out.println("Interface Polymorphism:");
        for (Workable worker : workers) {
            worker.work();
            System.out.println();
        }
    }
}
