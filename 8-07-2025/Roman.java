import java.util.HashMap;
import java.util.Scanner;
class Value{
    public String roman;
    public Value(){
        this.roman="none";
    }
    public void Take(Scanner sc){
        System.out.println("Enter the roman number:");
        roman=sc.nextLine().toUpperCase();
    }
    public void Check(){
         HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
         int total = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char ch = roman.charAt(i);
            int value = romanMap.getOrDefault(ch, 0);

            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }

            prevValue = value;
        }

        System.out.println("The integer value of " + roman + " is: " + total);
    }
}

public class Roman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Value v=new Value();
        v.Take(sc);
        v.Check();
        sc.close();
    }
}
