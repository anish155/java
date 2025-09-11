public class X {
    public static void main(String[] args){
        int x=0;
        for (int i =1; i<=5;i++){
            x+=i%2==0?i*2:i;
        }
        System.out.println(x);
    }
}
