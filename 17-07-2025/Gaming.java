import java.util.Scanner;
interface Playable{
    void Play(Scanner sc);
}
class Game implements Playable{
    private String g_name;

    public Game(){
        this.g_name="none";
    }
    @Override
    public void Play(Scanner sc){
        System.out.println("Enter the games:");
        g_name=sc.nextLine();
    }
    public void Display(){
        System.out.println("Displaying the name of the sport:");
        System.out.println(g_name);
    }
}
public class Gaming {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Game g=new Game();
        g.Play(sc);
        g.Display();
        sc.close();
    }
}
