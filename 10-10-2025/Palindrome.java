import java.util.Scanner;
class Checker{
    private String word;
    Checker(){
        this.word="none";
    }
    public void Take(Scanner sc){
        System.out.println("Enter the word:");
        word=sc.nextLine();
    }

    public void Check(){
        String reversed="";

        for (int i=word.length()-1;i>=0;i--){
            reversed+=word.charAt(i);
        }

        if (word.equalsIgnoreCase(reversed)){
            System.out.println(word+" is a Palindrome.");
        }
        else{
            System.out.println(word+" is not a Palindrome.");
        }
    }
}

public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Checker ch=new Checker();
        ch.Take(sc);
        ch.Check();
        sc.close();
    }
}
