import java.util.Scanner;
public class ex36 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double h,w,BMI;
		
		System.out.println("Enter your weight in Kilograms:" );
		w= in.nextDouble();
		System.out.println("Enter your height in Meter:");
		h= in.nextDouble();
                BMI = w/(h*h);
		System.out.println("You BMI is " + BMI);
                
                if (BMI<18.5)
                {
                    System.out.println("Underweight");
                }
                else if (BMI <=24.9)
                {
                    System.out.println("normal weight");
                }
                else if (BMI <= 29.9)
                {
                    System.out.println("Overweight");
                }
                else
                    System.out.println("obese");
	}


}
