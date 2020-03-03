package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		
		String[] stringy = {"Abby", "Bernard", "Carol", "Daniel", "Ella"};
		System.out.println(stringy[2]);
		stringy[2] = "Clarke";
		System.out.println(stringy[2]);
		for(int i = 0; i < stringy.length; i++) {
			System.out.println(stringy[i]);
		}
		
		Integer[] x = new Integer[50];
		Random r = new Random();
		for(int i = 0; i < x.length; i++) {
			x[i] = r.nextInt(1001);
		}
		
		int smallest = x[0];
		for(int i = 1; i < x.length; i++) {
			if(x[i]<smallest) {
				smallest = x[i];
			}
		}
		System.out.println("");
		
		System.out.println("Smallest Number: " + smallest);
		
		System.out.println("");
		
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
		System.out.println("");
		
		int largest = x[0];
		for(int i = 1; i < x.length; i++) {
			if(x[i]>largest) {
				largest = x[i];
			}
		}
		System.out.println("Largest Number: " + largest);
		
		//1. make an array of 5 Strings
		
		//2. print the third element in the array
		
		//3. set the third element to a different value
		
		//4. print the third element again
		
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		
		//6. make an array of 50 integers
		
		//7. use a for loop to make every value of the integer array a random number
		
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
