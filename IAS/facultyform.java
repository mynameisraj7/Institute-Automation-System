import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.*;
public class facultyform extends JFrame implements ActionListener,KeyListener
{
    JLabel lblcolor =new JLabel();
    JLabel lblcolor2 =new JLabel();
    JLabel lblcolor3 =new JLabel();
    JLabel lblimg = new JLabel();
    JLabel lblname=new JLabel("Faculty Form");
    JLabel lblname2=new JLabel("Personal Details");
    JLabel lblfid=new JLabel("Fid");
    JLabel lblfname=new JLabel("Fname");
    JLabel lbldoj=new JLabel("Doj");
    JLabel lblcon=new JLabel("Contact");
    JLabel lblage=new JLabel("Age");
    JLabel lblgen=new JLabel("Gender");
    JLabel lblqual=new JLabel("Qualification");
    JLabel lbladd=new JLabel("Address");
    JLabel lblexp=new JLabel("Experience");
    JTextField txtfid=new JTextField();
    JTextField txtfname=new JTextField();
    JTextField txtdoj=new JTextField();
    JTextField txtcon=new JTextField();
    JTextField txtage=new JTextField();
    JTextField txtqual=new JTextField();
    JTextField txtadd=new JTextField();
    JTextField txtexp=new JTextField();
    JRadioButton rblmale=new JRadioButton("Male");
    JRadioButton rblfem=new JRadioButton("Female");
    ButtonGroup bg=new ButtonGroup();
    JButton btnnew=new JButton("New");
    JButton btnsave=new JButton("Save");
    JButton btnsearch=new JButton("Search");
    JButton btnedit=new JButton("Edit");
    JButton btncancel=new JButton("Cancel");
    public facultyform()
    {
        setLayout(null);
        setSize(930,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setBackground(new Color(163,42,205));
        getContentPane().setBackground(new Color(252,246,254));  
        lblname2.setBounds(100,184,600,40);
        lblimg.setBounds(29,12,70,70);
        ImageIcon dimg=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/coin_4779353.png").getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(),Image.SCALE_DEFAULT));
        lblimg.setIcon(dimg); 
        lblname.setBounds(120,25,700,40);
        lblname.setFont(new Font("Arial",Font.BOLD,23));
        lblname2.setFont(new Font("Arial",Font.BOLD,19));
        txtexp.setFont(new Font("Arial",Font.PLAIN,14));     
        txtadd.setFont(new Font("Arial",Font.PLAIN,14));     
        txtqual.setFont(new Font("Arial",Font.PLAIN,14));     
        txtage.setFont(new Font("Arial",Font.PLAIN,14));     
        txtcon.setFont(new Font("Arial",Font.PLAIN,14));     
        txtdoj.setFont(new Font("Arial",Font.PLAIN,14));     
        txtfid.setFont(new Font("Arial",Font.PLAIN,14));     
        txtfname.setFont(new Font("Arial",Font.PLAIN,14));     
        lblfname.setFont(new Font("Arial",Font.PLAIN,14));
        lblfid.setFont(new Font("Arial",Font.PLAIN,14));
        lbldoj.setFont(new Font("Arial",Font.PLAIN,14));
        lblcon.setFont(new Font("Arial",Font.PLAIN,14));
        lblage.setFont(new Font("Arial",Font.PLAIN,14));
        lblgen.setFont(new Font("Arial",Font.PLAIN,14));
        lblqual.setFont(new Font("Arial",Font.PLAIN,14));
        lbladd.setFont(new Font("Arial",Font.PLAIN,14));
        lblexp.setFont(new Font("Arial",Font.PLAIN,14));
        btncancel.setFont(new Font("Arial",Font.PLAIN,14));
        btnsave.setFont(new Font("Arial",Font.PLAIN,14));
        btnsearch.setFont(new Font("Arial",Font.PLAIN,14));
        btnedit.setFont(new Font("Arial",Font.PLAIN,14));
        btnnew.setFont(new Font("Arial",Font.PLAIN,14));
        rblfem.setFont(new Font("Arial",Font.PLAIN,14));
        rblmale.setFont(new Font("Arial",Font.PLAIN,14));
        lblcolor.setBackground(new Color(168,66,203));
        lblcolor.setBounds(0,0,930,90);
        lblcolor2.setBackground(new Color(168,66,203));  
        lblcolor2.setBounds(0,180,930,45);
        lblcolor3.setBackground(new Color(168,66,203));  
        lblcolor3.setBounds(0,500,930,80);
        lblfid.setBounds(100,120,150,40);
        lblfname.setBounds(100,250,150,40);
        lbldoj.setBounds(100,300,150,40);
        lblcon.setBounds(100,350,150,40);
        lblage.setBounds(500,250,150,40);
        lblgen.setBounds(500,300,150,40);
        lblqual.setBounds(500,350,150,40);
        lbladd.setBounds(500,400,150,40);
        lblexp.setBounds(100,400,150,40);
        txtfid.setBounds(250,120,150,40);
        txtfname.setBounds(250,250,150,40);
        txtdoj.setBounds(250,300,150,40);
        txtcon.setBounds(250,350,150,40);
        txtage.setBounds(630,250,150,40);
        rblmale.setBounds(630,300,100,40);
        rblfem.setBounds(750,300,100,40);
        txtqual.setBounds(630,350,150,40);
        txtadd.setBounds(630,400,150,40);
        txtexp.setBounds(250,400,150,40);
        btnnew.setBounds(50,515,120,40);
        btnsave.setBounds(190,515,120,40);
        btnsearch.setBounds(330,515,120,40);
        btnedit.setBounds(470,515,120,40);
        btncancel.setBounds(610,515,120,40);
        add(lblimg);
        add(lblname);
        add(lblname2);
        add(lblcolor);
        add(lblcolor2);
        add(lblfid);
        add(lblfname);
        add(lbldoj);
        add(lblcon);
        add(lblage);
        add(lblgen);
        add(lblqual);
        add(lbladd);
        add(lbladd);
        add(lblexp);
        add(txtfid);
        add(txtfname);
        add(txtdoj);
        add(txtcon);
        add(txtage);
        add(txtqual);
        add(txtadd);
        add(txtexp);
        add(rblmale);
        add(rblfem);
        add(btnnew);
        bg.add(rblfem);
        bg.add(rblmale);
        add(btnsearch);
        add(btnedit);
        add(btncancel);
        add(btnsave);
        add(lblcolor3);
        lblcolor.setOpaque(true);
        lblcolor2.setOpaque(true);
        lblcolor3.setOpaque(true);
        txtfid.setEditable(false);
        btnnew.addActionListener(this);
        btnsave.addActionListener(this);
        btnsearch.addActionListener(this);
        btnedit.addActionListener(this);
        btncancel.addActionListener(this);
        txtfname.addKeyListener(this);
        txtage.addKeyListener(this);
        txtdoj.addKeyListener(this);
        txtcon.addKeyListener(this);
        btnsave.setEnabled(false);
        btnedit.setEnabled(false);
        repaint();
    }
    public void keyPressed(KeyEvent k)
    {

    }
    public void keyReleased(KeyEvent k)
    {
        if(k.getSource()==txtdoj)
        {
            char chd=txtdoj.getText().substring(txtdoj.getText().length()-1).charAt(0);
            if(chd>='0' && chd<='9'||chd=='/'||chd=='-')
            {

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Cannot put letters in  date");
                txtdoj.setText("");
            }    
        }
        if(k.getSource()==txtcon)
        {
            char chd=txtcon.getText().substring(txtcon.getText().length()-1).charAt(0);
            if(chd>='0' && chd<='9')
            {

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Cannot put letters in Contact No.");
                txtcon.setText("");
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
                txtage.setText("");
            }
        }
    }
    public void keyTyped(KeyEvent k)
    {

    }
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource()==btnsave)
        {
            String gen;
             try{
                if(txtadd.getText().length()!=0 && txtfid.getText().length()!=0 && txtfname.getText().length()!=0 && txtdoj.getText().length()!=0 && txtcon.getText().length()!=0 && txtexp.getText().length()!=0 && txtage.getText().length()!=0 && txtqual.getText().length()!=0)
                {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                String str="insert into facultytbl(fid,fname,doj,contact,age,gender,qual,address,exp) values(?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(str);
                ps.setString(1,txtfid.getText());
                ps.setString(2,txtfname.getText());
                ps.setString(3,txtdoj.getText());
                ps.setString(4,txtcon.getText());
                ps.setString(5,txtage.getText());
                if(rblmale.isSelected())
                    gen="Male";
                else
                    gen="Female";
                ps.setString(6,gen);
                ps.setString(7,txtqual.getText());
                ps.setString(8,txtadd.getText());
                ps.setString(9,txtexp.getText());
                ps.executeUpdate();
                Statement st=con.createStatement();
                st.executeUpdate("update facultykeytbl set fid=fid+1");
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
             txtfid.setText("");
             txtfname.setText("");
             txtdoj.setText("");
             txtcon.setText("");
             txtage.setText("");
             txtqual.setText("");
             txtadd.setText("");
             txtexp.setText("");
             btnsave.setEnabled(true);
             Date dt=new Date();
             SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
             String strdt=sdf.format(dt);
             txtdoj.setText(strdt);
             try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select fid from facultykeytbl");
                while(res.next())
                {
                    txtfid.setText("f/"+res.getString(1));
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        if(a.getSource()==btnsearch)
        {
            int flg=0;
            try{
                String tfid=JOptionPane.showInputDialog(null,"Enter faculty personid");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select * from facultytbl where fid='"+tfid+"'");
                while(res.next())
                {
                    flg=1;
                    txtfid.setText(res.getString(1));
                    txtfname.setText(res.getString(2));
                    txtdoj.setText(res.getString(3));
                    txtcon.setText(res.getString(4));
                    txtage.setText(res.getString(5));
                    if(res.getString(6).equalsIgnoreCase("Male"))
                        rblmale.setSelected(true);
                    else
                        rblfem.setSelected(true);
                    txtqual.setText(res.getString(7));
                    txtadd.setText(res.getString(8));
                    txtexp.setText(res.getString(9));
                    btnedit.setEnabled(true);
                }
                if(flg==0)
                {
                     JOptionPane.showMessageDialog(null,"No such id exists");
                     txtfid.setText("");
                     txtfname.setText("");
                     txtdoj.setText("");
                     txtcon.setText("");
                     txtage.setText("");
                     txtqual.setText("");
                     txtadd.setText("");
                     txtexp.setText("");
                     rblfem.setSelected(false);
                     rblmale.setSelected(false);
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
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
                String str="update facultytbl set fid='"+txtfid.getText()+"',fname='"+txtfname.getText()+"',doj='"+txtdoj.getText()+"',contact='"+txtcon.getText()+"',age='"+txtage.getText()+"',qual='"+txtqual.getText()+"',address='"+txtadd.getText()+"',exp='"+txtexp.getText()+"',gender='"+gender+"' where fid='"+txtfid.getText()+"'";
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
        new facultyform();
    }   
}
