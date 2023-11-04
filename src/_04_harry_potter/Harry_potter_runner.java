package _04_harry_potter;

public class Harry_potter_runner {
	
	public static void main (String[] args) {
		HarryPotter hp = new HarryPotter();
		hp.makeInvisible(true);
		hp.spyOnSnape();
		hp.makeInvisible(false);
		hp.castSpell("Stupefy");
	}
}
