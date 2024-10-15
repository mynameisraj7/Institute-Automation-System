import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.*;
public class enrollmentform extends JFrame implements ActionListener,KeyListener,FocusListener,ItemListener
{
    JLabel lblcolor =new JLabel();
    JLabel lblcolor2 =new JLabel();
    JLabel lblcolor3 =new JLabel();
    JLabel lblimg = new JLabel();
    JLabel lblname=new JLabel("Enrollment Form");
    JLabel lblname2=new JLabel("Enrollment Details");
    String z="";
    JLabel lblsid=new JLabel("Sid");
    JLabel lblsname=new JLabel("Sname");
    JLabel lblsdoa=new JLabel("Sdoa");
    JLabel lblscontact=new JLabel("Scontact");
    JLabel lblcid=new JLabel("Cid");
    JLabel lblcname=new JLabel("Cname");
    JLabel lbldiscount=new JLabel("Discount(%)");
    JLabel lblamt=new JLabel("Course Amount");
    JLabel lblidate=new JLabel("Installment Date");
    JLabel lbliamt=new JLabel("Installment Amount");
    JLabel lblbid=new JLabel("Batch id");
    JLabel lbldamt=new JLabel("Discounted Amount");
    @SuppressWarnings("rawtypes")
    JComboBox cmbbid=new JComboBox();
    JTextField txtsid=new JTextField();
    JTextField txtsname=new JTextField();
    JTextField txtsdoa=new JTextField();
    JTextField txtscontact=new JTextField();
    @SuppressWarnings("rawtypes")
    JComboBox cmbcid=new JComboBox();
    JTextField txtcname=new JTextField();
    JTextField txtdiscount=new JTextField();
    JTextField txtamt=new JTextField();
    JTextArea txtidate=new JTextArea();
    JTextField txtiamt=new JTextField();
    JTextField txtdamt=new JTextField();
    JRadioButton rblinst=new JRadioButton("Installment");
    JRadioButton rblone=new JRadioButton("OneTime");
    ButtonGroup bg=new ButtonGroup();
    JRadioButton rbl2time=new JRadioButton("2time");
    JRadioButton rbl3time=new JRadioButton("3time");
    JRadioButton rbl4time=new JRadioButton("4time");
    ButtonGroup ibg=new ButtonGroup();
    JButton btnnew=new JButton("New");
    JButton btnsave=new JButton("Save");
    JButton btnsearch=new JButton("Search");
    JButton btnedit=new JButton("Edit");
    JButton btncancel=new JButton("Cancel");
    @SuppressWarnings("unchecked")
    
