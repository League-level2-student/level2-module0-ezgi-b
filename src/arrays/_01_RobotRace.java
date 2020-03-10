package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	
	public static void main(String[] args) {
		Robot[] bot = new Robot[5];
		for(int i = 0; i < bot.length; i++) {
			bot[i] = new Robot();
			bot[i].setSpeed(100);
			bot[i].miniaturize();
			bot[i].penDown();
			bot[i].setPenWidth(5);
			bot[i].setRandomPenColor();
			bot[i].setWindowSize(1200, 700);
		}
		
		for(int i = 0; i < bot.length; i++) {
			bot[i].moveTo(50 + 200*i, 400);
		}	
		
		Random r = new Random();
		for(int e = 0; e <8; e++) {
			for(int i = 0; i < bot.length; i++) {
				for(int z = 0; z < r.nextInt(8); z++) {
					bot[i].move(3);
					bot[i].turn(2);
				}
			}	
		}
		while(bot[0].getX()>51 && bot[1].getX()>251 && bot[2].getX()>451 && bot[3].getX()>651 && bot[4].getX()>851) {
			for(int i = 0; i < bot.length; i++) {
				for(int z = 0; z < r.nextInt(8); z++) {
					bot[i].move(3);
					bot[i].turn(2);
				}
			}	
		}
		for(int i = 0; i < bot.length; i++) {
			if(bot[i].getX()<=(51 + 200*i)) {
				JOptionPane.showMessageDialog(null, "Bot #" + i + " wins!");
			}
		}
	}
	//1. make a main method

	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
