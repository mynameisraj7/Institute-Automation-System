import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.awt.*;
public class attendanceform extends JFrame implements ActionListener,KeyListener,FocusListener
{
    JLabel lblcolor =new JLabel();
    JLabel lblcolor2 =new JLabel();
    JLabel lblcolor3 =new JLabel();
    JLabel lblimg = new JLabel();
    JLabel lblname=new JLabel("Attendance Form");
    JLabel lblname2=new JLabel("Attendance Table");
    Date first;
    JLabel lblstart=new JLabel("Start Date");
    JTextField txtstart=new JTextField();
    JLabel lblbid=new JLabel("Batch id");
    @SuppressWarnings("rawtypes")
    JComboBox cmbbid=new JComboBox();
    String col[]={"S_No","Name","Student Id","Attendance"};
    String S_No,Name,Stu_id,Attendance;
    Object data[][]={{S_No}};
    Object data1[][]={{Name}};
    Object data2[][]={{Stu_id}};
    Object data3[][]={{Attendance}};
    DefaultTableModel model=new DefaultTableModel(col,0);
    JTable tbl=new JTable(data,col);
    JScrollPane scrl= new JScrollPane(tbl); 
    JButton btnnew= new JButton("New");
    JButton btnab= new JButton("Absent");
    JButton btnp= new JButton("Present");
    JButton btnsave= new JButton("Save");
    JButton btncancel= new JButton("Cancel");
    TableColumnModel cm=tbl.getColumnModel();
    JTableHeader h=tbl.getTableHeader();
    @SuppressWarnings("unchecked")
    public attendanceform()
    {
        lblimg.setBounds(29,12,70,70);
        ImageIcon dimg=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/coin_4779353.png").getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(),Image.SCALE_DEFAULT));
        lblimg.setIcon(dimg); 
        h.setFont(new Font("Arial",Font.PLAIN,13));
        setLayout(null);
        setSize(1075,585);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setBackground(new Color(163,42,205));
        getContentPane().setBackground(new Color(252,246,254));
        lblname.setBounds(120,25,700,40);
        lblname2.setBounds(100,167,600,40);
        lblname2.setFont(new Font("Arial",Font.BOLD,19));
       lblcolor.setBackground(new Color(168,66,203));
        lblcolor.setBounds(0,0,1075,90);
        lblcolor2.setBackground(new Color(168,66,203));  
        lblcolor2.setBounds(0,165,1075,45);
        lblcolor3.setBackground(new Color(168,66,203));  
        lblcolor3.setBounds(0,485,1075,75);
        lblname.setFont(new Font("Arial",Font.BOLD,23));
        lblstart.setFont(new Font("Arial",Font.PLAIN,14));
        lblbid.setFont(new Font("Arial",Font.PLAIN,14));
        txtstart.setFont(new Font("Arial",Font.PLAIN,14));
        cmbbid.setFont(new Font("Arial",Font.PLAIN,14));
        btncancel.setFont(new Font("Arial",Font.PLAIN,14));
        btnnew.setFont(new Font("Arial",Font.PLAIN,14));
        btnsave.setFont(new Font("Arial",Font.PLAIN,14));
        tbl.setFont(new Font("Arial",Font.PLAIN,12));
        scrl.setBounds(100,250,700,200);
        lblbid.setBounds(100,110,150,40);
        cmbbid.setBounds(250,110,150,40);
        lblstart.setBounds(500,110,150,40);
        txtstart.setBounds(650,110,150,40);
        btnnew.setBounds(75,505,135,40);
        btnsave.setBounds(230,505,135,40);
        btncancel.setBounds(385,505,135,40);
        btnab.setBounds(850,310,120,40);
        btnp.setBounds(850,360,120,40);
        tbl.setModel(model);
        cm.getColumn(0).setPreferredWidth(70);
        cm.getColumn(1).setPreferredWidth(210);
        cm.getColumn(2).setPreferredWidth(210);
        cm.getColumn(3).setPreferredWidth(210);
        add(lblname);
        add(lblname2);
        add(lblimg);
        add(lblstart);
        add(txtstart);
        add(lblbid);
        add(cmbbid);
        add(lblstart);
        add(scrl);
        add(btnnew);
        add(btnab);
        add(btnp);
        add(btnsave);
        add(btncancel);
        add(lblcolor);
        add(lblcolor2);
        add(lblcolor3);
        lblcolor.setOpaque(true);
        lblcolor2.setOpaque(true);
        lblcolor3.setOpaque(true);
        cmbbid.addItem("Select");
        tbl.setRowHeight(30);
        cmbbid.addActionListener(this);
        txtstart.addFocusListener(this);
        btnnew.addActionListener(this);
        btnab.addActionListener(this);
        btnp.addActionListener(this);
        btnsave.addActionListener(this);
        btncancel.addActionListener(this);
        txtstart.addKeyListener(this);
        btnsave.setEnabled(false);
    }
    public void focusGained(FocusEvent f)
    {

    }
    @SuppressWarnings("unchecked")
    public void focusLost(FocusEvent f)
    {
        if(f.getSource()==txtstart)
        {
            try{
                SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
                Date dt1=new Date();
                String strdt=sdf.format(dt1);
                Date first=sdf.parse(strdt);
                Date second=sdf.parse(txtstart.getText());
                long diffmill=(second.getTime()-first.getTime());
                long d=diffmill/(1000*24*60*60);
                if(d>0)
                {
                    JOptionPane.showMessageDialog(null,"Enter correct date");
                    txtstart.setEnabled(false);
                    btnsave.setEnabled(false);
                }
                }
                catch(Exception ee)
                {
                    System.out.println(ee);
                }
        }
        if(f.getSource()==txtstart)
        {
            int i=1;
            try
            {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select * from attendancetbl where date='"+txtstart.getText()+"' and bid='"+cmbbid.getSelectedItem()+"'");
                model.setRowCount(0);
                while(res.next())
                {
                    @SuppressWarnings("rawtypes")
                    Vector v=new Vector();
                     v.add(i);
                     v.add(res.getString(1));
                     v.add(res.getString(2));
                     v.add(res.getString(5));
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
    public void keyPressed(KeyEvent f)
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
        if(a.getSource()==btnab)
        {
            tbl.setValueAt("Absent",tbl.getSelectedRow(),3);
        }
        if(a.getSource()==btnp)
        {
            tbl.setValueAt("Present",tbl.getSelectedRow(),3);
        }
        if(a.getSource()==cmbbid)
        {
            int i=1;
            int aflg=0;
            try
            {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select * from attendancetbl where date='"+txtstart.getText()+"' and bid='"+cmbbid.getSelectedItem()+"'");
                model.setRowCount(0);
                while(res.next())
                {
                    @SuppressWarnings("rawtypes")
                    Vector v=new Vector();
                     v.add(i);
                     v.add(res.getString(1));
                     v.add(res.getString(2));
                     v.add(res.getString(5));
                     model.addRow(v);
                     i++;
                     aflg=1;
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            try{
                if(aflg==0)
                {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select * from enrollmenttbl where batchid='"+cmbbid.getSelectedItem()+"'");
                model.setRowCount(0);
                while(res.next())
                {
                    @SuppressWarnings("rawtypes")
                    Vector v=new Vector();
                     v.add(i);
                     v.add(res.getString(3));
                     v.add(res.getString(1));
                     v.add("Present");
                     model.addRow(v);
                     i++;
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
        Date dt1=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
        String strdt=sdf.format(dt1);
        txtstart.setText(strdt);
        model.setRowCount(0);
        btnsave.setEnabled(true);
        txtstart.setEnabled(true);
        cmbbid.removeAllItems();
        cmbbid.setSelectedItem("Select");
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
        }
        if(a.getSource()==btnsave)
        {
            try
            {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select * from attendancetbl where date='"+txtstart.getText()+"' and bid='"+cmbbid.getSelectedItem()+"'");
                while(res.next())
                {
                    st.executeUpdate("delete from attendancetbl where bid='"+cmbbid.getSelectedItem()+"' and date='"+txtstart.getText()+"'");
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            try{
                if(! cmbbid.getSelectedItem().toString().equalsIgnoreCase("Select") && tbl.getRowCount()!=0)
                {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                String str="insert into attendancetbl(sname,sid,bid,date,attendance) values(?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(str);
                for(int i=0;i<tbl.getRowCount();i++)
                {
                    ps.setString(1,""+tbl.getValueAt(i,1));
                    ps.setString(2,""+tbl.getValueAt(i,2));
                    ps.setString(3,""+cmbbid.getSelectedItem());
                    ps.setString(4,txtstart.getText());
                    ps.setString(5,""+tbl.getValueAt(i,3));
                    ps.executeUpdate();
                }
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
            new attendanceform();
    }
}