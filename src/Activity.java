import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Activity {
    JFrame f;
    Container c;

    public Activity() {


        f = new JFrame("Activity Details");
        f.setVisible(true);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell\\IdeaProjects\\SSSIC\\src\\hello.png");
        f.setIconImage(icon);
        f.setBackground(Color.cyan);
        f.setSize(500, 500);
        c = f.getContentPane();
        c.setLayout(null);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - f.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - f.getHeight()) / 2);
        f.setLocation(x, y);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        JButton aexit = new JButton("Exit");
        aexit.setBounds(710,350,200,50);
        f.add(aexit);
        aexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AdminPanel();
                f.setVisible(false);
            }
        });
    }
}
