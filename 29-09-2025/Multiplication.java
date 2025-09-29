import java.util.Scanner;
class Table{

    private int multiplicable;

    Table(){
        this.multiplicable=0;
    }

    public void Take(Scanner sc){
        System.out.println("Enter the number you want the table of:");
        multiplicable=sc.nextInt();
        sc.nextLine();
    }

    public void Product(){
        System.out.println("Printing the table for "+multiplicable);
        for (int i=0;i<=10;i++){
            System.out.println(multiplicable+"X"+i+"="+multiplicable*i);
        }
    }
}
public class Multiplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Table tb=new Table();
        tb.Take(sc);
        tb.Product();
        sc.close();
    }
}
