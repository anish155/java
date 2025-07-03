class Call {
    public void firstloop() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void secondloop() {
        firstloop(); 
        for (int j = 11; j <= 20; j++) {
            System.out.println(j);
        }
    }
}

public class Basic {
    public static void main(String[] args) {
        Call c = new Call();
        c.secondloop();
    }
}
