import javax.swing.*;
import java.awt.*;
public class coursedescform extends JFrame 
{
    JLabel lblname1 =new JLabel("Java");
    JLabel lblname2 =new JLabel("Web");
    JLabel lblname3 =new JLabel("C");
    JLabel lblimg1 =new JLabel();
    JLabel lblimg2 =new JLabel();
    JLabel lblimg3 =new JLabel();
    public coursedescform(){
        setLayout(null);
        setSize(1030,770);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setBackground(new Color(163,42,205));
        getContentPane().setBackground(new Color(252,246,254));
        lblimg1.setBounds(70,70,70,70);
        ImageIcon dimg1=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/java_919854.png").getImage().getScaledInstance(lblimg1.getWidth(),lblimg1.getHeight(),Image.SCALE_DEFAULT));
        lblimg1.setIcon(dimg1);
        lblimg2.setBounds(190,70,70,70);
        ImageIcon dimg2=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/world-wide-web_1927768.png").getImage().getScaledInstance(lblimg2.getWidth(),lblimg2.getHeight(),Image.SCALE_DEFAULT));
        lblimg2.setIcon(dimg2);
        lblimg3.setBounds(300,70,70,70);
        ImageIcon dimg3=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/letter-c_9755384.png").getImage().getScaledInstance(lblimg3.getWidth(),lblimg3.getHeight(),Image.SCALE_DEFAULT));
        lblimg3.setIcon(dimg3);
        lblname1.setBounds(82,150,700,40);
        lblname1.setFont(new Font("Arial",Font.BOLD,20));
        lblname2.setBounds(203,150,700,40);
        lblname2.setFont(new Font("Arial",Font.BOLD,20));
        lblname3.setBounds(327,150,700,40);
        lblname3.setFont(new Font("Arial",Font.BOLD,20));
        add(lblname1);
        add(lblname2);
        add(lblname3);
        add(lblimg1);
        add(lblimg2);
        add(lblimg3);
        repaint();
    }
    public static void main(String[] args) {
        new coursedescform();
    }
}