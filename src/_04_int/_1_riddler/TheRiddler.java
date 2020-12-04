package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
		
		int score = 0;
		
		String input = JOptionPane.showInputDialog("Brothers and Sisters I have none, but this man's father is my father's son. Who is the man?");
		
		if(input.equals("your son")){
			JOptionPane.showMessageDialog(null,"correct!");
			score += 1;
		}
		else {
			JOptionPane.showMessageDialog(null,"wrong");
		}
		String riddle = JOptionPane.showInputDialog("What is greater than God, more evil than the devil, the poor have it, the rich need it, and if you eat it, you die?");
		if(riddle.equals("nothing")) {
			JOptionPane.showMessageDialog(null,"correct!");
			score += 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "wrong");
		}
		JOptionPane.showMessageDialog(null, "you have " +score+ " points");

		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

