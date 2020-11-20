package _03_if_else._1_unbirthday;

import java.util.Date;

import javax.swing.JOptionPane;

public class happybirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date Today = new Date();
		
		int date = Today.getDate();
		
		int month = Today.getMonth() +1;
		
		String birthday = month+"/"+date;
		
		System.out.println(Today.getDate());
		
		System.out.println(Today.getMonth());
		
		String input = JOptionPane.showInputDialog("What is your birthday?");
		
		if(input.equals(birthday)) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
			
		}
		else {
			JOptionPane.showMessageDialog(null,"Merry Unbirthday");
		}
		
	}

}
