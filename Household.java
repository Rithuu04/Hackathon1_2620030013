import java.util.Scanner;

public class Household {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----HOUSEHOLD DETAILS----");

        System.out.print("Number of Family Members: ");
        int familyMembers = sc.nextInt();

        System.out.print("Enter Water Consumed in Litres: ");
        double waterConsumed = sc.nextDouble();

        System.out.print("Enter House Number: ");
        int houseNumber = sc.nextInt();

        System.out.print("Water Usage Status: ");
        char waterUsageStatus = sc.next().charAt(0);

        System.out.println("\nFamily Members: " + familyMembers);
        System.out.println("Water Consumed in Litres: " + waterConsumed);
        System.out.println("House Number: " + houseNumber);
        System.out.println("Water Usage Status: " + waterUsageStatus);

        System.out.println("\n----WATER BILL DETAILS----");

        System.out.print("Enter Water Consumption in litres: ");
        int waterConsumption = sc.nextInt();

        if (waterConsumption >= 500) {
            System.out.println("Water Bill: Rs.100");
        } else {
            System.out.println("Water Bill: Rs.200");
        }

        System.out.print("\nEnter morning water usage: ");
        int morning = sc.nextInt();

        System.out.print("Enter evening water usage: ");
        int evening = sc.nextInt();

        int totalConsumption = calculateTotal(morning, evening);

        System.out.println("Total water consumption = " + totalConsumption);

        sc.close();
    }

    public static int calculateTotal(int morning, int evening) {
        return morning + evening;
    }
}
