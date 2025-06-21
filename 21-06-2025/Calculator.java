import java.util.Scanner;
class Calculation{
    private int num1,num2;
    public Calculation(){
        this.num1=0;
        this.num2=0;
    }
    public void take_num(Scanner sc){
        System.out.println("Enter the first number:");
        num1=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the second number:");
        num2=sc.nextInt();
        sc.nextLine();
    }
    public int Addition(){
        return num1+num2;
    }
    public int Subtraction(){
        return num1-num2;
    }
    public int Multiplication(){
        return num1*num2;
    }
    public double  Division(){
         if (num2 == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
        return (double) num1 / num2;
    }
}
public class Calculator {
    public static void Option(Scanner sc){
        System.out.println("\n Operations");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit \n\n");
        Calculation c=new Calculation();
        System.out.println("Enter the option:");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            c.take_num(sc);
            System.out.println("Result: " + c.Addition());
            break;

            case 2:
            c.take_num(sc);
            System.out.println("Result: " + c.Subtraction());
            break;

            case 3:
            c.take_num(sc);
            System.out.println("Result: " + c.Multiplication());
            break;

            case 4:
            c.take_num(sc);
            double result = c.Division();
                if (!Double.isNaN(result))
                    System.out.println("Result: " + result);
                break;

            case 5:
            System.out.println("Exiting the program.");
            System.exit(0);

            default:
            System.out.println("Invalid option. Try again!");
            break;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (true) { 
            Option(sc);
        } 
    }
}
