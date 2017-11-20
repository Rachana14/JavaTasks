import java.util.Scanner;

public class WordCount 
   {
	  static int count =1;
		public static void main(String args[])
		{ 
			System.out.println("enter a string");
			Scanner sc = new Scanner(System.in);
			String s= sc.nextLine();
				 
			for (int i = 1; i < s.length() - 1; i++)
			{
				if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
				{
					count++;
				}
			}
	 		System.out.println("Number of words in a string = " + count);
		}
	}


