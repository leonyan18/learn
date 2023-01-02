package headfirst.designpatterns.combining.composite;

public class RedheadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public String toString() {
        return "Redhead Duck";
    }
}
