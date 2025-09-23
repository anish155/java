import java.util.ArrayList;
import java.util.Scanner;

class Work{
    private String title,body;
    private Boolean progress_bar;
    Work(){
        this.title="none";
        this.body="none";
        this.progress_bar=false;
    }
    public void take(Scanner sc){
        System.out.println("Enter the title for the task:");
        title=sc.nextLine();
        System.out.println("Enter the contents of the task:");
        body=sc.nextLine();
        System.out.print("Is the task done? (yes/no): ");
        String ans = sc.nextLine().trim().toLowerCase();
        progress_bar = ans.equals("yes") || ans.equals("y");
    }

        public void display() {
        System.out.println("Title: " + title);
        System.out.println("Contents: " + body);
        System.out.println("Status: " + (progress_bar ? "[Done]" : "[Left]"));
        System.out.println("------------------------");
    }
}

public class TODO {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Work> tasks=new ArrayList<>();
        while (true) { 
            System.out.println("\n=== TO-DO LIST MENU ===");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    Work task=new Work();
                    task.take(sc);
                    tasks.add(task);
                    break;
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        for (Work t : tasks) {
                            t.display();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
