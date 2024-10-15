import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
public class loginform extends JFrame implements ActionListener
{
    int x=0,z=0;
    JLabel lblcolor =new JLabel();
    JLabel lblname=new JLabel("Login Form");
    JLabel lblimg = new JLabel();
    JLabel lblimg1 = new JLabel();
    JLabel userlbl = new JLabel("User");
    JLabel passwordlbl = new JLabel("Password");
    JTextField txtusr=new JTextField();
    JPasswordField txtpassword=new JPasswordField();
    JButton btnok = new JButton("Ok");
    JButton btncancel = new JButton("Cancel");
    public loginform()
    {
        lblimg.setBounds(29,12,70,70);
        ImageIcon dimg=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/coin_4779353.png").getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(),Image.SCALE_DEFAULT));
        lblimg.setIcon(dimg);
        getContentPane().setBackground(new Color(252,246,254));
        lblname.setBounds(120,25,700,40);
        lblname.setFont(new Font("Arial",Font.BOLD,23));
        lblcolor.setBounds(0,0,1100,90);
        lblcolor.setBackground(new Color(168,66,203));
        setLayout(null);
        setSize(500,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setBackground(new Color(163,42,205));
        userlbl.setBounds(115,135,100,40);
        userlbl.setFont(new Font("Arial",Font.BOLD,17));
        passwordlbl.setBounds(115,195,100,40);
        passwordlbl.setFont(new Font("Arial",Font.BOLD,17));
        btnok.setBounds(120,260,100,40);
        btnok.setFont(new Font("Arial",Font.BOLD,15));
        btncancel.setBounds(260,260,100,40);
        btncancel.setFont(new Font("Arial",Font.BOLD,15));
        txtusr.setBounds(220,135,150,40);
        txtpassword.setBounds(220,195,150,40);
        add(btnok);
        add(btncancel);
        add(userlbl);
        add(passwordlbl);
        add(txtusr);
        add(txtpassword);
        add(lblimg);
        add(lblimg1);
        add(lblname);
        lblcolor.setOpaque(true);
        add(lblcolor);
        btnok.addActionListener(this);
        btncancel.addActionListener(this);
        repaint();
    }
   public void run()
   {
    Label lbl=new Label();
    lbl.setBounds(100,320,50+z,50);
    lbl.setBackground(new Color(200,0,0));
    add(lbl);
   }
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource()==btnok)
        {
            int flg=0;
            try{
                Label pload[] = new Label[20];
                for(int i=0;i<20;i++)
                pload[i]=new Label();
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                @SuppressWarnings("deprecation")
                ResultSet res=st.executeQuery("select * from logintbl where usr='"+txtusr.getText()+"' and pwd='"+txtpassword.getText()+"'");
                while(res.next())
                {   
                    flg=1;
                    JOptionPane.showMessageDialog(null,"Login Succesful.\nWelcome Aditya");
                } 
                 if(flg==1)
                 {   
                    lblimg1.setBounds(70,230,300,200);
                    ImageIcon dimg1=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/image_processing20210212-11872-hwwile.gif").getImage().getScaledInstance(lblimg1.getWidth(),lblimg1.getHeight(),Image.SCALE_DEFAULT));
                    lblimg1.setIcon(dimg1);
                    con.close();
                   // JOptionPane.showMessageDialog(null,"");
                  // for(int i=1;i<20;i++)
                    {
                        x=x+20;
                        
                        try{
                            Thread.sleep(500);
                            }
                            catch(Exception ee)
                            {
                                System.out.println(ee);
                            }
                         //  JOptionPane.showMessageDialog(null,"","");
                            
                          //  pload[i].setBounds(100,320,50,50);
                           // pload[i].setBackground(new Color(200,0,0));
                            //add(pload[i]);
                            //this.validate();
                            //this.setVisible(true);
                            //repaint();
                    
                            }
                   new menuform();
                }
                if(flg==0)
                  JOptionPane.showMessageDialog(null,"not successful");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            this.dispose();
        }
        if(a.getSource()==btncancel)
        {
            this.dispose();
        }
    }
}

