import java.util.*;

/*
 * Sample Comment
 */
public class DuplicateWords {

	public static void main(String[] args)
	{	
		System.out.println("enter a string with duplicate words");
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		String[] words=s.split(" ");	
		int wordcount=1;							
		
		for(int i=0;i<words.length;i++)			
		{
			for(int j=i+1;j<words.length;j++)	
			{
				
			if(words[i].equals(words[j]))	
				{
					wordcount=wordcount+1;				
					words[j]="0";			
				}
			}
			if(words[i]!="0" & wordcount >=2)
			System.out.println(words[i]+"--"+wordcount);
			wordcount=1;
			
	     }  
			
	}

}