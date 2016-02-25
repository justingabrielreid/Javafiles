import java.util.Scanner; 

/** 
	This program will take in the quix scores of a student, remove the lowest score from the group and
	then sum the quiz scores for the final value. I will use four methods for this problem, 1. Initialize the array 2. Find the minimum value
	and Remove the minimum value from the array and 4. Calculate and print the sum of the array.
*/

public class QuizScores 
{

	public static void main(String[] args)
	{
		double[] values = readInputs(5);
		double[] values1 = minimum(values);
		printSum(values1);
	}
	
/**
	This method is reading the test values and placing them into the array scores. 
	The parameter inputs are the test scores of the students. 
*/

	public static double[] readInputs(int testScores)
	{
		System.out.println("Enter the scores of your five quizzes: ");
		Scanner in = new Scanner(System.in);
		double[] scores = new double[testScores];
		for (int i = 0; i < scores.length; i++)
		{
			scores[i] = in.nextDouble();
		}
		return scores;
		
	}
	public static double[] minimum(double[] quizScores)
	{
		double minimum = quizScores[0];
		int currentSize = 5;
		for (int i = 1; i < currentSize;i++)
		{
			if (quizScores[i] < minimum)
			{
				minimum = quizScores[i];
				for (int j = 1; j < currentSize; j++)
				{
					quizScores[i] = quizScores[i-1];
				}
			}
			else
			{
				for (int k = 1; k < currentSize; k++)
				{
					quizScores[i] = quizScores[i-1];
					currentSize--;
				}
			}
		}
		for (int i = 1; i < currentSize; i++)
		{
			System.out.println(quizScores[i]);
		}
		
		return quizScores;
	}

	public static void printSum(double[] quizScores)
	{
		double total = 0;	
		for (int i = 0; i < quizScores.length; i++)
		{
			total = total + quizScores[i];	
		}
		// System.out.println("Your total quiz grade of four out five of your highest test scores is " + total);
		// System.out.println();		
	}
}