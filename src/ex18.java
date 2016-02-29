import java.util.Scanner;
public class ex18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		System.out.println("Enter your name:");
		name = input.next();
		System.out.println("Your name is "+ name);
		System.out.println("Enter your age:");
		age = input.nextInt();
		System.out.println("You are "+age+" years old");
		
		System.out.println("\nYou were " + (age-5) + "years five years ago.\nYou will be "+ (age+5)+ "years old Five years from now" );

	}

}
