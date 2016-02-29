import java.util.Scanner;
public class ex22 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		System.out.println("Please enter your age");
		int age = i.nextInt();
		
		if (age<16)
		{
			System.out.println("You can't drive");
		}
		if (age<18)
		{
			System.out.println("You can't vote");
		}
		if (age<25)
		{
			System.out.println("You can't rent a car");
		}
		if (age>=25)
		{
			System.out.println("You can do anything that's legal");
		}
	}

}
