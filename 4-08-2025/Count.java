import java.util.Scanner;
class Alpha{
    public String word;
    public void Input(Scanner sc){
        System.out.println("Enter the letter:");
        word=sc.nextLine().toLowerCase();
    }
    public void Vow_Const(){
        int vow_count=0;
        int const_count=0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vow_count++;
                } else {
                    const_count++;
                }
            }
            else{
            System.out.println("Cant count numbers and symbols.");
            }
        }

        System.out.println("Vowels: " + vow_count);
        System.out.println("Consonants: " + const_count);

    }
}
public class Count {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Alpha a =new Alpha();
        a.Input(sc);
        a.Vow_Const();
        sc.close();
    }
}
