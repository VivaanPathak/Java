/*import javax.swing.*;
public class swing {
    public static void main(String[] args) {
        JFrame j=new JFrame("Swing");
        j.setSize(300,300);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}*/


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class swing extends JFrame implements ActionListener  {
    JLabel l1,l2,l3,l4; 
    JTextField t1,t2;
    JButton b1;
  public  swing(String s){
super(s);
  }
  public void setcomponents() {
    l1=new JLabel("Addition of two number");
    l2=new JLabel("first number");
    l3=new JLabel("second number");
    l4=new JLabel("Sum of two number");
    t1= new JTextField();
    t2= new JTextField(); 
    b1=new JButton("Add");
    b1.addActionListener(this);
    setLayout(null);
    l1.setBounds(50,50,200,20);
    l2.setBounds(50,100,100,20);
    t1.setBounds(150,80,100,20);
    t2.setBounds(150,130,100,20);
    b1.setBounds(80,180,100,20);
    l3.setBounds(50,130,100,20);
    l4.setBounds(50,240,200,20);
    
    add(l1);
    add(l2);
    add(t1);
    add(l3);
    add(t2);
    add(b1);
    add(l4);
}
@Override
public void actionPerformed(ActionEvent e) {
    int a,b,c;
    a=Integer.parseInt(t1.getText());
    b=Integer.parseInt(t2.getText());
    c=a+b;
    l3.setText("sum is "+ c);
} 



   

    public static void main(String[] args) {
      swing j=new  swing("Swing");
       j.setcomponents();
        j.setSize(300,300);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
