/*Modify the above question to allow student to sit if he/she has medical cause. 
Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.*/

public class Medical {

	public static void main(String arg[])
	{
	int classattend = 10;
	Boolean cause = true;
	
	if((classattend >= 75) && (cause==false))
	{
	System.out.println("You are allowed to sit in exam");	
	}
	else {
		System.out.println("You are not allowed to sit in exam");
	}
	
	}
	
	
}
