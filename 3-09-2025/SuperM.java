import java.util.ArrayList;
import java.util.Scanner;
interface Slip{
    void Items(Scanner sc);
    void Bill();
}
class Bhatbhateni implements Slip{
    private ArrayList<String> items=new ArrayList<>();
    private ArrayList<Integer> quantities = new ArrayList<>();
    private ArrayList<Double> prices = new ArrayList<>();
    
    private double total = 0.0;
    private double vat = 13; // VAT percentage
    private double discount = 0.0;
    private double grandTotal = 0.0;

    private String customerName;
    private static int billCounter = 1;
    private int billNo;
    
    public Bhatbhateni() {
        this.billNo = billCounter++;
    }

    @Override
    public void Items(Scanner sc){
        System.out.println("Enter Customer Name:");
        customerName=sc.nextLine();

        System.out.println("How many items do you want to buy?");
        int n= sc.nextInt();
        sc.nextLine();

        for (int i=0;i<n;i++){
            System.out.print("Enter item name: ");
            String item = sc.nextLine();
            items.add(item);

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            quantities.add(qty);

            System.out.print("Enter price per unit: ");
            double price = sc.nextDouble();
            prices.add(price);

            sc.nextLine();
        }
    }

    @Override
    public void Bill(){
         System.out.println("\n========== BHATBHATENI SUPERMARKET ==========");
        System.out.println("Bill No: " + billNo);
        System.out.println("Customer: " + customerName);
        System.out.println("---------------------------------------------");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Item", "Qty", "Price", "Total");

        for (int i = 0; i < items.size(); i++) {
            double itemTotal = quantities.get(i) * prices.get(i);
            total += itemTotal;
            System.out.printf("%-15s %-10d %-10.2f %-10.2f\n", 
                              items.get(i), quantities.get(i), prices.get(i), itemTotal);
        }

        double vatAmount = (total * vat) / 100;
        grandTotal = total + vatAmount - discount;

        System.out.println("---------------------------------------------");
        System.out.printf("Sub Total: %.2f\n", total);
        System.out.printf("VAT (%.0f%%): %.2f\n", vat, vatAmount);
        System.out.printf("Discount: %.2f\n", discount);
        System.out.printf("Grand Total: %.2f\n", grandTotal);
        System.out.println("=============================================");
    
    }
}

public class SuperM {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Bhatbhateni bh=new Bhatbhateni();
        bh.Items(sc);
        bh.Bill();
        sc.close();
    }
}
