/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity.Suppose, one unit will cost 100.Judge and print total cost for user.*/

public class Discount {

	public static void main(String args[]) {
		int cost;
		int quan= 2000;
		cost= quan*100;
	if(cost>1000)
	{
		System.out.println("you will get 10% discount");
	}
	else {
		
		System.out.print("No discount");
	}
	}
}
