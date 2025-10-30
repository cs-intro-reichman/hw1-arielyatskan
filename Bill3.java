// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int bill = Integer.parseInt(args[3]); // Taking the forth String, which is the bill, 
		                                      // and convert it to int form of Data
		double share = bill / 3;
		share = Math.ceil(share);
		System.out.println("Dear " + name3 + ", " + name2 + " and " + name1 + 
	                       ": Pay " + share + " Shekels each");
	}
}
