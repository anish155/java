import java.awt.*;
import java.awt.event.*;
class Component{
    Frame page=new Frame("Form");
    Label l1=new Label("Name:");
    TextField t1=new TextField();
    Label l2=new Label("Address:");
    TextField t2=new TextField();
    Label l3=new Label("Phone:");
    TextField t3=new TextField();
    Button b=new Button("Submit");

    public Component() {
        page.setLayout(null);
        page.add(l1);
        l1.setBounds(50, 40, 100, 30);
        page.add(t1);
        t1.setBounds(150, 40, 300, 30);

        page.add(l2);
        l2.setBounds(50, 80, 100, 30);
        page.add(t2);
        t2.setBounds(150, 80, 300, 30);

        page.add(l3);
        l3.setBounds(50, 120, 100, 30);
        page.add(t3);
        t3.setBounds(150, 120, 300, 30);

        page.add(b);
        b.setBounds(200, 180, 100, 40);
        page.setSize(800, 500);
        page.setVisible(true);
        page.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                page.dispose();
            }
        });
    }
    
}
public class gui {
    public static void main(String[] args) {
        new Component();
    }
}
