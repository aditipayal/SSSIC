import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentPanel {
    JFrame f;
    Container c;
    public StudentPanel()
    {
        f = new JFrame("Student Panel") ;
        f.setVisible(true);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell\\IdeaProjects\\SSSIC\\src\\hello.png");
        f.setIconImage(icon);
        f.setBackground(Color.cyan);
        f.setSize(500,500);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - f.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - f.getHeight()) / 2);
        f.setLocation(x, y);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setForeground(Color.cyan);
        JButton aexit = new JButton("Exit");
        aexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Main();
                f.setVisible(false);
            }
        });
        aexit.setBounds(600,600,200,40);
        JLabel lb = new JLabel("WELCOME TO SSSIC");
        lb.setBackground(Color.yellow);
        lb.setForeground(Color.lightGray);
        lb.setFont(new Font("TimesNewRoman",Font.BOLD,45));
        lb.setBounds(500,20,600,100);
        f.add(lb);
        GridLayout gd = new GridLayout();
        JPanel panel = new JPanel(new GridLayout(4,2));
        panel.setBackground(Color.CYAN);
        JButton addaccountant = new JButton("ADD ACCOUNTANT");
        JButton addstudent = new JButton("ADD STUDENT");
        JButton addstaff = new JButton("ADD STAFF MEMBERS");
        JButton vwaccntant = new JButton("VIEW ACCOUNTANT");
        JButton vwstudnt = new JButton("VIEW STUDENT DETAIL");
        JButton activity = new JButton("ACTIVITY PORTAL");
        JButton staffdetails = new JButton("STAFF DETAILS");
        JButton maintain = new JButton("CHANGES");
        panel.add(addaccountant);
        panel.add(addstudent);
        panel.add(addstaff);
        panel.add(vwaccntant);
        panel.add(vwstudnt);
        panel.add(activity);
        panel.add(staffdetails);
        panel.add(maintain);
        panel.setBounds(200,100,1000,500);
        f.add(panel);
        f.add(aexit);
        addaccountant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddAccountant();
                f.setVisible(false);
            }

        });
        addstudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddStudent();
                f.setVisible(false);
            }

        });
        addstaff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddStaff();
                f.setVisible(false);
            }
        });
        vwaccntant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewAccountant();
                f.setVisible(false);
            }
        });
        vwstudnt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewStudent();
                f.setVisible(false);
            }

        });
        activity.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Activity();
                f.setVisible(false);
            }

        });
        staffdetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StaffDetails();
                f.setVisible(false);
            }
        });
        maintain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Maintain();
                f.setVisible(false);
            }
        });

    }

}
