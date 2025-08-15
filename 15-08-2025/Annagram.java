import java.util.Arrays;
import java.util.Scanner;
class Child{
    private String word1,word2;
    public Child(){
        this.word1="none";
        this.word2="none";
    }

    public void Take(Scanner sc){
        System.out.println("Enter the letter 1:");
        word1=sc.nextLine();
        System.out.println("Enter the letter 2:");
        word2=sc.nextLine();
    }

    public void Check(){
        char[] arr1=word1.toCharArray();
        char[] arr2=word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println(word1+" is a annagram to "+word2);
        }
        else{
            System.out.println(word1+" is not a annagram to "+word2);
        }
    }

}

public class Annagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Child c=new Child();
        c.Take(sc);
        c.Check();
        sc.close();
    }
    
}
