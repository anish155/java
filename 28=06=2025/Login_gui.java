import java.awt.*;
import java.awt.event.*;

class LoginComponent {
    Frame f = new Frame("Login Form");
    Button b = new Button("Submit");
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    Label l1 = new Label("Username:");
    Label l2 = new Label(" ");
    Label l3 = new Label("Password:");
    Label l4 = new Label(" ");

    LoginComponent() {
        f.setSize(300, 200);
        f.setLayout(new GridLayout(3, 2, 10, 10)); // Simple layout

        f.add(l1);
        f.add(t1);
        f.add(l3);
        f.add(t2);
        f.add(l2);
        f.add(b);

        f.setVisible(true);

        // Optional: close button
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }
}

public class Login_gui {
    public static void main(String[] args) {
        new LoginComponent();
    }
}
