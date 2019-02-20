
public class DuckDriver {
	public static void main(String[] args) {
		Duck loser = new Duck("worms", 0);
		loser.quack();
		Worm drongo = new Worm(500000, 10);
		drongo.worm();
		drongo.squirm();
		loser.waddle();
	}
}
