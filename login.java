
import java.awt.Image;

import javax.swing.*;

public class login extends JFrame {
    login() {
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3); 
        image.setBounds(350, 10, 100,  100);
        add(image);

    //    ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
    //     Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
    //     ImageIcon ii3 = new ImageIcon(ii2);
    //     JLabel image = new JLabel(ii3); 
    //     image.setBounds(350, 10, 100,  100);
    //     add(image);  

        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        login l = new login();
    }
}