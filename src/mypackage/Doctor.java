package mypackage;
 
public class Doctor implements Workable {
 
    @Override
    public void work() {
        System.out.println("I treat patients.");
    }
}
