import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.*;
public class paymentform extends JFrame implements ActionListener,KeyListener,FocusListener
{
    JLabel lblcolor =new JLabel();
    JLabel lblcolor2 =new JLabel();
    JLabel lblcolor3 =new JLabel();
    JLabel lblimg = new JLabel();
    JLabel lblname=new JLabel("Payment Form");
    JLabel lblname2=new JLabel("Payment Details");
    JLabel lblsid= new JLabel("Sid"); 
    JLabel lblsname= new JLabel("Sname"); 
    JLabel lblcid= new JLabel("Cid"); 
    JLabel lblcname= new JLabel("Cname"); 
    JLabel lbldate= new JLabel("Payment Date"); 
    JLabel lblamt= new JLabel("Amount"); 
    JLabel lblpamt= new JLabel("Paying Amount"); 
    JLabel lblamtpaid= new JLabel("Amount Paid"); 
    JTextField txtsid= new JTextField(); 
    JTextField txtsname= new JTextField(); 
    @SuppressWarnings("rawtypes")
    JComboBox cmbcid= new JComboBox(); 
    JTextField txtcname= new JTextField();
    JTextField txtdate= new JTextField();
    JTextField txtamt= new JTextField();
    JTextField txtpamt= new JTextField();
    JTextField txtamtpaid= new JTextField();
    JButton btnnew=new JButton("New");
    JButton btnsave=new JButton("Save");
    JButton btncancel=new JButton("Cancel");
    @SuppressWarnings("unchecked")
    public paymentform()
    {
        setLayout(null);
        setSize(900,490);
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
        lblcolor3.setBounds(0,390,900,75);
        lblsid.setFont(new Font("Arial",Font.PLAIN,14));
        lblsname.setFont(new Font("Arial",Font.PLAIN,14));
        lblcid.setFont(new Font("Arial",Font.PLAIN,14));
        lblcname.setFont(new Font("Arial",Font.PLAIN,14));
        lbldate.setFont(new Font("Arial",Font.PLAIN,14));
        lblamt.setFont(new Font("Arial",Font.PLAIN,14));
        lblpamt.setFont(new Font("Arial",Font.PLAIN,14));
        lblamtpaid.setFont(new Font("Arial",Font.PLAIN,14));
        txtsid.setFont(new Font("Arial",Font.PLAIN,14));
        txtsname.setFont(new Font("Arial",Font.PLAIN,14));
        cmbcid.setFont(new Font("Arial",Font.PLAIN,14));
        txtcname.setFont(new Font("Arial",Font.PLAIN,14));
        txtdate.setFont(new Font("Arial",Font.PLAIN,14));
        txtamt.setFont(new Font("Arial",Font.PLAIN,14));
        txtpamt.setFont(new Font("Arial",Font.PLAIN,14));
        txtamtpaid.setFont(new Font("Arial",Font.PLAIN,14));
        btncancel.setFont(new Font("Arial",Font.PLAIN,14));
        btnnew.setFont(new Font("Arial",Font.PLAIN,14));
        btnsave.setFont(new Font("Arial",Font.PLAIN,14));
        lblsid.setBounds(100,110,150,40);
        lblcid.setBounds(100,160,150,40);
         lbldate.setBounds(100,270,150,40);
       lblpamt.setBounds(100,320,150,40);
        lblsname.setBounds(500,110,150,40);
        lblcname.setBounds(500,160,150,40);
      lblamt.setBounds(500,270,150,40);
       lblamtpaid.setBounds(500,320,150,40);
        txtsid.setBounds(250,110,150,40);
        cmbcid.setBounds(250,160,150,40);
        add(cmbcid);
        txtdate.setBounds(250,270,150,40);
       txtpamt.setBounds(250,320,150,40);
        txtsname.setBounds(650,110,150,40);
        txtcname.setBounds(650,160,150,40);
       txtamt.setBounds(650,270,150,40);
        txtamtpaid.setBounds(650,320,150,40);
        btnnew.setBounds(75,405,120,40);
        btnsave.setBounds(215,405,125,40);
        btncancel.setBounds(360,405,125,40);
        cmbcid.addItem("Select");
        add(lblname);
        add(lblname2);
        add(lblimg);
        add(lblsid);
        add(lblcid);
        add(lbldate);
        add(lblsname);
        add(lblcname);
        add(lblpamt);
        add(lblamtpaid);
        add(lblamt);
        add(txtsid);
        add(txtsname);
        add(txtdate);
        add(txtamt);
        add(txtcname);
        add(txtpamt);
        add(txtamtpaid);
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
        txtdate.setEditable(false);
        txtamtpaid.setEditable(false);
        txtamt.setEditable(false);
        txtsid.addFocusListener(this);
        cmbcid.addActionListener(this);
        btnnew.addActionListener(this);
        btnsave.addActionListener(this);
        btncancel.addActionListener(this);
        txtsid.addActionListener(this);
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
        }
        if(f.getSource()==txtsid)
        {
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
        }
        if(a.getSource()==cmbcid)
        {
            txtamt.setText("");
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select damt from enrollmenttbl where cid='"+cmbcid.getSelectedItem()+"' and sid='"+txtsid.getText()+"'");
                while(res.next())
                {
                     txtamt.setText(res.getString(1));
                }
               }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        if(a.getSource()==cmbcid)
        {
            txtamtpaid.setText("");
            try{
                double s=0.0;
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select payingamt from paymenttbl where cid='"+cmbcid.getSelectedItem()+"' and sid='"+txtsid.getText()+"'");
                while(res.next())
                {
                    s=s+Double.parseDouble(res.getString(1));
                }
                     txtamtpaid.setText(""+s);
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
             txtsname.setText("");
             txtamt.setText("");
             txtsid.setText("");
             txtcname.setText("");
             txtamtpaid.setText("");
             cmbcid.setSelectedItem("Select");
             btnsave.setEnabled(true);
        }
        if(a.getSource()==btnsave)
        {
            try{
                if(txtsid.getText().length()!=0 && txtsname.getText().length()!=0 && txtcname.getText().length()!=0 && txtamt.getText().length()!=0 && txtpamt.getText().length()!=0 && txtdate.getText().length()!=0 && txtamtpaid.getText().length()!=0 && ! cmbcid.getSelectedItem().toString().equalsIgnoreCase("Select"))
                {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                String str="insert into paymenttbl(sid,sname,cid,cname,pdate,amt,payingamt,amtpaid) values(?,?,?,?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(str);
                ps.setString(1,txtsid.getText());
                ps.setString(2,txtsname.getText());
                ps.setString(3,""+cmbcid.getSelectedItem());
                ps.setString(4,txtcname.getText());
                ps.setString(5,txtdate.getText());
                ps.setString(6,txtamt.getText());
                ps.setString(7,txtpamt.getText());
                ps.setString(8,txtamtpaid.getText());
                ps.executeUpdate();
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
        if(a.getSource()==btncancel)
        {
            this.dispose();
        }
    }
    public static void main(String[] args) {
        new paymentform();
    }
}