import java.util.Scanner;

public class TotalExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        double totalExpenses;

        if (quantity < 25) {
            totalExpenses = quantity * pricePerItem;
        } else if (quantity >= 25 && quantity <= 50) {
            totalExpenses = quantity * pricePerItem * 0.95; // 5% discount
        } else {
            totalExpenses = quantity * pricePerItem * 0.90; // 10% discount for quantities over 50 (not specified in the original problem)
        }

        System.out.println("Total expenses: $" + totalExpenses);

        scanner.close();
    }
}
