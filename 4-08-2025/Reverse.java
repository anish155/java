import java.util.Scanner;
class Word{
    public String word;
    public void Input(Scanner sc){
        System.out.println("Enter the letter:");
        word=sc.nextLine();
    }
    public void Reversing(){
        String reversed="";
        for(int rev=word.length()-1;rev>=0;rev--){
            reversed+=word.charAt(rev);
        }
        System.out.println("Reversed String:"+reversed);
    
    }
}
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Word w=new Word();
        w.Input(sc);
        w.Reversing();
        sc.close();
    }
}
