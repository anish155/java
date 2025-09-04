import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Sub{
    private ArrayList<Character> word1,word2;
    public Sub(){
        this.word1= new ArrayList<>();
        this.word2= new ArrayList<>();
    }
    public void Take(Scanner sc){
        System.out.print("Enter first word: ");
        String w1 = sc.nextLine().toLowerCase();
        System.out.print("Enter second word: ");
        String w2 = sc.nextLine().toLowerCase();

        for (char c : w1.toCharArray()) {
            if (Character.isLetter(c)) word1.add(c);
        }
        for (char c : w2.toCharArray()) {
            if (Character.isLetter(c)) word2.add(c);
        }
    }
    public boolean isAnnagram(){
        if(word1.size()!=word2.size()) return false;
        Collections.sort(word1);
        Collections.sort(word2);

        return word1.equals(word2);
    }
}

public class Annagram {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Sub s=new Sub();
        s.Take(sc);

        if(s.isAnnagram()){
            System.out.println("They are Annagram.");
        }
        else{
            System.out.println("They are not Annagram.");
        }
        sc.close();
    }
}
