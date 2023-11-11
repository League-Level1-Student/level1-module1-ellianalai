package _07_duck;

public class DuckRunner {
	public static void main (String [] args) {
		Duck donald = new Duck("donald", "Alphabet soup", 20);
		Pig patty = new Pig("patty", "Spaghetti-O's", 5);
		donald.quack();
		donald.waddle();
		patty.roll();
		patty.squeals();
		patty.oink(donald);
	}
}
