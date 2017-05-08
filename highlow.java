package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class highlow {
public static void main(String[] args) {
	Random number = new Random();
	int x = number.nextInt(100) + 1;
	String answer = JOptionPane.showInputDialog(null, "What number from 1-100 am I thinking of?");	
    int newnumber = Integer.parseInt(answer);
	
	for (int i = 0; i < 10; i=1) {
		
	    
	    if (newnumber > x){
	    	answer = JOptionPane.showInputDialog(null, "That number is to high, guess lower!");
	    	newnumber = Integer.parseInt(answer);
	    }
	    if (newnumber < x) {
		    answer = JOptionPane.showInputDialog(null, "your number is to small, guess a little higher!");
		    newnumber = Integer.parseInt(answer);
		    }
	    
	    if (newnumber == x) {
	     JOptionPane.showMessageDialog(null, "You guessed my number!");
	      
	    }
	    
	}
	
    
}


}
