import java.util.Scanner;
public class ex14 {

	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		int age,inches;
		int height;
		double weight;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How many feet tall are you? " );
		height = keyboard.nextInt();

		System.out.print( "And how many inches? " );
		inches = keyboard.nextInt();
		
		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " old, " + height + "'"+inches +" tall and " + weight + " heavy." );
	}
}
