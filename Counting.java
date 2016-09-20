import java.util.Scanner;

import Stuff.PlayAgain;
import java.util.Random;
import java.util.Arrays;


public class Counting 
{
	public static void main(String args[])
	{
		PlayAgain play = new PlayAgain();

		do 
		{	
			play.counting();
		} while (play.again());

	}
}