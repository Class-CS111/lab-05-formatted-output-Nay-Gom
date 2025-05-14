// Name: Nayan Gomez

// DESCRIPTION: <This program is to convert dollar amount into quarters, dimes, nickels, and pennies.

public class Main
{
	public static void main(String[] args)

	{
    //DECLARATION + INITIALIZATION SECTION

    double initialAmount = 3.80;
    int centsRemaining = 0;
    int numQuarters = 0;
    int numDimes = 0;
    int numNickels = 0;


    //CALCULATION SECTION

    centsRemaining = (int) (100 * initialAmount);
    numQuarters = centsRemaining / 25; //integer divison
    centsRemaining %= 25;  //remaining after chanign into quarters
    numDimes = centsRemaining / 10; //division with dimes
    centsRemaining %= 10;
    numNickels = centsRemaining / 5;
    centsRemaining %= 5;
    //we do not need to do pennies because it is the remainder of the total amonut


    //OUTPUT SECTION

    
    System.out.printf("$%.2f can be converted to %d quarters, %d dimes, %d nickels, and %d pennies.", 
    initialAmount, numQuarters, numDimes, numNickels, centsRemaining);
  }

}
