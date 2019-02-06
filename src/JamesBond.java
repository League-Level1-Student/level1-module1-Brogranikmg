
public class JamesBond {
	public int crackSafe(Vault v) {
		for (int i = 0; i < 1000001; i++) {
			if (v.tryCode(i)) {
				return i;
			}
		}
		return -1;
	}
}
