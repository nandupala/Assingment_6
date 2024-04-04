import java.util.Scanner;
public class NumbersSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;
        char choice;
        do 
        {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            small = Math.min(small, num);
            large = Math.max(large, num);
            sum += num;
            count++;
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);
        }
        while (choice == 'y' || choice == 'Y');
        if (count > 0) {
            double avg = (double) sum / count;
            System.out.println("Smallest number entered: " + small);
            System.out.println("Largest number entered: " + large);
            System.out.println("Average of all numbers entered: " + avg);
        } 
        else {
            System.out.println("No numbers were entered.");
        }
        sc.close();
    }
}
