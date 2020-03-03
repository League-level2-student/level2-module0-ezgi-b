package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	
	public static void main(String[] args) {
		Robot[] bot = new Robot[5];
		for(int i = 0; i < bot.length; i++) {
			bot[i] = new Robot();
		}
		
		for(int i = 0; i < bot.length; i++) {
			bot[i].moveTo(60 + 100*i, 540);
		}	
		
		Random r = new Random();
		while(bot[0].getY()>80 && bot[1].getY()>80 && bot[2].getY()>80 && bot[3].getY()>80 && bot[4].getY()>80) {
			for(int i = 0; i < bot.length; i++) {
				bot[i].move(r.nextInt(51));
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
