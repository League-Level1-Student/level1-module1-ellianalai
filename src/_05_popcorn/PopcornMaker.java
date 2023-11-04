package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		Microwave micro = new Microwave();
		String flavor = JOptionPane.showInputDialog("What flavor do you want the popcorn to be?");
		Popcorn pop = new Popcorn(flavor);
		String time = JOptionPane.showInputDialog("Set the time for the popcorn");
		int time_int = Integer.parseInt(time);
		micro.putInMicrowave(pop);
		micro.setTime(time_int);
		micro.startMicrowave();
	}
}
