
public class Worm {
	private int wormLength;
	private int hatred;
	void worm() {
		if(hatred > 5) {
			System.out.println("The worm worms with immense hatred.");
		} else {
			System.out.println("The worm worms.");
		}
	}
	void squirm() {
		if(hatred > 5) {
			System.out.println("The worm squirms with immense hatred.");
		} else {
			System.out.println("The worm squirms.");
		}
	}
	Worm(int wormLength, int hatred) {
		this.wormLength = wormLength;
		this.hatred = hatred;
	}
}
