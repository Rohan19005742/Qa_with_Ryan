#!/bin/bash
 
# Create directories
mkdir -p src/mypackage
 
# Create Java files and add code
cat << 'EOF' > src/mypackage/Person.java
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
EOF
 
cat << 'EOF' > src/mypackage/Student.java
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
EOF
 
cat << 'EOF' > src/mypackage/Teacher.java
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
EOF
 
cat << 'EOF' > src/mypackage/Workable.java
package mypackage;
 
public interface Workable {
    void work();
}
EOF
 
cat << 'EOF' > src/mypackage/Doctor.java
package mypackage;
 
public class Doctor implements Workable {
 
    @Override
    public void work() {
        System.out.println("I treat patients.");
    }
}
EOF
 
cat << 'EOF' > src/mypackage/Engineer.java
package mypackage;
 
public class Engineer implements Workable {
 
    @Override
    public void work() {
        System.out.println("I design and build.");
    }
}
EOF
 
cat << 'EOF' > src/mypackage/Main.java
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
EOF