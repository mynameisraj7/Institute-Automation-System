import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.*;
public class batchcreationform extends JFrame implements ActionListener,FocusListener,ItemListener,KeyListener
{
    JLabel lblcolor =new JLabel();
    JLabel lblcolor2 =new JLabel();
    JLabel lblcolor3 =new JLabel();
    JLabel lblimg = new JLabel();
    JLabel lblname=new JLabel("Batch Creation Form");
    JLabel lblname2=new JLabel("Batch Details");
    JLabel lblbid=new JLabel("Bid");
    JLabel lblbname=new JLabel("Bname");
    JLabel lblstart=new JLabel("Start Date");
    JLabel lbldays=new JLabel("Days");
    JLabel lblcid=new JLabel("Cid");
    JLabel lblcname=new JLabel("Cname");
    JLabel lblend=new JLabel("End Date");
    JButton btnnew=new JButton("New");
    JButton btnsave=new JButton("Save");
    JButton btnsearch=new JButton("Search");
    JButton btnedit=new JButton("Edit");
    JButton btncancel=new JButton("Cancel");
    JTextField txtbid=new JTextField();
    JTextField txtbname=new JTextField();
    JTextField txtstart=new JTextField();
    JTextField txtdays=new JTextField();
    @SuppressWarnings("rawtypes")
    JComboBox cmbcid=new JComboBox();
    JTextField txtcname=new JTextField();
    JTextField txtend=new JTextField();
    JCheckBox chksun=new JCheckBox("Sun");
    JCheckBox chkmon=new JCheckBox("Mon");
    JCheckBox chktue=new JCheckBox("Tue");
    JCheckBox chkwed=new JCheckBox("Wed");
    JCheckBox chkthu=new JCheckBox("Thu");
    JCheckBox chkfri=new JCheckBox("Fri");
    JCheckBox chksat=new JCheckBox("Sat");
    @SuppressWarnings("unchecked")
    public batchcreationform()
    {
        setLayout(null);
        setSize(910,530);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setBackground(new Color(163,42,205));
        lblimg.setBounds(29,12,70,70);
        ImageIcon dimg=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/coin_4779353.png").getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(),Image.SCALE_DEFAULT));
        lblimg.setIcon(dimg); 
        lblname.setBounds(120,25,700,40);
        lblname.setFont(new Font("Arial",Font.BOLD,23));
        lblname2.setBounds(100,167,600,40);
        lblname2.setFont(new Font("Arial",Font.BOLD,19));
        lblcolor.setBackground(new Color(168,66,203));
        lblcolor.setBounds(0,0,910,90);
        lblcolor2.setBackground(new Color(168,66,203));  
        lblcolor2.setBounds(0,165,910,45);
        lblcolor3.setBackground(new Color(168,66,203));  
        lblcolor3.setBounds(0,435,910,70);
        getContentPane().setBackground(new Color(252,246,254));
        lblbid.setFont(new Font("Arial",Font.PLAIN,14));
        txtbid.setFont(new Font("Arial",Font.PLAIN,14));
        txtbname.setFont(new Font("Arial",Font.PLAIN,14));
        txtstart.setFont(new Font("Arial",Font.PLAIN,14));
        txtdays.setFont(new Font("Arial",Font.PLAIN,14));
        txtcname.setFont(new Font("Arial",Font.PLAIN,14));
        txtend.setFont(new Font("Arial",Font.PLAIN,14));
        lblbname.setFont(new Font("Arial",Font.PLAIN,14));
        lblstart.setFont(new Font("Arial",Font.PLAIN,14));
        lbldays.setFont(new Font("Arial",Font.PLAIN,14));
        lblcid.setFont(new Font("Arial",Font.PLAIN,14));
        lblcname.setFont(new Font("Arial",Font.PLAIN,14));
        lblend.setFont(new Font("Arial",Font.PLAIN,14));
        btncancel.setFont(new Font("Arial",Font.PLAIN,14));
        btnnew.setFont(new Font("Arial",Font.PLAIN,14));
        btnsave.setFont(new Font("Arial",Font.PLAIN,14));
        btnsearch.setFont(new Font("Arial",Font.PLAIN,14));
        btnedit.setFont(new Font("Arial",Font.PLAIN,14));
        chkfri.setFont(new Font("Arial",Font.PLAIN,14));
        chkmon.setFont(new Font("Arial",Font.PLAIN,14));
        chktue.setFont(new Font("Arial",Font.PLAIN,14));
        chkwed.setFont(new Font("Arial",Font.PLAIN,14));
        chkthu.setFont(new Font("Arial",Font.PLAIN,14));
        chksat.setFont(new Font("Arial",Font.PLAIN,14));
        chksun.setFont(new Font("Arial",Font.PLAIN,14));
        lblbid.setBounds(100,110,150,40);
        lblbname.setBounds(100,220,150,40);
        lblstart.setBounds(100,270,150,40);
        lbldays.setBounds(100,320,150,40);
        lblcid.setBounds(500,110,150,40);
        cmbcid.setBounds(650,110,150,40);
        add(cmbcid);
        lblcname.setBounds(500,220,150,40);
        txtcname.setBounds(650,220,150,40);
        lblend.setBounds(500,270,150,40);
        txtend.setBounds(650,270,150,40);
        txtbid.setBounds(250,110,150,40);
        txtbname.setBounds(250,220,150,40);
        txtstart.setBounds(250,270,150,40);
        txtdays.setBounds(250,370,150,40);
        chkmon.setBounds(250,323,60,35);
        chktue.setBounds(310,323,60,35);
        chkwed.setBounds(370,323,70,35);
        chkthu.setBounds(430,323,60,35);
        chkfri.setBounds(490,323,60,35);
        chksat.setBounds(550,323,60,35);
        chksun.setBounds(610,323,60,35);
        btnnew.setBounds(50,450,125,40);
        btnsave.setBounds(195,450,125,40);
        btnsearch.setBounds(340,450,125,40);
        btnedit.setBounds(485,450,125,40);
        btncancel.setBounds(630,450,125,40);
        add(lblimg);
        add(lblname);
        add(lblname2);
        add(btncancel);
        add(lblbid);
        add(lblbname);
        add(lblstart);
        add(lbldays);
        add(lblcid);
        add(lblcname);
        add(lblend);
        add(txtbid);
        add(txtbname);
        add(txtstart);
        add(txtdays);
        add(txtcname);
        add(txtend);
        add(chkmon);
        add(chktue);
        add(chkwed);
        add(chkthu);
        add(chkfri);
        add(chksat);
        add(chksun);
        add(btnnew);
        add(btnsearch);
        add(btnedit);
        add(btnsave);
        add(lblcolor);
        add(lblcolor2);
        add(lblcolor3);
        cmbcid.addItem("Select");
        lblcolor.setOpaque(true);
        lblcolor2.setOpaque(true);
        lblcolor3.setOpaque(true);
        cmbcid.addActionListener(this);
        cmbcid.addFocusListener(this);
        txtbid.setEditable(false);
        txtcname.setEditable(false);
        txtdays.setEditable(false);
        btnnew.addActionListener(this);
        btnsave.addActionListener(this);
        btnsearch.addActionListener(this);
        btnedit.addActionListener(this);
        btncancel.addActionListener(this);
        chkmon.addItemListener(this);
        txtend.addFocusListener(this);
        chktue.addItemListener(this);
        chkwed.addItemListener(this);
        chkthu.addItemListener(this);
        chkfri.addItemListener(this);
        chksat.addItemListener(this);
        chksun.addItemListener(this);
        txtbname.addKeyListener(this);
        txtstart.addKeyListener(this);
        txtend.addKeyListener(this);
        btnsave.setEnabled(false);
        btnedit.setEnabled(false);
        repaint();
    }
    public void keyPressed(KeyEvent k)
    {

    }
    public void keyReleased(KeyEvent k)
    {
        if(k.getSource()==txtbname)
        {
            char ch=txtbname.getText().substring(txtbname.getText().length()-1).charAt(0);
            if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
            {

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Cannot put numbers in batch name");
            }
        }
    }
    public void keyTyped(KeyEvent k)
    {

    }
    public void itemStateChanged(ItemEvent i)
    {
        if(i.getSource()==chkmon||i.getSource()==chktue||i.getSource()==chkwed||i.getSource()==chkthu||i.getSource()==chkfri||i.getSource()==chksat||i.getSource()==chksun)
        {
            txtdays.setText("");
                 if(chkmon.isSelected())
                 {
                     txtdays.setText("Mon");
                }
                if(chktue.isSelected())
                {
                    txtdays.setText(txtdays.getText()+"Tue");
                }
                if(chkwed.isSelected())
                {
                    txtdays.setText(txtdays.getText()+"Wed");
                }
                if(chkthu.isSelected())
                {
                    txtdays.setText(txtdays.getText()+"Thu");
                }
                if(chkfri.isSelected())
                {
                    txtdays.setText(txtdays.getText()+"Fri");
                }
                if(chksat.isSelected())
                {
                    txtdays.setText(txtdays.getText()+"Sat");
                }
                if(chksun.isSelected())
                {
                    txtdays.setText(txtdays.getText()+"Sun"); 
                }
            }
    }
    public void focusLost(FocusEvent f)
    {
       if(f.getSource()==txtend)
       {
        try{
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
            Date first=sdf.parse(txtstart.getText());
            Date second=sdf.parse(txtend.getText());
            long diffmill=Math.abs(second.getTime()-first.getTime());
            long d=diffmill/(1000*24*60*60);
            JOptionPane.showMessageDialog(null,d);
            }
            catch(Exception ee)
            {
                System.out.println(ee);
            }
       }
    }
    public void focusGained(FocusEvent f)
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
        }
        if(a.getSource()==btnnew)
        {
            txtbid.setText("");
            txtbname.setText("");
            txtstart.setText("");
            txtdays.setText("");
            txtcname.setText("");
            txtend.setText("");
            chkmon.setSelected(false);
            chktue.setSelected(false);
            chkwed.setSelected(false);
            chkthu.setSelected(false);
            chkfri.setSelected(false);
            chksat.setSelected(false);
            chksun.setSelected(false);
            btnsave.setEnabled(true);
            cmbcid.removeAllItems();
            Date dt=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
            String strdt=sdf.format(dt);
            txtstart.setText(strdt);
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select bid from batchkeytbl");
                while(res.next())
                {
                    txtbid.setText("b/"+res.getString(1));
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
        }
        if(a.getSource()==btnsave)
        {
            try{
                if(txtbid.getText().length()!=0 && txtbname.getText().length()!=0 && txtstart.getText().length()!=0 && txtend.getText().length()!=0 && txtcname.getText().length()!=0 && txtbid.getText().length()!=0 && txtdays.getText().length()!=0 && ! cmbcid.getSelectedItem().toString().equalsIgnoreCase("Select"))
                {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                String str="insert into batchcreation(bid,bname,cid,cname,enddate,startdate,days) values(?,?,?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(str);
                ps.setString(1,txtbid.getText());
                ps.setString(2,txtbname.getText());
                ps.setString(3,""+cmbcid.getSelectedItem());
                ps.setString(4,txtcname.getText());
                ps.setString(5,txtstart.getText());
                ps.setString(6,txtend.getText());
                ps.setString(7,txtdays.getText());
                ps.executeUpdate();
                Statement st=con.createStatement();
                st.executeUpdate("update batchkeytbl set bid=bid+1");
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
        if(a.getSource()==btnsearch)
        {
            int flg=0;
            try{
                String tbid=JOptionPane.showInputDialog(null,"Enter batch id");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select * from batchcreation where bid='"+tbid+"'");
                while(res.next())
                {
                    flg=1;
                    txtbid.setText(res.getString(1));
                    txtbname.setText(res.getString(2));
                    txtcname.setText(res.getString(4));
                    txtstart.setText(res.getString(5));
                    txtend.setText(res.getString(6));
                    txtdays.setText(res.getString(7));
                    btnedit.setEnabled(true);
                }
                if(flg==0)
                {
                     JOptionPane.showMessageDialog(null,"No such id exists");
                     txtbid.setText("");
                     txtbname.setText("");
                     txtcname.setText("");
                     txtstart.setText("");
                     txtend.setText("");
                     txtdays.setText("");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        if(a.getSource()==btnedit)
        {
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                String str="update batchcreation set bid='"+txtbid.getText()+"',bname='"+txtbname.getText()+"',cid='"+cmbcid.getSelectedItem()+"',cname='"+txtcname.getText()+"',startdate='"+txtstart.getText()+"',enddate='"+txtend.getText()+"',days='"+txtdays.getText()+"' where bid='"+txtbid.getText()+"'";
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
        new batchcreationform();
    }
}