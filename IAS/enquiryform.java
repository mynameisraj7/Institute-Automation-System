import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import java.awt.*;
public class enquiryform extends JFrame implements ActionListener,FocusListener,KeyListener
{
    JLabel lblcolor =new JLabel();
    JLabel lblcolor2 =new JLabel();
  JLabel lblcolor3 =new JLabel();
    JLabel lblimg = new JLabel();
    JLabel lblname=new JLabel("EnquiryForm");
    JLabel lblname2=new JLabel("Enquiry Details");
    JLabel lbleqid=new JLabel("Enquiry Id");
    JLabel lbleqdate=new JLabel("Enquiry Date");
    JLabel lbleqfor=new JLabel("Enquired For");
    JLabel lblsname=new JLabel("Student Name");
    JLabel lblcontact=new JLabel("Contact No.");
    JLabel lblemail=new JLabel("Email");
    JTextField txteqid=new JTextField();
    JTextField txteqdate=new JTextField();
    JTextField txtsname=new JTextField();
    JTextField txtcontact=new JTextField();
    JTextField txtemail=new JTextField();
    @SuppressWarnings("rawtypes")
    JComboBox cmbeqfor=new JComboBox();
    JButton btnnew=new JButton("New");
    JButton btnsave=new JButton("Save");
    JButton btnsearch=new JButton("Search");
    JButton btnedit=new JButton("Edit");
    JButton btncancel=new JButton("Cancel");
    @SuppressWarnings("unchecked")
    public enquiryform()
    {
        lblimg.setBounds(29,12,70,70);
        ImageIcon dimg=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/coin_4779353.png").getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(),Image.SCALE_DEFAULT));
       lblimg.setIcon(dimg); 
        setLayout(null);
        setSize(900,440);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setBackground(new Color(163,42,205));
        getContentPane().setBackground(new Color(252,246,254));
        lblname.setBounds(120,25,700,40);
        lblname.setFont(new Font("Arial",Font.BOLD,23));
        lblname2.setBounds(100,170,600,40);
       lblname2.setFont(new Font("Arial",Font.BOLD,19));
        lblcolor.setBackground(new Color(168,66,203));
        lblcolor.setBounds(0,0,900,90);
        lblcolor2.setBackground(new Color(168,66,203));  
        lblcolor2.setBounds(0,168,900,45);
        lblcolor3.setBackground(new Color(168,66,203));  
         lblcolor3.setBounds(0,340,900,75);
        lbleqdate.setFont(new Font("Arial",Font.PLAIN,14));
        lbleqid.setFont(new Font("Arial",Font.PLAIN,14));
        lbleqfor.setFont(new Font("Arial",Font.PLAIN,14));
        lblsname.setFont(new Font("Arial",Font.PLAIN,14));
        lblcontact.setFont(new Font("Arial",Font.PLAIN,14));
        lblemail.setFont(new Font("Arial",Font.PLAIN,14));
        txtcontact.setFont(new Font("Arial",Font.PLAIN,14));
        txteqdate.setFont(new Font("Arial",Font.PLAIN,14));
        txteqid.setFont(new Font("Arial",Font.PLAIN,14));
        txtemail.setFont(new Font("Arial",Font.PLAIN,14));
        cmbeqfor.setFont(new Font("Arial",Font.PLAIN,14));
        btncancel.setFont(new Font("Arial",Font.PLAIN,14));
        btnnew.setFont(new Font("Arial",Font.PLAIN,14));
        btnsave.setFont(new Font("Arial",Font.PLAIN,14));
        btnsearch.setFont(new Font("Arial",Font.PLAIN,14));
        btnedit.setFont(new Font("Arial",Font.PLAIN,14));
        lbleqid.setBounds(100,110,150,40);
        lbleqfor.setBounds(100,220,150,40);
       lblsname.setBounds(500,220,150,40);
        lblemail.setBounds(100,270,150,40);
       txteqid.setBounds(250,110,150,40);
        cmbeqfor.setBounds(250,220,150,40);
        add(cmbeqfor);
        txtsname.setBounds(650,220,150,40);
        txtemail.setBounds(250,270,150,40);
        lbleqdate.setBounds(500,110,150,40);
        txteqdate.setBounds(650,110,150,40);
        lblcontact.setBounds(500,270,150,40);
        txtcontact.setBounds(650,270,150,40);
        btnnew.setBounds(75,357,125,40);
        btnsave.setBounds(220,357,125,40);
        btnsearch.setBounds(365,357,125,40);
        btnedit.setBounds(510,357,125,40);
        btncancel.setBounds(655,357,125,40);
        add(lblname);
        add(lblname2);
        add(lblimg);
        add(lbleqid);
        add(lbleqdate);
        add(lblsname);
        add(lblcontact);
        add(lblemail);
        add(txteqid);
        add(txteqdate);
        add(lbleqfor);
        add(txtsname);
        add(txtcontact);
        add(txtemail);
        add(txteqdate);
        add(btnnew);
        add(btnsave);
        add(btnsearch);
        add(btnedit);
        add(btncancel);
        add(lblcolor);
        add(lblcolor2);
      add(lblcolor3);
      lblcolor.setOpaque(true);
      lblcolor2.setOpaque(true);
        lblcolor3.setOpaque(true);
        cmbeqfor.addItem("Select");
        btnnew.addActionListener(this);
        btnsave.addActionListener(this);
        btnedit.addActionListener(this);
        btnsearch.addActionListener(this);
        btncancel.addActionListener(this);
        txteqid.setEditable(false);
        txteqdate.setEditable(false);
        btnsave.setEnabled(false);
        btnedit.setEnabled(false);
    }
    public void focusLost(FocusEvent f)
    {

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
        if(a.getSource()==btnsearch)
        {
            int flg=0;
            try{
                String tsid=JOptionPane.showInputDialog(null,"Enter Enqiury id");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select * from enquirytbl where eqid='"+tsid+"'");
                while(res.next())
                {
                    flg=1;
                    txteqid.setText(res.getString(1));
                    txteqdate.setText(res.getString(2));
                    cmbeqfor.setSelectedItem(res.getString(3));
                    txtsname.setText(res.getString(4));
                    txtcontact.setText(res.getString(5));
                    txtemail.setText(res.getString(6));
                    btnedit.setEnabled(true);
                }
                if(flg==0)
                {
                     JOptionPane.showMessageDialog(null,"No such id exists");
                     txteqid.setText("");
                     txteqdate.setText("");
                     txtsname.setText("");
                     txtcontact.setText("");
                     txtemail.setText("");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        if(a.getSource()==btnsave)
        {
            try{
                if(txtsname.getText().length()!=0 && txtcontact.getText().length()!=0 && txtemail.getText().length()!=0 && ! cmbeqfor.getSelectedItem().toString().equalsIgnoreCase("Select"))
                {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                String str="insert into enquirytbl(eqid,eqdate,eqfor,sname,contact,email) values(?,?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(str);
                ps.setString(1,txteqid.getText());
                ps.setString(2,txteqdate.getText());
                ps.setString(3,""+cmbeqfor.getSelectedItem());
                ps.setString(4,txtsname.getText());
                ps.setString(5,txtcontact.getText());
                ps.setString(6,txtemail.getText());
                ps.executeUpdate();
                Statement st=con.createStatement();
                st.executeUpdate("update enquirykeytbl set eqid=eqid+1");
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
        if(a.getSource()==btnnew)
        {
            Date dt1=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
            String strdt=sdf.format(dt1);
            txteqdate.setText(strdt);
            btnsave.setEnabled(true);
            txtsname.setText("");
            txtcontact.setText("");
            txtemail.setText("");
            cmbeqfor.removeAllItems();
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select eqid from enquirykeytbl");
                while(res.next())
                {
                    txteqid.setText("e/"+res.getString(1));
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select coursename from coursetbl");
                cmbeqfor.addItem("Select");
                while(res.next())
                {
                      cmbeqfor.addItem(res.getString(1));
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
                String str="update enrollmenttbl set eqid='"+txteqid.getText()+"',eqdate='"+txteqdate.getText()+"',eqfor='"+cmbeqfor.getSelectedItem()+"',sname='"+txtsname.getText()+"',contact='"+txtcontact.getText()+"',email='"+txtemail.getText()+"' where eqid='"+txteqid.getText()+"'";
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
    public static void main(String[] args) {
        new enquiryform();
    }
}