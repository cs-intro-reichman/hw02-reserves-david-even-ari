/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		

		int num2 = 0;
		int num3= 0;
		int num4 = 0;
		

		double sumNum = 0;
		
	
		for (int i = 0; i < T; i++) {
			boolean boy = false;
		    boolean girl = false;
		    int count = 0;
		    while (!(boy && girl)) {
			    double rnd = Math.random();
			    if (rnd < 0.5) {
				    boy = true;
				
			    } else {
				    girl = true;
				  
			    }
			    count++;
		    }
		
			sumNum = sumNum + count; 
			
			if (count == 2) {
				num2++;
			} else {
			    if (count == 3) {
			    	num3++;
			    } else {
			        num4++;
			    }
			}
		}
		
		double avreage = sumNum / T;
		
		System.out.println("Average: " + avreage + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + num2);
		System.out.println("Number of families with 3 children: " + num3);
		System.out.println("Number of families with 4 or more children: " + num4);
		

		String mode = "The most common number of children is ";
		int max = Math.max(Math.max(num2, num3),
			               num4);
		if (max == num2) {
			mode = mode + "2.";
		} else {
			if (max == num3) {
				mode = mode + "3.";
			} else {
			    mode = mode + "4 or more.";
			}
		}
		System.out.println(mode);
	}
}