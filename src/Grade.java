/*  A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
*/

public class Grade {
	
	public static void main(String args[]) {
		
		int grade = 100;
		
		if(grade<=25)
		{
		System.out.println("You will get F grade");	
		}
		
		else if((grade>=25)&&(grade<=45))
		{
			System.out.println("You will get E grade");
			
		}
		
		else if((grade>=45)&&(grade<=50)) {
			System.out.print("You will get D grade");
		}
		
		else if((grade>=50)&&(grade<=60)) {
			System.out.print("You will get C grade");
		}
		
		else if((grade>=60)&&(grade<=80)) {
			System.out.print("You will get B grade");
		}

		else if(grade>=80){
			System.out.print("You will get A grade");
		}

	}

}
