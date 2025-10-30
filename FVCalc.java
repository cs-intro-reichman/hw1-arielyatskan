// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]) / 100;
		int years = Integer.parseInt(args[2]);
		double futureValue = currentValue * Math.pow((1 + rate), years);
		rate = rate * 100;  // Correcting rate in order to present at output correctly.
		System.out.println("After " + years + " years, $" + currentValue + " saved at " +
		                   rate + "% will yield $" + (int) futureValue);
	}
}