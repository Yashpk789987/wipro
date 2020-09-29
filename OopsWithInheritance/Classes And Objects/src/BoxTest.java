class Box {
	public int length;
	public int width;
	public int height;

	public Box(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public int volume() {
		return this.length * this.width * this.height;
	}

	public String toString() {
		return this.length + ", " + this.width + ", " + this.height;
	}
}

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b = new Box(2, 3, 5);
		System.out.println(b);
		System.out.println("The Volume is :: " + b.volume());
	}

}
