

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar five = new RaceCar("Ford", 5);
		// 2. Print the RaceCar's position in the race
		System.out.println(five.getPositionInRace());
		// 3. Crash the RaceCar
		five.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		if(five.damaged) {
			five.pit();
		}
		// 5. Help the car move into first place.
		while(five.getPositionInRace() > 1) {
			five.overtake();
		}
	}
}
