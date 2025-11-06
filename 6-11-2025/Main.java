public class Main {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Anish", "Kathmandu", 1, "Computer Science", "LBU University", 3);
            Student s2 = new Student("Bikash", "Pokhara", 0, "Information Technology", "Patan College", 2);

            System.out.println("----- Student 1 -----");
            s1.Info();
            s1.Feature();

            System.out.println("\n----- Student 2 -----");
            s2.Info();
            s2.Feature();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

