import java.text.DecimalFormat;
import java.util.Scanner;

public class KeepTheChange 
{
	public static void main(String args[])
	{
		
		DecimalFormat format = new DecimalFormat("$#.00");
		double totalCharge = 0;
		double totalSavings = 0;
		
		boolean again = false;
		
		//start loop
		while (!again)
		{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a dollar amount: ");
		double amt = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		int cc = (int) amt +1;
		
		System.out.println("Total charge to credit card is: " + cc);
		
		double sum = cc - amt;
	
		System.out.println("Amount transfered to saving is: " + format.format(sum));
		
		totalCharge += cc; //adds charge to a total
		totalSavings += sum; //adds savings to a total
		
		System.out.println("Would you like to check the total amount charged on your credit card?" +
				"\nEnter anything to continue or \"n\" to stop");
		String check = keyboard.nextLine();
		if (check.equals("n"))
				System.exit(0);
		else 
			System.out.println("Your total amount charged is: " + format.format(totalCharge));
		
		System.out.println("Would you like to check the amount transfered to your savings?" + 
				"\nEnter anything to continue or \"n\" to stop");
		String savings = keyboard.nextLine();
		if (savings.equals("n"))
			System.exit(0);
		else 
			System.out.println("The total amount transfered is: " + format.format(totalSavings));
		}

	}
}
