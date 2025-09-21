import java.util.Scanner;
class Traffic{
    private String[] light={"red","yellow","green"};
    private int[] durations={5,2,4};
    
    public void run(int cycles){
        for (int i=0;i<cycles;i++){
            for (int j =0;j<light.length;j++){
                countdown(light[j], durations[j]);
            }
        }
    }

    public void countdown(String light,int durations){
        for (int t = durations; t > 0; t--) {
            System.out.println(light + " light - " + t + " seconds remaining");
            try {
                Thread.sleep(1000); // wait 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class X{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("How many cycles do you want to run? ");
        int cycles = sc.nextInt();
        sc.close();

        Traffic t = new Traffic();
        t.run(cycles);
    }
}
