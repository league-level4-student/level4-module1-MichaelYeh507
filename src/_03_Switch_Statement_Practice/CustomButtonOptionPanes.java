package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch (choice) {
		case "Monday":
			System.out.println("No one wants to work");
			break;
		case "Tuesday":
			System.out.println("Second day of the week");
			break;
		case "Wednesday":
			System.out.println("Getting tired of school already");
			break;
		case "Thursday":
			System.out.println("Almost friday");
			break;
		case "Friday":
			System.out.println("Ayyy Friday!");
			break;
		case "Saturday":
			System.out.println("Zzzzz");
			break;
		case "Sunday":
			System.out.println("uh oh, didn't do hw");
			break;
		default:
			System.out.println("error");
			break;
			
		}
	}
}
