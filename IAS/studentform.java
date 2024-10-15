import javax.swing.*;
//import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;
public class studentform extends JFrame implements ActionListener,KeyListener,FocusListener
{
    JLabel lblcolor =new JLabel();
    JLabel lblcolor2 =new JLabel();
    JLabel lblcolor3 =new JLabel();
    JLabel lblimg = new JLabel();
    JLabel lblname=new JLabel("Student Admission Form");
    JLabel lblname2=new JLabel("Personal Details");
    JLabel lblsid=new JLabel("Student Id");
    JLabel lblsname=new JLabel("Student Name");
    JLabel lblcontact=new JLabel("Contact");
    JLabel lbladdress=new JLabel("Address");
    JLabel lblage=new JLabel("Age");
    JLabel lblgen=new JLabel("Gender");
    JLabel lblqual=new JLabel("Qualification");
    JLabel lbladh=new JLabel("Adhaar No.");
    JLabel lblother=new JLabel("Other");
    JLabel lblemail=new JLabel("Email");
    JLabel lbldoa=new JLabel("Date Of Birth");
    JTextField txtsid=new JTextField();
    JTextField txtsname=new JTextField();
    JTextField txtcontact=new JTextField();
    JTextField txtaddress=new JTextField();
    JTextField txtage=new JTextField();
    @SuppressWarnings("rawtypes")
    JComboBox cmbqual=new JComboBox();
    JTextField txtadh=new JTextField();
    JTextField txtother=new  JTextField();
    JTextField txtemail=new JTextField();
    JTextField txtdoa=new JTextField();
    JRadioButton rblmale=new JRadioButton("Male");
    JRadioButton rblfem=new JRadioButton("Female");
    ButtonGroup bg=new ButtonGroup();
    JButton btnnew=new JButton("New");
    JButton btnsave=new JButton("Save");
    JButton btnsearch=new JButton("Search");
    JButton btnedit=new JButton("Edit");
    JButton btncancel=new JButton("Cancel");
    @SuppressWarnings("unchecked")
    public studentform()
    {
        setLayout(null);
        setSize(1100,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setBackground(new Color(163,42,205));
        lblimg.setBounds(29,12,70,70);
        ImageIcon dimg=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/coin_4779353.png").getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(),Image.SCALE_DEFAULT));
        lblimg.setIcon(dimg);
        getContentPane().setBackground(new Color(252,246,254));
        lblname.setBounds(120,25,700,40);
        lblname2.setBounds(100,170,600,40);
        txtsid.setFont(new Font("Arial",Font.PLAIN,14));
        txtsname.setFont(new Font("Arial",Font.PLAIN,14));
        txtcontact.setFont(new Font("Arial",Font.PLAIN,14));
        txtaddress.setFont(new Font("Arial",Font.PLAIN,14));
        txtage.setFont(new Font("Arial",Font.PLAIN,14));
        txtadh.setFont(new Font("Arial",Font.PLAIN,14));
        lblname.setFont(new Font("Arial",Font.BOLD,23));
        lblname2.setFont(new Font("Arial",Font.BOLD,19));
        txtemail.setFont(new Font("Arial",Font.PLAIN,14));
        txtdoa.setFont(new Font("Arial",Font.PLAIN,14));
        lblsname.setFont(new Font("Arial",Font.PLAIN,14));
        lblsid.setFont(new Font("Arial",Font.PLAIN,14));
        lblcontact.setFont(new Font("Arial",Font.PLAIN,14));
        cmbqual.setFont(new Font("Arial",Font.PLAIN,14));
        lbladdress.setFont(new Font("Arial",Font.PLAIN,14));
        lblage.setFont(new Font("Arial",Font.PLAIN,14));
        lblgen.setFont(new Font("Arial",Font.PLAIN,14));
        lblqual.setFont(new Font("Arial",Font.PLAIN,14));
        lbladh.setFont(new Font("Arial",Font.PLAIN,14));
        lblother.setFont(new Font("Arial",Font.PLAIN,14));
        lblemail.setFont(new Font("Arial",Font.PLAIN,14));
        lbldoa.setFont(new Font("Arial",Font.PLAIN,14));
        rblfem.setFont(new Font("Arial",Font.PLAIN,14));
        rblmale.setFont(new Font("Arial",Font.PLAIN,14));
        btncancel.setFont(new Font("Arial",Font.PLAIN,14));
        btnnew.setFont(new Font("Arial",Font.PLAIN,14));
        btnsave.setFont(new Font("Arial",Font.PLAIN,14));
        btnsearch.setFont(new Font("Arial",Font.PLAIN,14));
        btnedit.setFont(new Font("Arial",Font.PLAIN,14));
       // txtsid.setBorder(new LineBorder(Color.BLACK,1));
        lblcolor.setBounds(0,0,1100,90);
        lblcolor2.setBounds(0,510,1100,90);
        lblcolor.setBackground(new Color(168,66,203));
        lblcolor2.setBackground(new Color(168,66,203));
        lblcolor3.setBackground(new Color(168,66,203));
        lblcolor3.setBounds(0,170,1100,40);
        lblsid.setBounds(100,110,150,40);
        lblsname.setBounds(100,230,150,40);
        lblcontact.setBounds(100,280,150,40);
        lbladdress.setBounds(100,330,150,40);
        lblage.setBounds(100,380,150,40);
        lblgen.setBounds(600,430,150,40);
        lblqual.setBounds(100,430,150,40);
        lbladh.setBounds(600,280,150,40);
        lblother.setBounds(600,380,150,40);
        lbldoa.setBounds(600,230,150,40);
        lblemail.setBounds(600,330,150,40);
        txtsid.setBounds(250,110,150,40);
        txtsname.setBounds(250,230,150,40);
        txtcontact.setBounds(250,280,150,40);
        txtaddress.setBounds(250,330,150,40);
        txtage.setBounds(250,380,150,40);
        cmbqual.setBounds(250,430,150,40);
        add(cmbqual);
        cmbqual.addItem("Select");
        cmbqual.addItem("Graduation");
        cmbqual.addItem("Masters");
        cmbqual.addItem("BCA");
        txtadh.setBounds(750,280,150,40);
        txtother.setBounds(750,380,150,40);
        txtdoa.setBounds(750,230,150,40);
       txtemail.setBounds(750,330,150,40);
       rblmale.setBounds(750,430,150,40);
        bg.add(rblmale);
        rblfem.setBounds(900,430,150,40);
        bg.add(rblfem);
        btnnew.setBounds(60,520,160,40);
        btnsave.setBounds(240,520,160,40);
        btnsearch.setBounds(420,520,160,40);
        btnedit.setBounds(600,520,160,40);
        btncancel.setBounds(780,520,160,40);
        add(lblimg);
        add(lblsid);
        add(lblsname);
        add(lblname);
        add(lblname2);
        add(lblcolor);
        add(lblcolor3);
        add(rblmale);
        add(rblfem);
        add(lblcontact);
        add(lbladdress);
        add(lblage);
        add(lblqual);
        add(lbladh);
        add(lblgen);
        add(lblother);
        add(lblemail);
        add(lbldoa);
        add(txtsid);
        add(txtsname);
        add(txtcontact);
        add(txtaddress);
        add(txtage);
        add(txtadh);
        add(txtother);
        add(txtemail);
        add(txtdoa);
        add(btnnew);
        add(btnsave);
        add(btnsearch);
        add(btnedit);
        add(btncancel);
        lblcolor.setOpaque(true);
        lblcolor2.setOpaque(true);
        lblcolor3.setOpaque(true);
        txtsid.setEditable(false);
       add(lblcolor2); 
       btnnew.addActionListener(this);
        btnsave.addActionListener(this);
        btnsearch.addActionListener(this);
        btnedit.addActionListener(this);
        txtsname.addKeyListener(this);
        btncancel.addActionListener(this);
        txtcontact.addKeyListener(this);
        txtage.addKeyListener(this);
        txtadh.addKeyListener(this);
        txtdoa.addKeyListener(this);
        txtadh.addFocusListener(this);
        btnsave.setEnabled(false);
        btnedit.setEnabled(false);
        repaint();
    }
    public void focusGained(FocusEvent f)
    {

    }
    public void focusLost(FocusEvent f)
    {

    }
    public void keyPressed(KeyEvent k)
    {

    }
    public void keyReleased(KeyEvent k)
    {
        if(k.getSource()==txtsname)
        {
            char ch=txtsname.getText().substring(txtsname.getText().length()-1).charAt(0);
            if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
            {

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Cannot put numbers in Student's name");
            }
        }
        if(k.getSource()==txtage)
        {
            char cha=txtage.getText().substring(txtage.getText().length()-1).charAt(0);
            if(cha>='0' && cha<='9')
            {

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Cannot put letters in age");
            }
        }
        if(k.getSource()==txtcontact)
        {
            char chd=txtcontact.getText().substring(txtcontact.getText().length()-1).charAt(0);
            if(chd>='0' && chd<='9')
            {

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Cannot put letters in Contact No.");
            }
        }
        if(k.getSource()==txtadh)
        {
         out:
         {
            char chd=txtadh.getText().substring(txtadh.getText().length()-1).charAt(0);
            if(chd>='0' && chd<='9')
            {

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Cannot put letters in Addhaar No.");
                txtadh.setText("");
                break out;
            }
            if(txtadh.getText().length()>12)
            {
                JOptionPane.showMessageDialog(null,"Addhaar must be of 12 numbers");
                txtadh.setText("");
                txtadh.requestFocus(true);
                break out;
            }
        }
        }
        if(k.getSource()==txtdoa)
        {
            char chd=txtdoa.getText().substring(txtdoa.getText().length()-1).charAt(0);
            if(chd>='0' && chd<='9'||chd=='/'||chd=='-')
            {

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Cannot put letters in  date of birth");
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
                String tsid=JOptionPane.showInputDialog(null,"Enter batch id");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select * from studenttbl where sid='"+tsid+"'");
                while(res.next())
                {
                    flg=1;
                    txtsid.setText(res.getString(1));
                    txtsname.setText(res.getString(2));
                    cmbqual.setSelectedItem(res.getString(3));
                    txtdoa.setText(res.getString(4));
                    txtcontact.setText(res.getString(5));
                    txtage.setText(res.getString(6));
                    txtadh.setText(res.getString(7));
                    txtother.setText(res.getString(8));
                    txtaddress.setText(res.getString(9));
                    txtemail.setText(res.getString(10));
                    if(res.getString(11).equalsIgnoreCase("male"))
                        rblmale.setSelected(true);
                    else
                        rblfem.setSelected(true);
                    btnedit.setEnabled(true);
                }
                if(flg==0)
                {
                     JOptionPane.showMessageDialog(null,"No such id exists");
                     txtsid.setText("");
                     txtsname.setText("");
                     txtdoa.setText("");
                     txtcontact.setText("");
                     txtage.setText("");
                     txtadh.setText("");
                     txtother.setText("");
                     txtaddress.setText("");
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
            String gender;
            try{
                aa:
                {
                if(txtsid.getText().length()!=0 && txtsname.getText().length()!=0 && ! cmbqual.getSelectedItem().toString().equalsIgnoreCase("Select") && txtdoa.getText().length()!=0 && txtcontact.getText().length()!=0 && txtage.getText().length()!=0 && txtadh.getText().length()!=0 && txtaddress.getText().length()!=0)
                {
                    if(rblmale.isSelected()==false && rblfem.isSelected()==false)
                    {
                        JOptionPane.showMessageDialog(null,"Please Enter Your Gender");
                        break aa;
                    }
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                String str="insert into studenttbl(sid,sname,qualification,date,contact,age,adh,other,address,email,gender) values(?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(str);
                ps.setString(1,txtsid.getText());
                ps.setString(2,txtsname.getText());
                ps.setString(3,""+cmbqual.getSelectedItem());
                ps.setString(4,txtdoa.getText());
                ps.setString(5,txtcontact.getText());
                ps.setString(6,txtage.getText());
                ps.setString(7,txtadh.getText());
                ps.setString(8,txtother.getText());
                ps.setString(9,txtaddress.getText());
                ps.setString(10,txtemail.getText());
                if(rblmale.isSelected())
                    gender="Male";
                else
                    gender="Female";
                ps.setString(11,gender);
                ps.executeUpdate();
                Statement st=con.createStatement();
                st.executeUpdate("update studentkeytbl set sid=sid+1");
                JOptionPane.showMessageDialog(null,"Record Saved!");
                btnsave.setEnabled(false);
                }

                else
                {
                    JOptionPane.showMessageDialog(null,"Fill complete details");
                }
              }
            }
              catch(Exception e)
              {
                System.out.println(e);
              }
        }
         if(a.getSource()==btnnew)
        {
            btnsave.setEnabled(true);
             txtsid.setText("");
             txtsname.setText("");
             txtdoa.setText("");
             txtcontact.setText("");
             txtage.setText("");
             txtadh.setText("");
             txtother.setText("");
             txtaddress.setText("");
             txtemail.setText("");
             cmbqual.setSelectedItem("Select");
             bg.clearSelection();
             try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select sid from studentkeytbl");
                while(res.next())
                {
                    txtsid.setText("s/"+res.getString(1));
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
        if(a.getSource()==btnedit)
        {
            String gender;
            try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
            Statement st=con.createStatement();
            if(rblmale.isSelected())
               gender="Male";
            else
               gender="Female";
            String str="update studenttbl set sname='"+txtsname.getText()+"',contact='"+txtcontact.getText()+"',date='"+txtdoa.getText()+"',age='"+txtage.getText()+"',adh='"+txtadh.getText()+"',other='"+txtother.getText()+"',email='"+txtemail.getText()+"',qualification='"+cmbqual.getSelectedItem()+"',address='"+txtaddress.getText()+"',gender='"+gender+"' where sid='"+txtsid.getText()+"'";
            st.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "Updated");
            }    
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String arg[])
    {
         new studentform();
    }
}