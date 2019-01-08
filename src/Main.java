import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main  {
    JFrame f;
    Container c;

    public Main()
    {
      f = new JFrame("SSSIC") ;
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
      JLabel lb = new JLabel("WELCOME TO SSSIC");
      lb.setBackground(Color.yellow);
      lb.setForeground(Color.lightGray);
      lb.setFont(new Font("TimesNewRoman",Font.BOLD,45));
      lb.setBounds(450,20,600,100);
      f.add(lb);
      JButton adminpart = new JButton("ADMIN PORTAL");
      JButton accountantpart = new JButton("ACCOUNTANT PORTAL");
      JButton Staffpart = new JButton("TEACHERS PORTAL");
      JButton studentpart = new JButton("STUDENT PORTAL");
      adminpart.setBounds(550,200,200,50);
      Staffpart.setBounds(550,280,200,50);
      accountantpart.setBounds(550,360,200,50);
      studentpart.setBounds(550,440,200,50);
      f.add(adminpart);
      f.add(Staffpart);
      f.add(accountantpart);
      f.add(studentpart);
      adminpart.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              new Admin();
              f.setVisible(false);
          }

      });
      Staffpart.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              new StaffMembers();
              f.setVisible(false);
          }

      });
      accountantpart.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              new Accountant();
              f.setVisible(false);
          }
      });
      studentpart.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              new Student();
              f.setVisible(false);
          }
      });




    }


}