    public enrollmentform()
    {
        setLayout(null);
        setSize(950,670);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setBackground(new Color(163,42,205));
        getContentPane().setBackground(new Color(252,246,254));
        lblimg.setBounds(29,12,70,70);
        ImageIcon dimg=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/coin_4779353.png").getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(),Image.SCALE_DEFAULT));
        lblimg.setIcon(dimg); 
        lblname.setBounds(120,25,700,40);
        lblname2.setBounds(100,167,600,40);
        lblname2.setFont(new Font("Arial",Font.BOLD,19));
        lblcolor.setBackground(new Color(168,66,203));
        lblcolor.setBounds(0,0,950,90);
        lblcolor2.setBackground(new Color(168,66,203));  
        lblcolor2.setBounds(0,165,950,45);
        lblcolor3.setBackground(new Color(168,66,203));  
        lblcolor3.setBounds(0,570,950,75);
        lblname.setFont(new Font("Arial",Font.BOLD,23));
        lblsid.setFont(new Font("Arial",Font.PLAIN,14));
        lblsname.setFont(new Font("Arial",Font.PLAIN,14));
        lblsdoa.setFont(new Font("Arial",Font.PLAIN,14));
        lblscontact.setFont(new Font("Arial",Font.PLAIN,14));
        lblcid.setFont(new Font("Arial",Font.PLAIN,14));
        lblcname.setFont(new Font("Arial",Font.PLAIN,14));
        lbldiscount.setFont(new Font("Arial",Font.PLAIN,14));
        lblamt.setFont(new Font("Arial",Font.PLAIN,14));
        lblidate.setFont(new Font("Arial",Font.PLAIN,14));
        lbliamt.setFont(new Font("Arial",Font.PLAIN,14));
        lblbid.setFont(new Font("Arial",Font.PLAIN,14));
        lblamt.setFont(new Font("Arial",Font.PLAIN,14));
        txtscontact.setFont(new Font("Arial",Font.PLAIN,14));
        txtsname.setFont(new Font("Arial",Font.PLAIN,14));
        txtsdoa.setFont(new Font("Arial",Font.PLAIN,14));
        txtdamt.setFont(new Font("Arial",Font.PLAIN,14));
        txtdiscount.setFont(new Font("Arial",Font.PLAIN,14));
        txtamt.setFont(new Font("Arial",Font.PLAIN,14));
        txtsid.setFont(new Font("Arial",Font.PLAIN,14));
        txtcname.setFont(new Font("Arial",Font.PLAIN,14));
        txtidate.setFont(new Font("Arial",Font.PLAIN,14));
        txtiamt.setFont(new Font("Arial",Font.PLAIN,14));
        btncancel.setFont(new Font("Arial",Font.PLAIN,14));
        btnedit.setFont(new Font("Arial",Font.PLAIN,14));
        btnsave.setFont(new Font("Arial",Font.PLAIN,14));
        btnnew.setFont(new Font("Arial",Font.PLAIN,14));
        btnsearch.setFont(new Font("Arial",Font.PLAIN,14));
        rbl2time.setFont(new Font("Arial",Font.PLAIN,14));
        rbl3time.setFont(new Font("Arial",Font.PLAIN,14));
        rbl4time.setFont(new Font("Arial",Font.PLAIN,14));
        cmbbid.setFont(new Font("Arial",Font.PLAIN,14));
        cmbcid.setFont(new Font("Arial",Font.PLAIN,14));
        rblone.setFont(new Font("Arial",Font.PLAIN,14));
        rblinst.setFont(new Font("Arial",Font.PLAIN,14));
        rblone.setBounds(250,420,150,40);
        bg.add(rblone);
        lblsid.setBounds(100,110,150,40);
        lblsname.setBounds(500,110,150,40);
        lblcid.setBounds(100,220,150,40);
        lblamt.setBounds(100,270,150,40);
        rblinst.setBounds(90,420,150,40);
        bg.add(rblinst);
        lblscontact.setBounds(500,320,150,40);
        rbl2time.setBounds(500,420,150,40);
        ibg.add(rbl2time);
        rbl3time.setBounds(650,420,150,40);
        ibg.add(rbl3time);
        rbl4time.setBounds(800,420,150,40);
        ibg.add(rbl4time);
        txtscontact.setBounds(650,320,150,40);
        lblcname.setBounds(500,220,150,40);
        txtcname.setBounds(650,220,150,40);
        lblsdoa.setBounds(500,270,150,40);
        txtsdoa.setBounds(650,270,150,40);
        lbliamt.setBounds(100,470,150,40);
        lbldamt.setBounds(500,370,150,40);
        lblbid.setBounds(100,320,150,40);
        txtdamt.setBounds(650,370,150,40);
        cmbbid.setBounds(250,320,150,40);
        add(cmbbid);
        lbldiscount.setBounds(100,370,150,40);
        txtdiscount.setBounds(250,370,150,40);
        lblidate.setBounds(500,470,150,40);
        txtidate.setBounds(650,470,120,65);
        txtsid.setBounds(250,110,150,40);
        txtsname.setBounds(650,110,150,40);
        cmbcid.setBounds(250,220,150,40);
        add(cmbcid);
        txtamt.setBounds(250,270,150,40);
        txtiamt.setBounds(250,470,150,40);
        btnnew.setBounds(50,588,135,40);
        btnsave.setBounds(205,588,135,40);
        btnsearch.setBounds(360,588,135,40);
        btnedit.setBounds(515,588,135,40);
        btncancel.setBounds(670,588,135,40);
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
            Statement st=con.createStatement();
            ResultSet res=st.executeQuery("select bid from batchcreation");
            cmbbid.addItem("Select");
            while(res.next())
            {
                  cmbbid.addItem(res.getString(1));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
            Statement st=con.createStatement();
            ResultSet res=st.executeQuery("select courseid from coursetbl");
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
        add(lblname);
        add(lblname2);
        add(lblimg);
        add(lblsid);
        add(lblsname);
        add(lblsdoa);
        add(lblscontact);
        add(lblcid);
        add(lblbid);
        add(lblcname);
        add(rblone);
        add(rblinst);
        add(rbl2time);
        add(rbl3time);
        add(rbl4time);
        add(lbldiscount);
        add(lbldamt);
        add(lblamt);
        add(lblidate);
        add(lbliamt);
        add(txtsid);
        add(txtsname);
        add(txtsdoa);
        add(txtscontact);
        add(txtcname);
        add(txtdiscount);
        add(txtamt);
        add(txtidate);
        add(txtiamt);
        add(txtdamt);
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
        txtscontact.setEditable(false);
        txtsdoa.setEditable(false);
        txtsname.setEditable(false);
        txtcname.setEditable(false);
        txtdiscount.setEditable(false);
        txtamt.setEditable(false);
        btnnew.addActionListener(this);
        btnsave.addActionListener(this);
        btnsearch.addActionListener(this);
        btnedit.addActionListener(this);
        btncancel.addActionListener(this);
        txtsname.addKeyListener(this);
        txtscontact.addKeyListener(this);
        txtamt.addKeyListener(this);
        txtscontact.addFocusListener(this);
        txtdiscount.addFocusListener(this);
        rblone.addItemListener(this);
        rblinst.addItemListener(this);
        rblinst.addActionListener(this);
        cmbcid.addActionListener(this);
        txtsid.addFocusListener(this);
        txtdamt.addFocusListener(this);
        rblinst.addActionListener(this);
        rbl2time.addActionListener(this);
        rbl3time.addActionListener(this);
        rbl4time.addActionListener(this);
        btnsave.setEnabled(false);
        btnedit.setEnabled(false);
        repaint();
    }
    public void itemStateChanged(ItemEvent i)
    {
        if(i.getSource()==rblone)
        {
            txtiamt.setVisible(false);
            lbliamt.setVisible(false);
            txtidate.setVisible(false);
            lblidate.setVisible(false);
            rbl2time.setVisible(false);
            rbl3time.setVisible(false);
            rbl4time.setVisible(false);
        }
    }
    public void focusGained(FocusEvent f)
    {

    }
    public void focusLost(FocusEvent f)
    {
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
        if(f.getSource()==txtsid)
        {
            txtscontact.setText("");
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select contact from studenttbl where sid='"+txtsid.getText()+"'");
                while(res.next())
                {
                     txtscontact.setText(res.getString(1));
                }
               }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        if(f.getSource()==txtsid)
        {
            txtsdoa.setText("");
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select date from studenttbl where sid='"+txtsid.getText()+"'");
                while(res.next())
                {
                     txtsdoa.setText(res.getString(1));
                }
               }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        if(f.getSource()==txtdiscount)
        {
            txtdamt.setText("");
            int a =Integer.parseInt(txtamt.getText());
            int d =Integer.parseInt(txtdiscount.getText());
            int c=Math.abs((a/100)*d);
            txtdamt.setText(Integer.toString(Math.abs((a-c))));
        }
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
                txtsname.setText(txtsname.getText().substring(0,txtsname.getText().length()-1));
            }
        }
        if(k.getSource()==txtscontact)
        {
            char chd=txtscontact.getText().substring(txtscontact.getText().length()-1).charAt(0);
            if(chd>='0' && chd<='9')
            {

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Cannot put letters in Contact No.");
            }
        }
        if(k.getSource()==txtamt)
        {
            char chd=txtamt.getText().substring(txtamt.getText().length()-1).charAt(0);
            if(chd>='0' && chd<='9')
            {

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Cannot put letters in Amount");
            }
        }
    }
    public void keyTyped(KeyEvent k)
    {
       
    }
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource()==rblone)
        {
            rbl2time.setVisible(false);
            rbl3time.setVisible(false);
            rbl4time.setVisible(false);
            txtiamt.setVisible(false);
            lbliamt.setVisible(false);
            txtidate.setVisible(false);
            lblidate.setVisible(false);
        }
        if(a.getSource()==rblinst)
        {
            rbl2time.setVisible(true);
            rbl3time.setVisible(true);
            rbl4time.setVisible(true);
            txtiamt.setVisible(true);
            lbliamt.setVisible(true);
            txtidate.setVisible(true);
            lblidate.setVisible(true);
        }
            if(a.getSource()==rbl2time)
            {
                z="";
                Date tdt=new Date();
                SimpleDateFormat tsdf=new SimpleDateFormat("dd/MMM/yyyy");
                Calendar c=Calendar.getInstance();
                c.setTime(tdt);
                c.add(Calendar.MONTH,1);
                String ndt=tsdf.format(c.getTime());
                z=z+ndt+",";
                txtidate.setText(ndt);
                c.add(Calendar.MONTH,1);
                ndt=tsdf.format(c.getTime());
                z=z+ndt;
                txtidate.setText(txtidate.getText()+"\n"+ndt);
                int d =Integer.parseInt(txtdamt.getText());
                txtiamt.setText(Integer.toString(Math.abs((d/2))));
            }
            if(a.getSource()==rbl3time)
            {
                z="";
                Date tdt=new Date();
                SimpleDateFormat tsdf=new SimpleDateFormat("dd/MMM/yyyy");
                Calendar c=Calendar.getInstance();
                c.setTime(tdt);
                c.add(Calendar.MONTH,1);
                String ndt=tsdf.format(c.getTime());
                z=z+ndt+",";
                txtidate.setText(ndt);
                c.add(Calendar.MONTH,1);
                ndt=tsdf.format(c.getTime());
                z=z+ndt+",";
                txtidate.setText(txtidate.getText()+"\n"+ndt);
                c.add(Calendar.MONTH,1);
                ndt=tsdf.format(c.getTime());
                z=z+ndt;
                txtidate.setText(txtidate.getText()+"\n"+ndt);
                int d =Integer.parseInt(txtdamt.getText());
                txtiamt.setText(Integer.toString(Math.abs((d/3))));
            }
            if(a.getSource()==rbl4time)
            {
                z="";
                Date tdt=new Date();
                SimpleDateFormat tsdf=new SimpleDateFormat("dd/MMM/yyyy");
                Calendar c=Calendar.getInstance();
                c.setTime(tdt);
                c.add(Calendar.MONTH,1);
                String ndt=tsdf.format(c.getTime());
                z=z+ndt+",";
                txtidate.setText(ndt);
                c.add(Calendar.MONTH,1);
                ndt=tsdf.format(c.getTime());
                z=z+ndt+",";
                txtidate.setText(txtidate.getText()+"\n"+ndt);
                c.add(Calendar.MONTH,1);
                ndt=tsdf.format(c.getTime());
                z=z+ndt+",";
                txtidate.setText(txtidate.getText()+"\n"+ndt);
                c.add(Calendar.MONTH,1);
                ndt=tsdf.format(c.getTime());
                z=z+ndt;
                txtidate.setText(txtidate.getText()+"\n"+ndt);
                int d =Integer.parseInt(txtdamt.getText());
                txtiamt.setText(Integer.toString(Math.abs((d/4))));
            }
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
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select fee from coursetbl where courseid='"+cmbcid.getSelectedItem()+"'");
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
        if(a.getSource()==btncancel)
        {
            this.dispose();
        }
        if(a.getSource()==btnnew)
        {
             Date dt1=new Date();
             SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
             String strdt=sdf.format(dt1);
             txtsdoa.setText(strdt);
             txtsname.setText("");
             txtscontact.setText("");
             txtamt.setText("");
             txtscontact.setText("");
             txtdiscount.setText("");
             txtsid.setText("");
             txtiamt.setText("");
             txtidate.setText("");
             cmbbid.setSelectedItem("Select");
             cmbcid.setSelectedItem("Select");
             bg.clearSelection();
             btnsave.setEnabled(true);
             btnedit.setEnabled(true);
        }
        if(a.getSource()==btnedit)
        {
            String pmode;
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                if(rblinst.isSelected())
                   pmode="installment";
                else
                   pmode="onetime";
                String str="update enrollmenttbl set sid='"+txtsid.getText()+"',sdoa='"+txtsdoa.getText()+"',cid='"+cmbcid.getSelectedItem()+"',cname='"+txtcname.getText()+"',sname='"+txtsname.getText()+"',amountt='"+txtamt.getText()+"',discount='"+txtdiscount.getText()+"',batchid='"+cmbbid.getSelectedItem()+"',damt='"+txtdamt.getText()+"',ptype='"+pmode+"' where sid='"+txtsid.getText()+"'";
                st.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "Updated");
                }    
                catch(Exception e)
                {
                    System.out.println(e);
                }
        }
        if(a.getSource()==btnsave)
        {
            String pmode;
            try{
                aa:
                {
                if(txtamt.getText().length()!=0 && txtsid.getText().length()!=0 && txtsname.getText().length()!=0 && txtscontact.getText().length()!=0 && txtsdoa.getText().length()!=0 && txtcname.getText().length()!=0 && txtdiscount.getText().length()!=0 && txtdamt.getText().length()!=0 &&  ! cmbcid.getSelectedItem().toString().equalsIgnoreCase("Select") &&  ! cmbbid.getSelectedItem().toString().equalsIgnoreCase("Select"))
                {
                    if(rblinst.isSelected()==false && rblone.isSelected()==false)
                    {
                        JOptionPane.showMessageDialog(null,"Please Enter Your Gender");
                        break aa;
                    }
                    if(rblinst.isSelected()==true)
                    {
                        if(rbl2time.isSelected()==true || rbl3time.isSelected()==true || rbl4time.isSelected()==true)
                        {

                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Please Enter the Installlment Time");
                            break aa;
                        }
                    }
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                String str="insert into enrollmenttbl(sid,sdoa,sname,cid,cname,amountt,discount,batchid,installmentamt,installmentdate,ptype,damt) values(?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(str);
                ps.setString(1,txtsid.getText());
                ps.setString(2,txtsdoa.getText());
                ps.setString(3,txtsname.getText());
                ps.setString(4,""+cmbcid.getSelectedItem());
                ps.setString(5,txtcname.getText());
                ps.setString(6,txtamt.getText());
                ps.setString(7,txtdiscount.getText());
                ps.setString(8,""+cmbbid.getSelectedItem());
                ps.setString(9,txtiamt.getText());
                ps.setString(10,z); 
                ps.setString(12,txtdamt.getText()); 
                if(rblinst.isSelected())
                    pmode="installment";
                else
                    pmode="onetime";
                ps.setString(11,pmode);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Record Saved!");
                btnsave.setEnabled(false);
              }
              else{
                JOptionPane.showMessageDialog(null,"Fill complete details");
            }
            }
        }
              catch(Exception e)
              {
                System.out.println(e);
              }
            }
    }
    public static void main(String arg[])
    {
        new enrollmentform();
    }
}