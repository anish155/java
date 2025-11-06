public class Work implements Person {
    private String name, address;
    private int status; // 0 = unemployed, 1 = employed

    Work(String name, String address, int status) {
        this.name = name;
        this.address = address;
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public void Info() throws Exception {
        System.out.println("Person's Identity:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);

        if (status == 0) {
            System.out.println(name + " is unemployed currently.");
        } else if (status == 1) {
            System.out.println(name + " is employed currently.");
        } else {
            throw new Exception("Invalid status value. Use 0 for unemployed, 1 for employed.");
        }
    }

    @Override
    public void Feature() {
        if (status == 1) {
            System.out.println("\nEmployment Details:");
            System.out.println(name + " works full-time at a reputed company.");
            System.out.println("Position: Software Developer");
            System.out.println("Salary: $4000 per month");
            System.out.println("Work Type: Hybrid (Office + Remote)");
        } 
        else if (status == 0) {
            System.out.println("\nCurrent Activities:");
            System.out.println(name + " is currently seeking job opportunities.");
            System.out.println("Learning new skills like Java and Python.");
            System.out.println("Actively networking and applying for internships.");
        } 
        else {
            System.out.println("\nNo valid employment data available.");
        }
    }
}
