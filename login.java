
import javax.swing.*;
public class login extends JFrame {
   public login (String s){
      super(s); 
   }
   public void setcomponents() {
       JLabel a,s,d;
       JTextField g,h;
       JButton b;
       
       a=new JLabel("login form");
       s=new JLabel("login id");
       d=new JLabel("password");
       g=new JTextField();
       h=new JTextField();
       b=new JButton("login");
       setLayout(null);
       a.setBounds(50, 50, 200, 70);
       s.setBounds(100, 100, 100, 40);
       d.setBounds(100, 200, 100, 40);
       b.setBounds(200, 300, 100, 40);
       g.setBounds(200, 100, 100, 40);
       h.setBounds(200, 200, 100, 40);
     
      add(a);
      add(s);
      add(g);
      add(d);
      add(h);
      add(b);
       
   }
public static void main(String[] args) {
    login j=new login("Login");
    j.setcomponents();
    j.setSize(400,500);
    j.setVisible(true);
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}
*/