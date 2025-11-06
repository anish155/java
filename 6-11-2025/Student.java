public class Student extends Work {

    private String course;
    private String university;
    private int year;

    public Student(String name, String address, int status, String course, String university, int year) {
        super(name, address, status); // calling Work constructor
        this.course = course;
        this.university = university;
        this.year = year;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCourse() {
        return course;
    }

    public String getUniversity() {
        return university;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void Info() throws Exception {
        super.Info(); // show Work info first
        System.out.println("Course: " + course);
        System.out.println("University: " + university);
        System.out.println("Year: " + year);
    }

    @Override
    public void Feature() {
        if (getStatus() == 1) {
            System.out.println("\nStudent Employment Details:");
            System.out.println(getName() + " is working part-time as a Teaching Assistant.");
            System.out.println("Balancing studies and work effectively.");
            System.out.println("Earning a stipend of $500 per month.");
        } else if (getStatus() == 0) {
            System.out.println("\nStudent Activities:");
            System.out.println(getName() + " is focusing full-time on studies.");
            System.out.println("Currently participating in coding bootcamps and hackathons.");
            System.out.println("Looking for internship opportunities for next semester.");
        } else {
            System.out.println("\nInvalid student status data.");
        }
    }
}

