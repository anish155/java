interface Person{
    void setName(String name);
    String getName();
    void setAddress(String address);
    String getAddress();
    void setPhone(Long number);
    Long getPhone();
}
class Details implements Person{
    private String name, address;
    private Long number;

    Details(String name, String address, Long number){
        this.name=name;
        this.address=address;
        this.number=number;
    }

    @Override
    public void setName(String name){
        this.name=name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setAddress(String address){
        this.address=address;
    }

    @Override
    public String getAddress(){
        return address;
    }

    @Override
    public void setPhone(Long number){
        this.number=number;
    }

    @Override
    public Long getPhone(){
        return number;
    }

    public void Display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Phone: "+number);
    }

}

public class Id {
    public static void main(String[] args) {
        Details d1=new Details("Anish","Kalanki",9761722345L);
        Details d2=new Details("Nischal","Kritipur",9865432179L);
        d1.Display();
        d2.Display();
    }
}
