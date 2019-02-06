
public class Duck {
	private int numberOfFriends;
	private String favoriteFood;
	void quack() {
		System.out.println("Quack!");
	}
	void waddle() {
		System.out.println("[The duck waddles out of the program.]");
		System.exit(0);
	}
	
	Duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}
}
