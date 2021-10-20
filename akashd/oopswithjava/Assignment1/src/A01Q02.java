import java.util.Scanner;

class Q02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		double totalBill = 0;
		while(!exit) {
			System.out.println("Choose from the items below");
			System.out.println("1. Dosa");
			System.out.println("2. Samosa");
			System.out.println("3. Idli");
			System.out.println("4. Jalebi");
			System.out.println("5. Sandwich");
			System.out.println("6. Shegav Kachori");
			System.out.println("7. Coca-cola");
			System.out.println("8. Fanta");
			System.out.println("9. Paneer Sandwich");
			System.out.println("10. Total Bill");

			switch(sc.nextInt()) {
				case 1: // Dosa
					System.out.println("Enter quantity");
					totalBill += (60*sc.nextInt());
					System.out.println("Item added to total");
				break;
				case 2: // Samosa
					System.out.println("Enter quantity");
					totalBill += (20*sc.nextInt());
					System.out.println("Item added to total");
				break;
				case 3: // Idli
					System.out.println("Enter quantity");
					totalBill += (20*sc.nextInt());
					System.out.println("Item added to total");
				break;
				case 4: // Jalebi
					System.out.println("Enter quantity");
					totalBill += (50*sc.nextInt());
					System.out.println("Item added to total");
				break;
				case 5: // Sandwich
					System.out.println("Enter quantity");
					totalBill += (15*sc.nextInt());
					System.out.println("Item added to total");
				break;
				case 6: // Shegav Kachori
					System.out.println("Enter quantity");
					totalBill += (35*sc.nextInt());
					System.out.println("Item added to total");
				break;
				case 7: // Coca-cola
					System.out.println("Enter quantity");
					totalBill += (65*sc.nextInt());
					System.out.println("Item added to total");
				break;
				case 8: // Fanta
					System.out.println("Enter quantity");
					totalBill += (70*sc.nextInt());
					System.out.println("Item added to total");
				break;
				case 9: // Paneer Sandwich
					System.out.println("Enter quantity");
					totalBill += (35*sc.nextInt());
					System.out.println("Item added to total");
				break;
				case 10:
					System.out.println("Total Bill: " + totalBill);
					exit = true;
				break;
			}
		}
	sc.close();
	}
}