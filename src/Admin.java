import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin {
    JFrame f;
    Container c;
    JTextField name;
    JPasswordField usepass;
    public Admin()
    {


            f = new JFrame("Admin Panel") ;
            f.setVisible(true);
            Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell\\IdeaProjects\\SSSIC\\src\\hello.png");
            f.setIconImage(icon);
            f.setBackground(Color.cyan);
            f.setSize(500,500);
            c = f.getContentPane();
            c.setLayout(null);
            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (int) ((dimension.getWidth() - f.getWidth()) / 2);
            int y = (int) ((dimension.getHeight() - f.getHeight()) / 2);
            f.setLocation(x, y);
            f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
            JLabel lb = new JLabel("WELCOME ADMIN");
            lb.setFont(new Font("ALGERIAN", Font.BOLD,55));
            lb.setBackground(Color.BLUE);
            lb.setForeground(Color.red);
            final JLabel usname = new JLabel("User Name");
            final JLabel uspass = new JLabel("Password");
            name = new JTextField(50);
            usname.setBackground(Color.blue);
            usepass = new JPasswordField(20);
            usepass.setEchoChar('*');
            JButton jb = new JButton("Login");
            lb.setBounds(500,20,1000,100);
            usname.setBounds(665,130,500,40);
            name.setBounds(600,160,200,40);
            uspass.setBounds(665,240,500,40);
            usepass.setBounds(600,270,200,40);
            jb.setBounds(510,350,200,50);
            f.add(lb);
            f.add(usname);
            f.add(name);
            f.add(uspass);
            f.add(usepass);
            f.add(jb);

            JButton aexit = new JButton("Exit");
            aexit.setBounds(710,350,200,50);
            f.add(aexit);
            aexit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new Main();
                    f.setVisible(false);
                }
            });
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String uname=name.getText().toString();
                String pass = usepass.getText().toString();
                System.out.println("hello");
                if(uname.equals("aditi")&& pass.equals("aditi1234")){
                    System.out.println("Welcome in admin panel");
                    new AdminPanel();
                    f.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(f,"Sorry, username or password error!");
                    new Admin();
                    f.setVisible(false);
                }
            }
        });
    }
}
