// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		int ones = num % 10;
		int tens = (num / 10) % 10;
		int hundreds = (num / 100) % 10;
		if(hundreds == 0) {
			System.out.print("No hundreds, ");
		} else {
			if(hundreds == 1) {
				System.out.print("1 hundred, ");
			} else{
				System.out.print(hundreds + " hundreds, ");
			}
		}
		if(tens == 0) {
			System.out.print("No tens, and ");
		} else {
			if(tens == 1) {
				System.out.print("1 ten, and ");
			} else{
				System.out.print(tens + " tens, and ");
			}
		}
		if(ones == 0) {
			System.out.print("No ones.");
		} else {
			if(ones == 1) {
				System.out.print("1 one.");
			} else{
				System.out.print(ones + " ones.");
			}
		}
	}
}
