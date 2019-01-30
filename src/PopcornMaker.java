import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String flavr = JOptionPane.showInputDialog("What flavor popcorn do you want?");
		Popcorn pop = new Popcorn(flavr);
		Microwave wave = new Microwave();
		String howlong = JOptionPane.showInputDialog("How long do you want to cook your popcorn for?");
		int length = Integer.parseInt(howlong);
		wave.setTime(length);
		wave.putInMicrowave(pop);
		wave.startMicrowave();
		pop.applyHeat();
		pop.eat();
	}
}
