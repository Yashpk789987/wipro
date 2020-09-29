
class Fruit {
	public String name;
	public String taste;
	public int size;

	public Fruit() {
		name = "Fruit name";
		taste = "Tase of the fruit";
		size = 0;
	}

	public void eat() {
		System.out.println(name + " tastes like " + taste);
	}
}

class Apple extends Fruit {
	@Override
	public void eat() {
		System.out.println("It tastes like apple");
	}
}

class Orange extends Fruit {
	@Override
	public void eat() {
		System.out.println("It tastes like Orange");
	}
}

public class Overriding_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Fruit().eat();
		new Apple().eat();
		new Orange().eat();
	}

}
