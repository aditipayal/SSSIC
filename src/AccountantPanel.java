import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountantPanel {
    JFrame f;
    Container c;
    public AccountantPanel()
    {
        f = new JFrame("Accountant Panel") ;
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
        JLabel lb = new JLabel("WELCOME ACCOUNTANT ");
        lb.setBackground(Color.yellow);
        lb.setForeground(Color.lightGray);
        lb.setFont(new Font("TimesNewRoman",Font.BOLD,45));
        lb.setBounds(500,20,600,100);
        f.add(lb);
        GridLayout gd = new GridLayout();
        JPanel panel = new JPanel(new GridLayout(4,2));
        panel.setBackground(Color.CYAN);
        JButton studentDetails = new JButton("STUDENT DETAILS");
        JButton studentsFeeReport = new JButton("STUDENTS FEE REPORT");
        JButton changesinfee = new JButton("CHNAGES IN FEE REPORT");
        JButton monthlyFeesReport = new JButton("MONTHLY FEES REPORT");
        JButton staffDetails = new JButton("STAFF DETAILS");
        JButton staffSalaryDetails= new JButton("STAFF SALARY DETAILS");
        JButton staffMonthlyReport = new JButton("STAFF MONTHLY REPORT");
        JButton maintain = new JButton("CHANGES");
        panel.add(studentDetails);
        panel.add(studentsFeeReport);
        panel.add(changesinfee);
        panel.add(monthlyFeesReport);
        panel.add(staffDetails);
        panel.add(staffSalaryDetails);
        panel.add(staffMonthlyReport);
        panel.add(maintain);
        panel.setBounds(200,100,1000,500);
        f.add(panel);
        f.add(aexit);
        studentDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewStudent();
                f.setVisible(false);
            }

        });
        studentsFeeReport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StudenFeeReport();
                f.setVisible(false);
            }

        });
        changesinfee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FeeChange();
                f.setVisible(false);
            }
        });
       monthlyFeesReport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MonthlyFee();
                f.setVisible(false);
            }
        });
        staffDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StaffDetails();
                f.setVisible(false);
            }

        });
       staffSalaryDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StaffSalary();
                f.setVisible(false);
            }

        });
        staffMonthlyReport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StaffMonthlySalary();
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
