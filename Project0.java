//Name: Khandaker Hossain
//Lab 11A-Li
//This is a Java project that asks the user to enter a sentence then tells them how many upper and lower case "e" were in the sentence they previously entered.

import javax.swing.JFrame;
import javax.swing.JOptionPane;
//This is a library used to generate a GUI/Graphical User Interface


public class Project0 {
	public static void main(String[] args) {
		//Here you have a while loop that continuously asks the user for their input until it breaks/stops when the user enters "stop"
		//A while loop is chosen instead of a for loop because it is easier to set the condition as a true/false that continues forever on a while loop. 
		while(true) {
			JFrame f;
			f = new JFrame(); 
			//This JFrame is used to open the GUI window into the screen for the user
			
			String line = JOptionPane.showInputDialog(f, "Please enter a sentence. ");
			//Here the user is asked for their input and thats stored in "line"
			
			if (line.equalsIgnoreCase("stop")) { 
				break;
				//when the user enters "stop", the user input loop stops. 
				//The .equalsignorecase method is used to make sure the user can enter stop in any and every way
			}
			
			JOptionPane.showMessageDialog(f, "Number of lower case e's: " + LowerCase(line) + "\n" +  "Number of Upper case e's: " + UpperCase(line));
			//To the user this prints out how many upper and lower case "e" were in the sentence
			//Another thing that happens here is you have the two methods being called that checks the sentences for e's
		}

	}
	
	
	//Method used to check for lower case e's 
	//the loop checks every individual letter in the sentence for e's until it reaches the end then it returns how many e's were found
	//the .length method is used to make sure the loop goes on for the length of the string 
	public static int LowerCase(String x) {
		int count = 0;
		for (int i=0; i<x.length(); i++) {
			if (x.charAt(i) == 'e') {
				count++;
			}
		}
		return count;
	}
	
	
	//Method used to check for upper case e's
	//the loop checks every individual letter in the sentence for e's until it reaches the end then it returns how many e's were found
	//the .length method is used to make sure the loop goes on for the length of the string 
	public static int UpperCase(String x) {
		int count = 0;
		for (int i=0; i<x.length(); i++) {
			if (x.charAt(i) == 'E') {
				count++;
			}
		}
		
		return count;
	}
	
}
