import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int hotelCostPerNight = scanner.nextInt();

        int totalBudget = foodCostPerDay * days + flightCost * 2 + (days - 1) * hotelCostPerNight;
        System.out.println(totalBudget);

    }
}