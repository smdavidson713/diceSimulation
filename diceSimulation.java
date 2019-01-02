import java.util.Random;   // Needed for the Random class

/**
   This class simulates rolling a pair of dice 10,000 times
   and counts the number of times doubles of are rolled for
   each different pair of doubles.
*/

public class diceSimulation
{
   public static void main(String[] args)
   {
      final int NUMBER = 10000;  // Number of dice rolls

      // A random number generator used in
      // simulating the rolling of dice
      Random generator = new Random();

      int die1Value;       // Value of the first die
      int die2Value;       // Value of the second die
      int count = 0;       // Total number of dice rolls
      int snakeEyes = 0;   // Number of snake eyes rolls
      int twos = 0;        // Number of double two rolls
      int threes = 0;      // Number of double three rolls
      int fours = 0;       // Number of double four rolls
      int fives = 0;       // Number of double five rolls
      int sixes = 0;       // Number of double six rolls

      // TASK #1 Enter your code for the algorithm here
      while(count < NUMBER){                      // while the number of dice rolls is less than number of dice should be rolled
            die1Value = generator.nextInt(6) + 1; // "rolling" the die  
            die2Value = generator.nextInt(6) + 1;
        if(die1Value == die2Value){               // if the value of die 1 is equal to the value of die 2
          if(die1Value == 1)                      // die value is equal to 1 
            snakeEyes++;                          // incrementing snakeEyes by 1
          else if(die1Value == 2)                 // die value is equal to 2
            twos++;                               // increment twos by 1 
          else if(die1Value == 3)                 // die value is equal to 3
            threes++;                             // increment threes by 1
          else if(die1Value == 4)                 // die value is equal to 4
            fours++;                              // increment fours by 1
          else if(die1Value == 5)                 // die value is equal to 5
            fives++;                              // increment fives by 1
          else if(die1Value == 6)                 // die value is equal to 6
            sixes++;                              // increment sixes by 1


        }

      count++;                                   // increment number of dice rolls by 1
      }

      // Display the results
      System.out.println ("You rolled snake eyes " +
                          snakeEyes + " out of " +
                          count + " rolls.");
      System.out.println ("You rolled double twos " +
                          twos + " out of " + count +
                          " rolls.");
      System.out.println ("You rolled double threes " +
                          threes + " out of " + count +
                          " rolls.");
      System.out.println ("You rolled double fours " +
                          fours + " out of " + count +
                          " rolls.");
      System.out.println ("You rolled double fives " +
                          fives + " out of " + count +
                          " rolls.");
      System.out.println ("You rolled double sixes " +
                          sixes + " out of " + count +
                          " rolls.");
   }
}