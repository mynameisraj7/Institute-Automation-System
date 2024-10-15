import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.sql.*;
import java.awt.*;
public class followupform extends JFrame implements ActionListener,FocusListener
{
    JLabel lblcolor =new JLabel();
    JLabel lblcolor2 =new JLabel();
  JLabel lblcolor3 =new JLabel();
    JLabel lblimg = new JLabel();
    JLabel lblname=new JLabel("FollowUp Form");
    JLabel lblname2=new JLabel("FollowUp Table");
    JLabel lblfid=new JLabel("FId");
    JLabel lblfdate=new JLabel("Followup Date");
    JLabel lbleqid=new JLabel("Enquiry Id");
    JLabel lbleqdate=new JLabel("Enquiry Date");
    JLabel lbleqfor=new JLabel("Enquired For");
    JLabel lblsname=new JLabel("Student Name");
    JLabel lblcontact=new JLabel("Contact No.");
    JLabel lblemail=new JLabel("Email");
    JLabel lblremark=new JLabel("Remarks");
    JLabel lblstatus=new JLabel("Status");
    String col[]={"FollowUp Id","FollUp Date","Remarks","Status"};
    String fup,fdate,remarks,status;
    Object data[][]={{fup},{fdate},{remarks},{status}};
    DefaultTableModel model=new DefaultTableModel(col,0);
    JTable tbl=new JTable(data,col);
    JScrollPane scrl= new JScrollPane(tbl);
    TableColumnModel cm=tbl.getColumnModel(); 
    JTextField txtfid=new JTextField();
    JTextField txtfdate=new JTextField();
    JTextField txteqid=new JTextField();
    JTextField txteqdate=new JTextField();
    JTextField txtsname=new JTextField();
    JTextField txtremark=new JTextField();
    JTextField txtcontact=new JTextField();
    JTextField txtemail=new JTextField();
    JTextField txteqfor=new JTextField();
    @SuppressWarnings("rawtypes")
    JComboBox cmbstatus=new JComboBox();
    JButton btnnew=new JButton("New");
    JButton btnsave=new JButton("Save");
    JButton btncancel=new JButton("Cancel");
    JTableHeader h=tbl.getTableHeader();
    @SuppressWarnings("unchecked")
    public followupform()
    {
        lblimg.setBounds(29,12,70,70);
        ImageIcon dimg=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/coin_4779353.png").getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(),Image.SCALE_DEFAULT));
       lblimg.setIcon(dimg); 
        setLayout(null);
        setSize(1050,775);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setBackground(new Color(163,42,205));
        getContentPane().setBackground(new Color(252,246,254));
        h.setFont(new Font("Arial",Font.PLAIN,14));
        lblname.setBounds(120,25,700,40);
        lblname.setFont(new Font("Arial",Font.BOLD,23));
        lblname2.setBounds(100,372,600,40);
       lblname2.setFont(new Font("Arial",Font.BOLD,19));
        lblcolor.setBackground(new Color(168,66,203));
        lblcolor.setBounds(0,0,1050,90);
        lblcolor2.setBackground(new Color(168,66,203));  
        lblcolor2.setBounds(0,370,1050,45);
        lblcolor3.setBackground(new Color(168,66,203));  
         lblcolor3.setBounds(0,675,1050,75);
        lblfid.setFont(new Font("Arial",Font.PLAIN,14));
        lblfdate.setFont(new Font("Arial",Font.PLAIN,14));
        lbleqid.setFont(new Font("Arial",Font.PLAIN,14));
        lbleqdate.setFont(new Font("Arial",Font.PLAIN,14));
        lbleqfor.setFont(new Font("Arial",Font.PLAIN,14));
        lblsname.setFont(new Font("Arial",Font.PLAIN,14));
        lblcontact.setFont(new Font("Arial",Font.PLAIN,14));
        lblemail.setFont(new Font("Arial",Font.PLAIN,14));
        lblremark.setFont(new Font("Arial",Font.PLAIN,14));
        lblstatus.setFont(new Font("Arial",Font.PLAIN,14));
        txtcontact.setFont(new Font("Arial",Font.PLAIN,14));
        txtfid.setFont(new Font("Arial",Font.PLAIN,14));
        txtfdate.setFont(new Font("Arial",Font.PLAIN,14));
        txteqid.setFont(new Font("Arial",Font.PLAIN,14));
        txteqdate.setFont(new Font("Arial",Font.PLAIN,14));
        txtsname.setFont(new Font("Arial",Font.PLAIN,14));
        txtremark.setFont(new Font("Arial",Font.PLAIN,14));
        txteqfor.setFont(new Font("Arial",Font.PLAIN,14));
        txtemail.setFont(new Font("Arial",Font.PLAIN,14));
        cmbstatus.setFont(new Font("Arial",Font.PLAIN,14));
        btncancel.setFont(new Font("Arial",Font.PLAIN,14));
        btnsave.setFont(new Font("Arial",Font.PLAIN,14));
        btnnew.setFont(new Font("Arial",Font.PLAIN,14));
        tbl.setFont(new Font("Arial",Font.PLAIN,12));
        lblfid.setBounds(100,110,150,40);
        txtfid.setBounds(250,110,150,40);
        lblfdate.setBounds(500,110,150,40);
        txtfdate.setBounds(650,110,150,40);
        lbleqid.setBounds(100,160,150,40);
        lbleqfor.setBounds(100,210,150,40);
        lblsname.setBounds(100,260,150,40);
        lblemail.setBounds(100,310,150,40);
        txteqid.setBounds(250,160,150,40);
        txteqfor.setBounds(250,210,150,40);
       cmbstatus.setBounds(800,490,150,40);
        add(cmbstatus);
        lblstatus.setBounds(650,490,150,40);
        txtsname.setBounds(250,260,150,40);
        lblremark.setBounds(650,540,150,40);
        txtremark.setBounds(800,540,150,40);
        txtemail.setBounds(250,310,150,40);
        lbleqdate.setBounds(500,160,150,40);
        txteqdate.setBounds(650,160,150,40);
        lblcontact.setBounds(500,260,150,40);
        txtcontact.setBounds(650,260,150,40);
        scrl.setBounds(100,440,500,200);
        btnnew.setBounds(75,692,125,40);
        btnsave.setBounds(220,692,125,40);
        btncancel.setBounds(365,692,125,40);
        tbl.setModel(model);
        cm.getColumn(0).setPreferredWidth(110);
        cm.getColumn(1).setPreferredWidth(130);
        cm.getColumn(2).setPreferredWidth(130);
        cm.getColumn(3).setPreferredWidth(130);
        add(lblname);
        add(lblname2);
        add(lblimg);
        add(lblfid);
        add(lblfdate);
        add(txtfdate);
        add(txtfid);
        add(lbleqid);
        add(lbleqdate);
        add(lblsname);
        add(lblcontact);
        add(lblemail);
        add(txteqid);
        add(txteqdate);
        add(txteqfor);
        add(lbleqfor);
        add(txtsname);
        add(txtcontact);
        add(txtemail);
        add(txteqdate);
        add(btnnew);
        add(btnsave);
        add(btncancel);
        add(scrl);
        add(lblremark);
        add(txtremark);
        add(lblstatus);
        add(lblcolor);
        add(lblcolor2);
      add(lblcolor3);
      lblcolor.setOpaque(true);
      lblcolor2.setOpaque(true);
       lblcolor3.setOpaque(true);
        cmbstatus.addItem("Select");
        btnnew.addActionListener(this);
        btnsave.addActionListener(this);
        btncancel.addActionListener(this);
        txteqid.addFocusListener(this);
        txteqdate.setEditable(false);
        txtfdate.setEditable(false);
        txtfid.setEditable(false);
        txtcontact.setEditable(false);
        txtemail.setEditable(false);
        txteqfor.setEditable(false);
        txtsname.setEditable(false);
        btnsave.setEnabled(false);
        repaint();
    }
    @SuppressWarnings("unchecked")
    public void focusLost(FocusEvent f)
    {
        if(f.getSource()==txteqid)
        {
            int flg=0;
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select * from enquirytbl where eqid='"+txteqid.getText()+"'");
                while(res.next())
                {
                    flg=1;
                    txteqid.setText(res.getString(1));
                    txteqdate.setText(res.getString(2));
                    txteqfor.setText(res.getString(3));
                    txtsname.setText(res.getString(4));
                    txtcontact.setText(res.getString(5));
                    txtemail.setText(res.getString(6));
                }
                if(flg==0)
                {
                     JOptionPane.showMessageDialog(null,"No such id exists");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select * from followuptbl where eqid='"+txteqid.getText()+"'");
                model.setRowCount(0);
                while(res.next())
                {
                    @SuppressWarnings("rawtypes")
                    Vector v=new Vector();
                     v.add(res.getString(1));
                     v.add(res.getString(3));
                     v.add(res.getString(4));
                     v.add(res.getString(5));
                     model.addRow(v);
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
            int t=tbl.getRowCount()-1;
            if(tbl.getValueAt(t,3).toString().equalsIgnoreCase("Cancelled"))
            {
                JOptionPane.showMessageDialog(null,"No further FollowUp can be done");
                btnsave.setEnabled(false);
            }
            if(tbl.getValueAt(t,3).toString().equalsIgnoreCase("Completed"))
            {
                JOptionPane.showMessageDialog(null,"No further FollowUp is required");
                btnsave.setEnabled(false);
            }
        }
    }
    public void focusGained(FocusEvent f)
    {

    }
    @SuppressWarnings("unchecked")
    public void actionPerformed(ActionEvent a)
    { 
        if(a.getSource()==btnsave)
        {
            try{
                if(txteqid.getText().length()!=0 && txtremark.getText().length()!=0 && ! cmbstatus.getSelectedItem().toString().equalsIgnoreCase("Select"))
                {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                String str="insert into followuptbl(fid,eqid,fdate,remarks,status) values(?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(str);
                ps.setString(1,txtfid.getText());
                ps.setString(2,txteqid.getText());
                ps.setString(3,txtfdate.getText());
                ps.setString(4,txtremark.getText());
                ps.setString(5,""+cmbstatus.getSelectedItem());
                ps.executeUpdate();
                Statement st=con.createStatement();
                st.executeUpdate("update followupkeytbl set fid=fid+1");
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
            txtfdate.setText(strdt);
            btnsave.setEnabled(true);
            txtsname.setText("");
            txtcontact.setText("");
            txtemail.setText("");
            txteqid.setText("");
            txteqfor.setText("");
            txtremark.setText("");
            txteqdate.setText("");
            model.setRowCount(0);
            cmbstatus.removeAllItems();
            cmbstatus.addItem("Select");
            cmbstatus.addItem("Pending");
            cmbstatus.addItem("Cancelled");
            cmbstatus.addItem("Completed");
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select fid from followupkeytbl");
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
        if(a.getSource()==btncancel)
        {
            this.dispose();
        }
    }
    public static void main(String[] args) {
        new followupform();
    }
}