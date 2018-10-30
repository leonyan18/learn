package headfirst.designpatterns.combining.adapter;

public class MallardDuck implements Quackable {
	@Override
    public void quack() {
		System.out.println("Quack");
	}
}
