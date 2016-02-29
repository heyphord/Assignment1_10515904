import java.util.Scanner;
public class ex20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double h,w;
		
		System.out.println("Enter your weight in Kilograms:" );
		w= in.nextDouble();
		System.out.println("Enter your height in Meter:");
		h= in.nextDouble();
		System.out.println("You BMI is "+ w/(h*h) );
	}

}
