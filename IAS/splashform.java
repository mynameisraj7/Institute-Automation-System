import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
public class splashform extends JFrame 
{
    JLabel lbl1 = new JLabel("IAS");
    JLabel lbl2 = new JLabel("Developed By:Aditya");
    JLabel lblimg = new JLabel();
    public splashform()
    {
        lblimg.setBounds(55,25,230,230);
        ImageIcon dimg=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/isometric-university-concept.png").getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(),Image.SCALE_DEFAULT));
        lblimg.setIcon(dimg);
        setLayout(null);
        setSize(550,300);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setBackground(new Color(163,42,205));
        getContentPane().setBackground(new Color(252,246,254));
        lbl1.setBounds(320,90,200,40);
        lbl2.setBounds(320,140,190,40);
        lbl1.setFont(new Font("Arial",Font.BOLD,17));
        lbl2.setFont(new Font("Arial",Font.BOLD,17));
        add(lblimg);
        add(lbl1);
        add(lbl2);
        repaint();
        Date dt=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
        String strdt=sdf.format(dt);
        if(strdt.toString().equalsIgnoreCase("31/Aug/2024"))
        {
            this.dispose();
            JOptionPane.showMessageDialog(null, "Your Session has Expired.Please Contact the Developer");
        }
        try{
        Thread.sleep(3000);
        }
        catch(Exception ee)
        {
            System.out.println(ee);
        }
        this.dispose();
        new loginform();
    }
    public static void main(String arg[])
    {
           new splashform();
    }
}
