package page;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {

		int c, temp;
		Scanner input = new Scanner(System.in);
		System.out.print("How many random numbers you would liket to generate?");
		c = input.nextInt();
		int ar[] = new int[c];
		Random generator = new Random();

		// random integers in [0, 500]

		for (int count = 0; count < c; count++) {
			int randomnumber = generator.nextInt();
			ar[count] = randomnumber;
			System.out.println("The Random numbers are: " + ar[count]);

		}

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Random numbers are generated in Ascending Order:");
		for (int i = 0; i < c; i++) {
			for (int j = i + 1; j < c; j++) {
				if (ar[i] > ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			System.out.println(ar[i]);
		}
		boolean completed = false;
		Scanner number = new Scanner(System.in);
		do {
			System.out.println("Which smallest n number you would like to print");
			int r = number.nextInt();
			if (r < c) {

				for (int i = 0; i < c; i++) {
					if (i == r) {
						System.out.println(r + " " + ar[i]);
						completed = true;
					}

				}
			} else {
				System.out.println(" Please enter the position less than  " + c);
			}

		} while (!completed);
	}
}
