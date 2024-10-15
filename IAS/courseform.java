import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;
public class courseform extends JFrame implements ActionListener,KeyListener
{
    JLabel lblcolor =new JLabel();
    JLabel lblcolor2 =new JLabel();
    JFrame frame=new JFrame();
    JLabel lblimg = new JLabel();
    JLabel lblname=new JLabel("Course Form");
    JLabel lblcourseid=new JLabel("Course Id");
    JLabel lblcoursename=new JLabel("Course Name");
    JLabel lblduration=new JLabel("Duration");
    JLabel lblfee=new JLabel("Fee");
    JTextField txtcourseid=new JTextField();
    JTextField txtcoursename=new JTextField();
    JTextField txtduration=new JTextField();
    JTextField txtfee =new JTextField();
    JButton btnnew=new JButton("New");
    JButton btnsave=new JButton("Save");
    JButton btnsearch=new JButton("Search");
    JButton btnedit=new JButton("Edit");
    JButton btncancel=new JButton("Cancel");
    public courseform()
    {
        setLayout(null);
        setSize(800,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setBackground(new Color(163,42,205));
        getContentPane().setBackground(new Color(252,246,254));
        lblimg.setBounds(29,12,70,70);
        ImageIcon dimg=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/coin_4779353.png").getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(),Image.SCALE_DEFAULT));
        lblimg.setIcon(dimg);
        lblname.setBounds(120,25,700,40);
        lblname.setFont(new Font("Arial",Font.BOLD,23));
        txtcourseid.setFont(new Font("Arial",Font.PLAIN,14));
        txtcoursename.setFont(new Font("Arial",Font.PLAIN,14));
        txtduration.setFont(new Font("Arial",Font.PLAIN,14));
        txtfee.setFont(new Font("Arial",Font.PLAIN,14));
        lblcoursename.setFont(new Font("Arial",Font.PLAIN,14));
        lblcourseid.setFont(new Font("Arial",Font.PLAIN,14));
        lblduration.setFont(new Font("Arial",Font.PLAIN,14));
        lblfee.setFont(new Font("Arial",Font.PLAIN,14));
        btncancel.setFont(new Font("Arial",Font.PLAIN,14));
        btnedit.setFont(new Font("Arial",Font.PLAIN,14));
        btnsave.setFont(new Font("Arial",Font.PLAIN,14));
        btnsearch.setFont(new Font("Arial",Font.PLAIN,14));
        btnnew.setFont(new Font("Arial",Font.PLAIN,14));
        lblcolor.setBackground(new Color(168,66,203));
        lblcolor.setBounds(0,0,800,90);
        lblcolor2.setBackground(new Color(168,66,203));  
        lblcolor2.setBounds(0,400,800,80);
        lblcourseid.setBounds(100,140,150,40);
        lblcoursename.setBounds(100,190,150,40);
        lblduration.setBounds(100,240,150,40);
        lblfee.setBounds(100,290,150,40);
        txtcourseid.setBounds(250,140,170,40);
        txtcoursename.setBounds(250,190,170,40);
        txtduration.setBounds(250,240,170,40);
        txtfee.setBounds(250,290,170,40);
        btnnew.setBounds(50,415,110,40);
        btnsave.setBounds(180,415,110,40);
        btnsearch.setBounds(310,415,110,40);
        btnedit.setBounds(440,415,110,40);
        btncancel.setBounds(570,415,110,40);
        add(lblname);
        add(lblimg);
        add(lblcolor);
        add(lblcourseid);
        add(lblcoursename);
        add(lblduration);
        add(lblfee);
        add(txtcourseid);
        add(txtcoursename);
        add(txtduration);
        add(txtfee);
        add(btnnew);
        add(btnsave);
        add(btnsearch);
        add(btnedit);
        add(btncancel);
        add(lblcolor2);
        lblcolor.setOpaque(true);
        lblcolor2.setOpaque(true);
        txtcourseid.setEditable(false);
        btnsearch.addActionListener(this);
        btnnew.addActionListener(this);
        btnedit.addActionListener(this);
        btnsave.addActionListener(this);
        btncancel.addActionListener(this);
        txtcoursename.addKeyListener(this);
        txtfee.addKeyListener(this);
        btnsave.setEnabled(false);
        btnedit.setEnabled(false);
        repaint();
    }
    public void keyPressed(KeyEvent k)
    {

    }
    public void keyReleased(KeyEvent k)
    {
        if(k.getSource()==txtcoursename)
        {
        char ch=txtcoursename.getText().substring(txtcoursename.getText().length()-1).charAt(0);
        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
        {

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Cannot put numbers in faculty name");
        }
       }
       if(k.getSource()==txtfee)
       {
        char chf=txtfee.getText().substring(txtfee.getText().length()-1).charAt(0);
        if(chf>='0'&& chf<='9')
        {

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Cannot put letters in fee");
        }
       }
    }
    public void keyTyped(KeyEvent k)
    {

    }
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource()==btnsearch)
        {
            int flg=0;
            try{
                String tcid=JOptionPane.showInputDialog(null,"Enter courseid");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select * from coursetbl where courseid='"+tcid+"'");
                while(res.next())
                {
                    flg=1;
                    txtcourseid.setText(tcid);
                    txtcoursename.setText(res.getString(2));
                    txtduration.setText(res.getString(3));
                    txtfee.setText(res.getString(4));
                    btnedit.setEnabled(true);
                }
                if(flg==0)
                {
                     JOptionPane.showMessageDialog(null,"No such course id exists");
                     txtcourseid.setText("");
                     txtcoursename.setText("");
                     txtduration.setText("");
                     txtfee.setText("");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        if(a.getSource()==btnnew)
        {
            txtcourseid.setText("");
            txtcoursename.setText("");
            txtduration.setText("");
            txtfee.setText("");
            btnsave.setEnabled(true);
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select cid from keytbl");
                while(res.next())
                {
                    txtcourseid.setText("C/"+res.getString(1));
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        if(a.getSource()==btnsave)
        {
            try{
                if(txtcourseid.getText().length()!=0 && txtcoursename.getText().length()!=0 && txtduration.getText().length()!=0 && txtfee.getText().length()!=0)
                {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                String str="insert into coursetbl(courseid,coursename,duration,fee) values(?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(str);
                ps.setString(1,txtcourseid.getText());
                ps.setString(2,txtcoursename.getText());
                ps.setString(3,txtduration.getText());
                ps.setString(4,txtfee.getText());
                ps.executeUpdate();
                Statement st=con.createStatement();
                st.executeUpdate("update keytbl set cid=cid+1");
                JOptionPane.showMessageDialog(null,"Record Saved!");
                btnsave.setEnabled(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Fill complete details");
                }
              }
              catch(Exception e)
              {
                System.out.println(e);
              }
            }
        if(a.getSource()==btnedit)
        {
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                String str="update coursetbl set courseid='"+txtcourseid.getText()+"',coursename='"+txtcoursename.getText()+"',duration='"+txtduration.getText()+"',fee='"+txtfee.getText()+"' where courseid='"+txtcourseid.getText()+"'";
                st.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "Updated");
                }    
                catch(Exception e)
                {
                    System.out.println(e);
                }
        }
        if(a.getSource()==btncancel)
        {
            this.dispose();
        }
    }
    public static void main(String arg[])
    {
           new courseform();
    }
}