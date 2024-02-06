
public class OneOfEach {
	public static void main (String[] args) {
		boolean boy = false;
		boolean girl = false;
		int count = 0;
		while (!(boy && girl)) {
			double rnd = Math.random();
			if (rnd < 0.5) {
				boy = true;
				System.out.print("b ");
			} else {
				girl = true;
				System.out.print("g ");
			}
			count++;
		}
		System.out.println();
		System.out.println("You made it... and you now have " + count + " children.");		
	}
}