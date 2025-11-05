import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value for division:");
        String inpt=sc.nextLine();

        LetterException le=new LetterException(inpt);
        
        try {
            le.Operation();
        } 
        catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        sc.close();
    }
}
