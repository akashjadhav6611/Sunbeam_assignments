// Pascal's Triangle
public class Pascal_by_aditya {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) { // loop to make spaces
				System.out.print(" ");
			}
			System.out.print(Pascal_by_aditya.makeSpace((int) Math.pow(11, i - 1)) + " ");

			System.out.println();
		}
	}

	private static String makeSpace(int pow) {
		String str = Integer.toString(pow); // converting int to String
		if (str.length() == 1)
			return str;
		else {
			String res = "";
			for (int i = 0; i < str.length(); i++) {
				res = res + str.substring(i, i + 1) + " "; // adding spaces after every digit
			}
			return res.trim();
		}
	}

}
