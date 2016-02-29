
public class ex23 {

	public static void main(String[] args) {
		
		int people = 30;
		int cars = 40;
		int buses = 15;

		//1) The statements under else is executed when all the statement (including else if statement) under if fails to execute
		//The "else if" statement are actually under the if statement. it gives the user multiple choices to choose from, unlike the 
		//traditional "if else"
		
		//2)Removing the "else" part will create a nested if statement inside the first if statement
		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}
		else if ( cars < people )
		{
			System.out.println( "We should not take the cars." );
		}
		else
		{
			System.out.println( "We can't decide." );
		}


		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}


		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}
	}

}
