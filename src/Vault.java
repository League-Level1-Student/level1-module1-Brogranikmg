
public class Vault {
	private int secretCode = 512;
	
	public Vault(int secretCode) {
		this.secretCode = secretCode;
	}
	
	public boolean tryCode(int code) {
		if(code == secretCode) {
			return true;
		} else {
			return false;
		}
	}
}
