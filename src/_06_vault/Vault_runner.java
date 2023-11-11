package _06_vault;

public class Vault_runner {
	public static void main (String [] args) {
		Vault vault = new Vault();
		SecretAgent s = new SecretAgent();
		int code =  s.findCode(vault);
		if(code==-1) {
			System.out.println("You failed to find the code");
		}
		else {
		System.out.println("The secret code is " + code);
		}
	}
}
