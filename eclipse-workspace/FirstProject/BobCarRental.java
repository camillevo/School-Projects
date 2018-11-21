import java.util.Scanner;

public class BobCarRental {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Available cars: 1 for Economy, 2 for Compact, 3 for Standard");

		System.out.print("Please choose the rental car: ");
		int car = input.nextInt();

		System.out.print("Please enter the number of rental days: ");
		int days = input.nextInt();

		System.out.print("Club member?: 1 for yes, 0 for no: ");
		int clubMember = input.nextInt();
		int platinum = 0;

		if(clubMember == 1) {
			System.out.print("Platinum Executive Package?: 1 for yes, 0 for no: ");
			platinum = input.nextInt();
		}

		int price = 0;
		String carType = "";
		if(car == 1) {
			carType = "Economy";
			price = 35;
		} else if(car == 2) {
			carType = "Compact";
			price = 45;
		} else if(car == 3) {
			carType = "Standard";
			price = 95;
		}
		else 
			System.out.println("Please restart program");

		int basePrice = price * days;
		int discount = 0;
		if(clubMember == 1)
			discount = (int)(days / 7 * price);

		double platinumPackage = 0.0;
		if(platinum == 1)
			platinumPackage = basePrice * 0.15;

		double total = basePrice - discount + platinumPackage;

		System.out.println("\nBase price for " + days + " days with " + carType + " car: $" + basePrice);
		if (clubMember == 1)
			System.out.println("Club Member Discount:                  - $" + discount);
		if (platinum == 1)
			System.out.println("Platinum Executive Package:            + $" + platinumPackage);
		System.out.println("Total:                                   $" + total);

		input.close();
	}

}
