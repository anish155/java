import java.util.Random;
class Messages{
    String[] notify_messages={"this is game notification","this is phone notification","this is unanimous notification"};
    public void Notification(Random random){
        System.out.print("You have  a notification:");
        int index=random.nextInt(notify_messages.length);
        System.out.print(notify_messages[index]);
        System.out.println();
    }
}
class Email_message extends Messages{
    String[] email={"This is an email from college","this is an email from the game.co","this is a spam message"};
    @Override
    public void Notification(Random random){
        super.Notification(random);
        System.out.print("You have  an email notification:");
        int index=random.nextInt(email.length);
        System.out.print(email[index]);
    }

    
}
public class Over {
    public static void main(String[] args) {
        Random random=new Random();
        Email_message em=new Email_message();
        em.Notification(random);
    }
}
