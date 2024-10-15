import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import java.awt.*;
public class batchchangeform extends JFrame implements ActionListener,FocusListener,KeyListener
{
    JLabel lblcolor =new JLabel();
    JLabel lblcolor2 =new JLabel();
    JLabel lblcolor3 =new JLabel();
    JLabel lblimg = new JLabel();
    JLabel lblname=new JLabel("Batch Change Form");
    JLabel lblname2=new JLabel("Batch Details");
    JLabel lblsid= new JLabel("Sid"); 
    JLabel lblsname= new JLabel("Sname"); 
    JLabel lblcid= new JLabel("Cid"); 
    JLabel lblcname= new JLabel("Cname"); 
    JLabel lblcbid= new JLabel("Current Batch Id"); 
    JLabel lblcbname= new JLabel("Current Batch Name"); 
    JLabel lblnbid= new JLabel("New Batch Id"); 
    JLabel lblcwdays= new JLabel("Current WeekDays"); 
    JLabel lblnwdays= new JLabel("New WeekDays"); 
    JLabel lbldate= new JLabel("Joining Date");
    JTextField txtsid= new JTextField(); 
    JTextField txtsname= new JTextField(); 
    @SuppressWarnings("rawtypes")
    JComboBox cmbcid= new JComboBox(); 
    JTextField txtcname= new JTextField(); 
    JTextField txtcbid= new JTextField(); 
    JTextField txtcbname= new JTextField(); 
    @SuppressWarnings("rawtypes")
    JComboBox cmbnbid= new JComboBox(); 
    JTextField txtcwdays= new JTextField(); 
    JTextField txtnwdays= new JTextField(); 
    JTextField txtdate= new JTextField(); 
    JButton btnnew=new JButton("New");
    JButton btnsave=new JButton("Save");
    JButton btncancel=new JButton("Cancel");
    @SuppressWarnings("unchecked")
    public batchchangeform()
    {
        setLayout(null);
        setSize(900,530);
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
        lblname2.setBounds(100,216,600,40);
        lblname2.setFont(new Font("Arial",Font.BOLD,19));
        lblcolor.setBackground(new Color(168,66,203));
        lblcolor.setBounds(0,0,900,90);
        lblcolor2.setBackground(new Color(168,66,203));  
        lblcolor2.setBounds(0,215,900,45);
        lblcolor3.setBackground(new Color(168,66,203));  
         lblcolor3.setBounds(0,430,900,75);
        lblsid.setFont(new Font("Arial",Font.PLAIN,14));
        lblsname.setFont(new Font("Arial",Font.PLAIN,14));
        lblcid.setFont(new Font("Arial",Font.PLAIN,14));
        lblcname.setFont(new Font("Arial",Font.PLAIN,14));
        lblcbid.setFont(new Font("Arial",Font.PLAIN,14));
        lblcbname.setFont(new Font("Arial",Font.PLAIN,14));
        lblnbid.setFont(new Font("Arial",Font.PLAIN,14));
        lblcwdays.setFont(new Font("Arial",Font.PLAIN,14));
        lblnwdays.setFont(new Font("Arial",Font.PLAIN,14));
        lbldate.setFont(new Font("Arial",Font.PLAIN,14));
        txtsid.setFont(new Font("Arial",Font.PLAIN,14));
        txtsname.setFont(new Font("Arial",Font.PLAIN,14));
        cmbcid.setFont(new Font("Arial",Font.PLAIN,14));
        cmbnbid.setFont(new Font("Arial",Font.PLAIN,14));
        txtcname.setFont(new Font("Arial",Font.PLAIN,14));
        txtcbid.setFont(new Font("Arial",Font.PLAIN,14));
        txtcbname.setFont(new Font("Arial",Font.PLAIN,14));
        txtcwdays.setFont(new Font("Arial",Font.PLAIN,14));
        txtnwdays.setFont(new Font("Arial",Font.PLAIN,14));
        btncancel.setFont(new Font("Arial",Font.PLAIN,14));
        btnnew.setFont(new Font("Arial",Font.PLAIN,14));
        btncancel.setFont(new Font("Arial",Font.PLAIN,14));
        lblsid.setBounds(100,100,150,40);
        lblcid.setBounds(100,150,150,40);
        lblcbid.setBounds(100,270,150,40);
        lblnbid.setBounds(100,320,150,40);
        lbldate.setBounds(100,370,150,40);
        txtsid.setBounds(300,110,150,40);
       cmbcid.setBounds(300,160,150,40);
        add(cmbcid);
       txtcbid.setBounds(300,270,150,40);
        cmbnbid.setBounds(300,320,150,40);
        add(cmbnbid);
        txtdate.setBounds(300,370,150,40);
        lblsname.setBounds(500,110,150,40);
        lblcname.setBounds(500,160,150,40);
        lblcbname.setBounds(500,270,150,40);
        lblnwdays.setBounds(500,320,150,40);
       lblcwdays.setBounds(500,370,150,40);
        txtsname.setBounds(650,110,150,40);
        txtcname.setBounds(650,160,150,40);
       txtcbname.setBounds(650,270,150,40);
        txtnwdays.setBounds(650,320,150,40);
       txtcwdays.setBounds(650,370,150,40);
        btnnew.setBounds(75,448,125,40);
        btnsave.setBounds(220,448,125,40);
        btncancel.setBounds(365,448,125,40);
        cmbnbid.addItem("Select");
        cmbcid.addItem("Select");
        add(lblname);
        add(lblname2);
        add(lblimg);
        add(lblsname);
        add(lblsid);
        add(lblcid);
        add(lblcname);
        add(lblcbid);
        add(lblcbname);
        add(lblnbid);
        add(lbldate);
        add(lblcwdays);
        add(lblnwdays);
        add(txtsname);
        add(txtcbid);
        add(txtsid);
        add(txtcname);
        add(txtcbname);
        add(txtdate);
        add(txtcwdays);
        add(txtnwdays);
        add(btnnew);
        add(btnsave);
        add(btncancel);
        add(lblcolor);
        add(lblcolor2);
       add(lblcolor3);
        lblcolor.setOpaque(true);
      lblcolor2.setOpaque(true);
         lblcolor3.setOpaque(true);
        txtsname.setEditable(false);
        txtcname.setEditable(false);
        txtcbname.setEditable(false);
        txtcwdays.setEditable(false);
        txtnwdays.setEditable(false);
        txtdate.setEditable(false);
        txtsid.addFocusListener(this);
        txtcbid.setEditable(false);
        cmbcid.addActionListener(this);
        cmbnbid.addActionListener(this);
        btnnew.addActionListener(this);
        btnsave.addActionListener(this);
        btncancel.addActionListener(this);
        btnsave.setEnabled(false);
        repaint();
    }
    @SuppressWarnings("unchecked")
    public void focusLost(FocusEvent f)
    {
         if(f.getSource()==txtsid)
        {
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select cid from enrollmenttbl where sid=+'"+txtsid.getText()+"'");
                cmbcid.removeAllItems();
                cmbcid.addItem("Select");
                while(res.next())
                {
                      cmbcid.addItem(res.getString(1));
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            txtsname.setText("");
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
            Statement st=con.createStatement();
            ResultSet res=st.executeQuery("select sname from studenttbl where sid='"+txtsid.getText()+"'");
            while(res.next())
            {
                  txtsname.setText(res.getString(1));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }
    }
    public void focusGained(FocusEvent f)
    {

    }
    public void keyPressed(KeyEvent k)
    {

    }
    public void keyReleased(KeyEvent k)
    {
       
    }
    public void keyTyped(KeyEvent k)
    {

    }
    @SuppressWarnings("unchecked")
    public void actionPerformed(ActionEvent a)
    {
         if(a.getSource()==cmbcid)
        {
            txtcname.setText("");
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select coursename from coursetbl where courseid='"+cmbcid.getSelectedItem()+"'");
                while(res.next())
                {
                     txtcname.setText(res.getString(1));
                }
               }
            catch(Exception e)
            {
                System.out.println(e);
            }
            txtcbid.setText("");
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select batchid from enrollmenttbl where sid='"+txtsid.getText()+"' and cname='"+txtcname.getText()+"'");
                while(res.next())
                {
                     txtcbid.setText(res.getString(1));
                }
               }
            catch(Exception e)
            {
                System.out.println(e);
            }
            txtcbname.setText("");
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select bname from batchcreation where bid='"+txtcbid.getText()+"'");
                while(res.next())
                {
                     txtcbname.setText(res.getString(1));
                }
               }
            catch(Exception e)
            {
                System.out.println(e);
            }
            txtcwdays.setText("");
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select days from batchcreation where bid='"+txtcbid.getText()+"'");
                while(res.next())
                {
                     txtcwdays.setText(res.getString(1));
                }
               }
            catch(Exception e)
            {
                System.out.println(e);
            }
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select bid from batchcreation where cname='"+txtcname.getText()+"'");
                cmbnbid.removeAllItems();
                cmbnbid.addItem("Select");
                while(res.next())
                {
                      cmbnbid.addItem(res.getString(1));
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        if(a.getSource()==cmbnbid)
        {
            txtnwdays.setText("");
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select days from batchcreation where bid='"+cmbnbid.getSelectedItem()+"'");
                while(res.next())
                {
                     txtnwdays.setText(res.getString(1));
                }
               }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        if(a.getSource()==btnnew)
        {
            Date dt1=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
            String strdt=sdf.format(dt1);
            txtdate.setText(strdt);
            btnsave.setEnabled(true);
            txtsid.setText("");
            txtsname.setText("");
            txtcname.setText("");
            txtcbname.setText("");
            txtcwdays.setText("");
            txtnwdays.setText("");
            cmbcid.removeAllItems();
            cmbnbid.removeAllItems();
            cmbnbid.addItem("Select");
            cmbcid.addItem("Select");
        }
        if(a.getSource()==btnsave)
        {
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                String str="update enrollmenttbl set batchid='"+cmbnbid.getSelectedItem()+"' where sid='"+txtsid.getText()+"' and cid='"+cmbcid.getSelectedItem()+"'";
                Statement st=con.createStatement();
                st.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"Record Saved!");
                btnsave.setEnabled(false);
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
   public static void main(String[] args) {
        new batchchangeform();
    }
}