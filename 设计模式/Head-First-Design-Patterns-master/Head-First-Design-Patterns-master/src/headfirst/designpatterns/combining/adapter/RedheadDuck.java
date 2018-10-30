package headfirst.designpatterns.combining.adapter;

public class RedheadDuck implements Quackable {
	@Override
    public void quack() {
		System.out.println("Quack");
	}
}
