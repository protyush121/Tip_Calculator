import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TipsLogic  extends JFrame implements ActionListener {
        JLabel h1, l1, l2, l3, l4, l5; //labels for the values (l4 is for result ie tip), and(l5 is the input bill ammount)
        JTextField t1, t2, t3, t4,t5; //textfield for respective labels
        JButton b1;

        public  TipsLogic(){

            super("Tip Calculator");

            h1= new JLabel("Tip Calculator");
            h1.setFont(new Font("Times New Roman", Font.BOLD, 30));
            h1.setBounds(60, 10, 300, 30);
            l1= new JLabel("Rate ambience out of 10: ");
            l2= new JLabel("Rate staff behavior out of 10: ");
            l3= new JLabel("Rate food taste out of 10: ");
            l4= new JLabel("Tip to pay (in Rs): ");
            l5= new JLabel("Enter the bill amount: ");

            t1= new JTextField(10);
            t1.setBounds(50, 25, 100, 50);
            t2= new JTextField(10);
            t3= new JTextField(10);
            t4= new JTextField(10);
            t5= new JTextField(10);

            b1= new JButton("Calculate");

            setLayout(new FlowLayout(FlowLayout.LEFT, 100, 7));
            add(h1);
            add(l1);
            add(t1);
            add(l2);
            add(t2);
            add(l3);
            add(t3);
            add(l5);
            add(t5);
            add(l4);
            add(t4);

            add(b1);
            b1.addActionListener(this);
            setSize(370, 387);

            setVisible(true);
            setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        int x= Integer.parseInt(t1.getText());
        int y= Integer.parseInt(t2.getText());
        int z= Integer.parseInt(t3.getText());
        int bill= Integer.parseInt(t5.getText());

        double percent= (x>=5 && y>=5 && z>=5)? 10: 5;
        double tip= (percent/100)*bill;
        t4.setText(String.valueOf(tip));
    }

    public static void main(String[] args) {
        new TipsLogic();
    }
}
