
public class CatRunner {
	public static void main(String[] args) {
		Cat fool = new Cat("Fool");
		fool.meow();
		fool.printName();
		for (int i = 0; i < 9; i++) {
			fool.kill();
		}
	}
}
