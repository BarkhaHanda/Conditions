//Take input of age of 3 people by user and determine oldest and youngest among them.
public class Age{

		public static void main(String arg[]) {
			int a = 24;
			int b = 15;
			int c = 30;
			
			if((b>a) && (b>c)) {
				
				System.out.println("B is Oldest");
			}
			else if((b<a) && (b<c)) {
				
				System.out.println("B is the Youngest");
			}
			else if((a>b) && (a>c)) {
				
				System.out.println("A is Oldest");
			}
			else if((a<b) && (a<c)) {
				
				System.out.println("A is the Youngest");
			
			}else if((c>a) && (c>b)) {
				
				System.out.println("C is Oldest");
			}
			else if((c<a) && (c<b)) {
				
				System.out.println("C is the Youngest");
			
			}
		}
	}

