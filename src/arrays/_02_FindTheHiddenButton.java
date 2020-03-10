/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	JButton[] buttons;
	int hiddenButton;
	
	//1. create an array of JButtons. Don't initialize it yet.
	
	//2 create an int variable called hiddenButton
	
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int pos = Integer.parseInt(JOptionPane.showInputDialog("Give a positive integer"));
		buttons = new JButton[pos];
		for(int i = 0; i<buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);
		}
		window.add(panel);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.setVisible(true);
		window.setDefaultCloseOperation(3);
		JOptionPane.showMessageDialog(null, "Click on the button that says 'ME' on it after you close these instructions. Watch carefully, the label will quickly disappear.");
		Random r = new Random();
		hiddenButton = r.nextInt(pos);
		buttons[hiddenButton].setText("ME");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		buttons[hiddenButton].setText("");
		//3.  Ask the user to enter a positive number and convert it to an int
		
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		
		//5. Make a for loop to iterate through the JButton array
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		
		//9 add the panel to the window
		
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		
		//11. set the JFrame to visible.
		
		//12. Give the user the instructions for the game.
		
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		
		//14. Set the text of the JButton located at hiddenButton to  "ME"

		//15. Use Thread.sleep(1000); to pause the program.
		//    Surround it with a try/catch - use Eclipse helper for this
		
		//16. Set the text of the JButton located at hiddenButton to be blank.
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		if(buttonClicked.equals(buttons[hiddenButton])) {
			JOptionPane.showMessageDialog(null, "You got it!");
			window.dispose();
		}else {
			JOptionPane.showMessageDialog(null, "Try again. It's not that button. :(");
		}
		//17. if the hiddenButton is clicked, tell the user that they win.
		
		//18. else tell them to try again
	}
}
