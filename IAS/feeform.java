import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.awt.*;
public class feeform extends JFrame implements ActionListener,KeyListener,FocusListener
{
    JLabel lblcolor =new JLabel();
    JLabel lblcolor2 =new JLabel();
    JLabel lblcolor3 =new JLabel();
    JLabel lblimg = new JLabel();
    JLabel lblname=new JLabel("Fee Form");
    JLabel lblname2=new JLabel("Fee Table");
    JLabel lblsid= new JLabel("Sid"); 
    JLabel lblsname= new JLabel("Sname"); 
    JLabel lblcid= new JLabel("Cid"); 
    JLabel lblcname= new JLabel("Cname"); 
    JLabel lbldate= new JLabel("Payment Date"); 
    JLabel lblamt= new JLabel("Amount"); 
    String col[]={"S No","Date","Course Name","Amount Paid"};
    String S_No,fDate,Course_Name,Amount_Paid;
    Object data[][]={{S_No},{fDate},{Course_Name},{Amount_Paid}};
    DefaultTableModel model=new DefaultTableModel(col,0);
    JTable tbl=new JTable(data,col);
    JScrollPane scrl= new JScrollPane(tbl); 
    JTextField txtsid= new JTextField(); 
    JTextField txtsname= new JTextField(); 
    @SuppressWarnings("rawtypes")
    JComboBox cmbcid= new JComboBox(); 
    JTextField txtcname= new JTextField();
    JTextField txtdate= new JTextField();
    JTextField txtamt= new JTextField();
    JButton btnnew=new JButton("New");
    JButton btnsave=new JButton("Save");
    JButton btncancel=new JButton("Cancel");
    TableColumnModel cm=tbl.getColumnModel();
    JTableHeader h=tbl.getTableHeader();
    @SuppressWarnings("unchecked")
    public feeform()
    {
        lblimg.setBounds(29,12,70,70);
        ImageIcon dimg=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/coin_4779353.png").getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(),Image.SCALE_DEFAULT));
        lblimg.setIcon(dimg); 
        h.setFont(new Font("Arial",Font.PLAIN,14));
        setLayout(null);
        setSize(930,700);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setBackground(new Color(163,42,205));
        getContentPane().setBackground(new Color(252,246,254));
        lblname.setBounds(120,25,700,40);
        lblname.setFont(new Font("Arial",Font.BOLD,23));
        lblname2.setBounds(100,267,600,40);
        lblname2.setFont(new Font("Arial",Font.BOLD,19));
        lblcolor.setBackground(new Color(168,66,203));
        lblcolor.setBounds(0,0,930,90);
        lblcolor2.setBackground(new Color(168,66,203));  
        lblcolor2.setBounds(0,265,930,45);
        lblcolor3.setBackground(new Color(168,66,203));  
        lblcolor3.setBounds(0,600,1075,75);
        lblsid.setFont(new Font("Arial",Font.PLAIN,14));
        txtsid.setFont(new Font("Arial",Font.PLAIN,14));
        txtsname.setFont(new Font("Arial",Font.PLAIN,14));
        cmbcid.setFont(new Font("Arial",Font.PLAIN,14));
        txtcname.setFont(new Font("Arial",Font.PLAIN,14));
        txtdate.setFont(new Font("Arial",Font.PLAIN,14));
        txtamt.setFont(new Font("Arial",Font.PLAIN,14));
        lblsname.setFont(new Font("Arial",Font.PLAIN,14));
        lblcid.setFont(new Font("Arial",Font.PLAIN,14));
        lblcname.setFont(new Font("Arial",Font.PLAIN,14));
        lbldate.setFont(new Font("Arial",Font.PLAIN,14));
        lblamt.setFont(new Font("Arial",Font.PLAIN,14));
        btncancel.setFont(new Font("Arial",Font.PLAIN,14));
        btnsave.setFont(new Font("Arial",Font.PLAIN,14));
        btnnew.setFont(new Font("Arial",Font.PLAIN,14));
        tbl.setFont(new Font("Arial",Font.PLAIN,12));
        lblsid.setBounds(100,110,150,40);
        lblcid.setBounds(100,150,160,40);
        lbldate.setBounds(100,210,150,40);
       lblsname.setBounds(500,110,150,40);
       lblcname.setBounds(500,160,150,40);
       lblamt.setBounds(500,210,150,40);
       txtsid.setBounds(250,110,150,40);
        cmbcid.setBounds(250,160,150,40);
        add(cmbcid);
       txtdate.setBounds(250,210,150,40);
        txtsname.setBounds(650,110,150,40);
       txtcname.setBounds(650,160,150,40);
       txtamt.setBounds(650,210,150,40);
       scrl.setBounds(155,340,600,230);
        btnnew.setBounds(75,619,125,40);
        btnsave.setBounds(220,619,125,40);
       btncancel.setBounds(365,619,125,40);
        tbl.setModel(model);
        cm.getColumn(0).setPreferredWidth(80);
        cm.getColumn(1).setPreferredWidth(140);
        cm.getColumn(2).setPreferredWidth(140);
        cm.getColumn(3).setPreferredWidth(140);
        cmbcid.addItem("Select");
        add(lblname);
        add(lblname2);
        add(lblimg);
        add(lblsid);
        add(lblcid);
        add(lbldate);
        add(lblsname);
        add(lblcname);
        add(lblamt);
        add(txtsid);
        add(txtsname);
        add(txtdate);
        add(txtamt);
        add(txtcname);
        add(btnnew);
        add(btnsave);
        add(btncancel);
        add(scrl);
        add(lblcolor);
        add(lblcolor2);
        add(lblcolor3);
        lblcolor.setOpaque(true);
        lblcolor2.setOpaque(true);
        lblcolor3.setOpaque(true);
        txtsname.setEditable(false);
        txtamt.setEditable(false);
        txtcname.setEditable(false);
        txtdate.setEditable(false);
        tbl.setRowHeight(30);
        txtsid.addFocusListener(this);
        cmbcid.addActionListener(this);
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
        if(f.getSource()==txtsid)
        {
            int i=1;
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select * from paymenttbl where sid='"+txtsid.getText()+"'");
                model.setRowCount(0);
                while(res.next())
                {
                    @SuppressWarnings("rawtypes")
                    Vector v=new Vector();
                     v.add(i);
                     v.add(res.getString(5));
                     v.add(res.getString(4));
                     v.add(res.getString(7));
                     model.addRow(v);
                     i++;
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
        if(a.getSource()==btnnew)
        {
             Date dt1=new Date();
             SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
             String strdt=sdf.format(dt1);
             txtdate.setText(strdt);
             txtsname.setText("");
             txtamt.setText("");
             txtsid.setText("");
             txtsname.setText("");
             txtcname.setText("");
             cmbcid.setSelectedItem("Select");
             model.setRowCount(0);
             btnsave.setEnabled(true);
        }
        if(a.getSource()==btnsave)
        {
            try{
                if(txtsid.getText().length()!=0 && txtsname.getText().length()!=0 && txtcname.getText().length()!=0 && txtamt.getText().length()!=0 && txtdate.getText().length()!=0 && txtdate.getText().length()!=0 && ! cmbcid.getSelectedItem().toString().equalsIgnoreCase("Select"))
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
        new feeform();
    }
}