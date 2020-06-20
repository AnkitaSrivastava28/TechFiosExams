/**
 * 
 */
package com.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Anni
 *
 */
public class RandomNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int start = 0;
        int end = 500;
        System.out.print("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int counter = scanner.nextInt();
		scanner.close();
        int smallest;
        int randomInt ;

        int numbers [] = new int[counter];
        Random random = new Random(); 

        randomInt = random.nextInt(end-start) + start;
        numbers [0] = randomInt;

        smallest = randomInt;

        for(int i=1;i<counter;i++) {

            numbers[i] = random.nextInt(end-start) + start;

            smallest = Math.min(smallest,numbers[i]);

        }
        System.out.println("Random numbers: " + Arrays.toString(numbers) + "\n\n");
        System.out.println(counter + "th Smallest : " + smallest + "\n");

	}

}
