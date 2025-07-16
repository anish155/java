import java.util.Scanner;
class Str{
    private String word;
    public void Take_word(Scanner sc){
        System.out.println("Enter the letter:");
        word=sc.nextLine();
    }
    public void Reversing(){
        for(int i=word.length()-1;i>=0;i--){
           System.out.print(word.charAt(i)); 
        }
        System.out.println();
    }
}
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Str s=new Str();
        s.Take_word(sc);
        System.out.println("Reversed word:");
        s.Reversing();
        sc.close();
    }
}
