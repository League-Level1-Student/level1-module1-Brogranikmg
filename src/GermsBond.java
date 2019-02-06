import java.util.Random;

public class GermsBond {
	public static void main(String[] args) {
		Random rrrrrrrrrrrrrrrrrrrrrr = new Random();
		
		Vault v = new Vault(rrrrrrrrrrrrrrrrrrrrrr.nextInt(2000000));
		JamesBond james = new JamesBond();
		System.out.println(james.crackSafe(v));
	}
}