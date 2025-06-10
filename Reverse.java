import java.util.Scanner;
class In_data{
    private String data;
    public In_data(){
        this.data="none";
    }
    public void Inp(Scanner sc){
        System.out.println("Enter the letter:");
        data=sc.nextLine();
    }
    public void Change(){
        String reversed="";
        for(int reverse=data.length()-1;reverse>=0;reverse--){
            reversed+=data.charAt(reverse);
        }
        System.out.println("Reversed data: " + reversed);
    }
}
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        In_data i=new In_data();
        i.Inp(sc);
        i.Change();
        sc.close();
    }
}
