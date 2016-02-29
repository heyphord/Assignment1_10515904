import java.util.Scanner;

public class ex19 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a,b,c;
		double soln ;
		System.out.println("Enter 3 numbers, press enter after each entry");
		a =input.nextDouble();
		b= input.nextDouble();
		c= input.nextDouble();
	
		 soln = (a+b+c)/2;
		System.out.println("(a+b+c)/2 is "+ soln );
		
	}

}
