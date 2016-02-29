import java.util.Random;
import java.util.Scanner;
public class ex40 {
    
    public static void main(String[] args)
    {
        int guess;
    Random random = new Random(10);
    int rand = random.nextInt(10);
      
    Scanner i = new Scanner(System.in);
    System.out.println("Enter a number between 0 and 10");
    guess = i.nextInt();
    
    if(guess == rand)
    {
        System.out.println("You guessed right");
    }
    else
        System.out.println("You guessed wrong");
    
    
}
}