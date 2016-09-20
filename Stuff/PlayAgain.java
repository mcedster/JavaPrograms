package Stuff;
import java.util.Random;
import java.util.Scanner;

public class PlayAgain 
{
	Scanner keyboard = new Scanner(System.in);
	
	public PlayAgain(){}
	
	public boolean again()
	{
		System.out.println("Play again? y/n?");
		String in = keyboard.nextLine();
		if (in.equals("n"))
		{
			System.exit(0);
			return false;	
		}
		else
			return true;
	}
	
	public void counting()
	{
		Scanner keyboard = new Scanner(System.in);
		Random ran = new Random();
		
		//defines how many integers to have in array
		System.out.println("How many integers do you want in the array?");
		int inte = keyboard.nextInt();

		//define array
		int[] array = new int[inte];
		
		//define a random
		int ran1;
		
		//Adds random number to each spot in the array
		for (int i = 0; i < inte ; i++ )
		{
			ran1 = (int) (ran.nextDouble() * 100 +1) ;
			array[i] = ran1;
		}	
		boolean stuff = false;
		
		while (!stuff)
		{
			//Prints the numbers in the array
			for (int j = 0; j < inte ; j++)
				System.out.print(array[j] + "[" + j +"]  ");
			
			
			//Asks for what num is lowest
			System.out.println();
			System.out.println("What is the lowest number out of these numbers?"
					+ " (Select the number in brackets)" + "\nIf num is 0, do not choose");
			int low = keyboard.nextInt();

		    int min = array[0];
		    min = 101;
		
		    for(int i = 0;i<array.length;i++)
		    {	
		    	// if place 
		    	if(min>array[i] && (array[i] != 0))
		            min = array[i];
		    }	
		    if (array[low] == min)
		    	{
				System.out.println("Good job!");
				array[low] = 0;
		    	}
		    else if (array[low] != min)
		    	System.out.println("Try again!");
		    
		    
		    for(int k = 0; k<array.length; k++)
		    {
		    	if(array[k] == 0)
		    	{
		    		stuff = true;
		    	}
		    	else
		    	{
		    		stuff = false;
		    		break;
		    	}
		    }
		}			    	
		System.out.println("You win!");
	}
}
