// Written by Wesley May

import java.util.Scanner;
public class lab3 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int a = 10;
		double[] array = new double[a];
	//prompt user for numbers and put values into the array
		for (int d = 0; d < a; d++) 
		{
			System.out.print("Enter the temperature for Day " + (d + 1) + ":");
			array[d] = k.nextDouble();
		}
	//do math
		double sum = 0.0;
		//sum of numbers in array, then divide by array.length
		for (double num : array)
		{
			sum += num;
		}
		double avg = sum / array.length;
		System.out.println("The average temperature was: " + avg);
		//print days below average
		System.out.println("The days below average were:");
		for (int d = 0; d < array.length; d++)
		{
			if (array[d] < avg)
			{
				System.out.println("Day " + (d + 1) + " was below average with " + array[d] + " degrees"); 
			}
		}
		
	}

}
