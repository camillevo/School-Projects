import java.util.Scanner;
public class BobcarDifferentVersion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Bobcat Rent-a-Car!\n");
		
		System.out.println("Which kind of car would you like? Please enter Economy, Compact or Standard.");
		String car = input.next();
		
		System.out.println("How many days would you like to rent this car?");
		int days = input.nextInt();
		
		System.out.println("Are you a club member? Please enter \"yes\" or \"no\".");
		String clubMember = input.next();
		String platinum = "no";
		
		if(clubMember.equals("yes")) {
			System.out.println("Would you like the Platinum Executive Package? Please enter \"yes\" or \"no\".");
			platinum = input.next();
		}
		
		int price = 0;
		if(car.equals("Economy") || car.equals("economy")) 
			price = 35;
		else if(car.equals("Compact") || car.equals("compact"))
			price = 45;
		else if(car.equals("Standard") || car.equals("standard"))
			price = 95;
		else 
			System.out.println("Please restart program");
		
		int basePrice = price * days;
		int discount = 0;
		if(clubMember.equals("yes"))
			discount = (int)(days / 7 * price);
		
		double platinumPackage = 0.0;
		if(platinum.equals("yes"))
			platinumPackage = basePrice * 0.15;
		
		double total = basePrice - discount + platinumPackage;
		
		System.out.println("\nBase price for " + days + " days with " + car + " car: $" + basePrice);
		if (clubMember.equals("yes"))
			System.out.println("Club Member Discount:                  -$" + discount);
		if (platinum.equals("yes"))
			System.out.println("Platinum Executive Package:            +$" + platinumPackage);
		System.out.println("Total:                                  $" + total);
		
input.close();
	}

}
