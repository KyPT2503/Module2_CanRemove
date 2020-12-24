import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static Hotel hotel = new Hotel();
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            addCustomer();
        }
        displayAllCustomer();
        checkout();
    }

    private static void addCustomer() {
        System.out.print("Name :");
        String name = scanner.nextLine();
        System.out.print("Birthday :");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Card number: ");
        String cardNumber = scanner.nextLine();
        System.out.print("How many day? ");
        int dayCount = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Kind of room: ");
        String kindOfRoom = scanner.nextLine();
        String[] rooms = new String[3];
        rooms[0] = "small";
        rooms[1] = "normal";
        rooms[2] = "luxury";
        if (Arrays.binarySearch(rooms, kindOfRoom) == -1){
            System.out.println("Kind of room is not valid.");
        }
        hotel.addCustomer(new Customer(name, new int[]{day, month, year}, cardNumber, dayCount, kindOfRoom));
    }

    private static void displayAllCustomer() {
        System.out.println(hotel);
    }

    private static void checkout() {
        System.out.println("Type card number of customer want to checkout: ");
        try {
            String cardNumber = scanner.next();
            System.out.println(hotel.getBill(cardNumber));
            hotel.removeCustomer(cardNumber);
            System.out.println("Customer removed!");
        } catch (Exception e) {
            System.out.println(e);
        }
        displayAllCustomer();
    }
}
