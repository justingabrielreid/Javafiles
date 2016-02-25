import java.util.Scanner;

/** 
	This program will take in the quix scores of a student, remove the lowest score from the group and
	then sum the quiz scores for the final value. I will use four methods for this problem, 1. Initialize the array 2. Find the minimum value
	and Remove the minimum value from the array and 4. Calculate and print the sum of the array.
*/

public class QuizScores2
{
	
	public static void main(String[] args)
	{
		double[] values = readInputs(5);
		double[] values1 = minimum(values);
		printSum(values1);
	}

	public static double[] readInputs(int testScores)
	{
		System.out.println("Enter the scores of your five quizzes: ");
		Scanner in = new Scanner(System.in);
		double[] scores = new double[testScores];
		for (int i = 0; i < scores.length; i++)
		{
			scores[i] = in.nextDouble();
		}
		for (int i = 0; i < scores.length; i++)
		{
			System.out.print(" |" + scores[i] + "| ");
		}
		System.out.println();
		return scores;
		
	}
	public static double[] minimum(double[] quizScores)
	{
		double smallest = quizScores[0];
		int smallestPosition = 0;
		int currentSize = quizScores.length;
		for (int i = 1; i < quizScores.length; i++)
		{
			if (smallest > quizScores[i])
			{
				smallest = quizScores[i];
				smallestPosition = i;
			}
		}
		for (int i = smallestPosition + 1; i < currentSize; i++)
		{
			quizScores[i-1] = quizScores[i];
		}
		currentSize--;
		for (int i = 0; i < currentSize; i++)
		{
			System.out.print(" |" + quizScores[i] + "| ");
		}
		System.out.println();
		System.out.println(smallest);
		return quizScores;
	}
	public static void printSum(double[] quizScores)
	{
		double total = 0;
		for ( int i = 0; i < quizScores.length - 1; i++)
		{
			total = total + quizScores[i];	
		}
		System.out.print("Your total quiz scores neglecting the lowest score is: " + total);
		System.out.println();
	}
}