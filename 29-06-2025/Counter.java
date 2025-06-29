import java.awt.*;
import java.awt.event.*;
public class Counter {
    public static void main(String[] args) {
        Frame f=new Frame("Count");
        f.setLayout(null);
        Button b=new Button("Click Here");
        b.setBounds(300, 200, 200, 80);

        final int[] count = {0};

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count[0]++;
                b.setLabel("Count: " + count[0]);
            }
        });

        f.add(b);
        f.setSize(800, 500);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });
    }
}
