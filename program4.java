package program4;

import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		String items[] = { "Bread", "Milk", "Butter", "Chips", "Honey", "Soap", "Towel", "Carrots", "Beans", "Samp",
				"Dress", "Pants", "Shoes", "Socks" };

		double prices[] = { 15.5, 12, 56, 20, 45, 7, 75, 8, 5, 12, 200, 150, 400, 25 };

		double sum = 0, average = 0;

		System.out.println("Items in stock with prices");
		System.out.println("------------------------------------------------------------");

		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i] + " - " + "R " + prices[i]);
			sum = sum + prices[i];
		}
		average = sum / items.length;
		System.out.printf("The average price off all the items is R %.2f ", average);

		System.out.println("\nItem look up");

		System.out.println("What item are you looking for ?");
		String item = input.nextLine();

		boolean itemfound = false;

			for (int i = 0; i < items.length; i++) {

				if (items[i].equalsIgnoreCase(item)) {
					System.out.println("The price of item " + item + " is " + prices[i]);
				}

			}
			if (itemfound != false) {
				System.out.println("Item " + item + " is not stocked in the shop.");

			}
		}
}