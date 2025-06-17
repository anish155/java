import java.util.Scanner;

interface Billing {
    void Date(Scanner sc);
    void Price(Scanner sc);
    void Products(Scanner sc);
}

class Mart implements Billing {
    private String[] item;
    private int date;
    private int[] price;
    private int totalItems;

    public Mart() {
        this.item = new String[25];
        this.price = new int[25];
        this.date = 0;
        this.totalItems = 0;
    }

    @Override
    public void Date(Scanner sc) {
        System.out.print("Enter the date (e.g., 20250617): ");
        date = sc.nextInt();
        sc.nextLine(); 
    }

    @Override
    public void Price(Scanner sc) {
        for (int i = 0; i < totalItems; i++) {
            System.out.print("Enter price for " + item[i] + ": ");
            price[i] = sc.nextInt();
        }
        sc.nextLine(); 
    }

    @Override
    public void Products(Scanner sc) {
        System.out.print("Enter number of items you want to purchase: ");
        totalItems = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < totalItems; i++) {
            System.out.print("Enter name of item " + (i + 1) + ": ");
            item[i] = sc.nextLine();
        }
    }

    public void Receipt() {
        System.out.println("\n========== RECEIPT ==========");
        System.out.println("Date: " + date);
        int total = 0;
        for (int i = 0; i < totalItems; i++) {
            System.out.println("Item: " + item[i] + " | Price: Rs. " + price[i]);
            total += price[i];
        }
        System.out.println("-----------------------------");
        System.out.println("Total Amount: Rs. " + total);
        System.out.println("Thank You for Visiting!");
    }
}

public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mart m = new Mart();
        m.Date(sc);
        m.Products(sc);
        m.Price(sc);
        m.Receipt();
        sc.close();
    }
}
