import java.util.Scanner;
public class ex25 {

	public static void main(String[] args) {
		
		Scanner i = new Scanner(System.in);
		System.out.println("Enter your age");
		int a = i.nextInt();
		
		if (a<16)
		{
			System.out.println("You can't drive");
		}
		else if (a<18)
		{
			System.out.println("You can drive but not vote");
		}
		else if (a<25)
		{
			System.out.println("You can vote but not rent a car");
		}
		else
		{
			System.out.println("You can pretty much do anything");
		}
	}
	

}
