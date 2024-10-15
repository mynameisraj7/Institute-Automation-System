import java.awt.event.*;
import java.io.PrintWriter;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import java.util.Vector;
import java.sql.*;
import java.awt.*;
public class facultyreportform extends JFrame implements ActionListener,FocusListener
{
    JLabel lblcolor =new JLabel();
    JLabel lblcolor2 =new JLabel();
    JLabel lblimg = new JLabel();
    JLabel lblname=new JLabel("Faculty Report Form");
    JLabel lblname2=new JLabel("Faculty Table");
    JLabel lblstart=new JLabel("Start Date");
    JLabel lblend=new JLabel("End Date");
    JTextField txtstart=new JTextField();
    JTextField txtend=new JTextField();
    String col[]={"Faculty Id","Faculty Name","Date","Attendance"};
    String Sid,Sname,Pdate,PayingAmt;
    Object data[][]={{Sid},{Sname},{Pdate},{PayingAmt}};
    DefaultTableModel model=new DefaultTableModel(col,0);
    JTable tbl=new JTable(data,col);
    JScrollPane scrl= new JScrollPane(tbl);
    TableColumnModel cm=tbl.getColumnModel(); 
    JButton btnprint=new JButton("Print");
    JButton btncancel=new JButton("Cancel");
    JTableHeader h=tbl.getTableHeader();
    public facultyreportform()
    {
        lblimg.setBounds(29,12,70,70);
        ImageIcon dimg=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/coin_4779353.png").getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(),Image.SCALE_DEFAULT));
       lblimg.setIcon(dimg); 
        setLayout(null);
        setSize(900,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setBackground(new Color(163,42,205));
        getContentPane().setBackground(new Color(252,246,254));
        h.setFont(new Font("Arial",Font.PLAIN,14));
        lblname.setBounds(120,25,700,40);
        lblname.setFont(new Font("Arial",Font.BOLD,23));
        lblname2.setBounds(100,167,600,40);
       lblname2.setFont(new Font("Arial",Font.BOLD,19));
        lblcolor.setBackground(new Color(168,66,203));
        lblcolor.setBounds(0,0,1050,90);
        lblcolor2.setBackground(new Color(168,66,203));  
        lblcolor2.setBounds(0,165,1050,45);
        lblstart.setFont(new Font("Arial",Font.PLAIN,14));
        txtstart.setFont(new Font("Arial",Font.PLAIN,14));
        lblstart.setBounds(100,110,150,40);
        txtstart.setBounds(250,110,150,40);
        txtend.setFont(new Font("Arial",Font.PLAIN,14));
        lblend.setFont(new Font("Arial",Font.PLAIN,14));
        lblend.setBounds(500,110,150,40);
        txtend.setBounds(650,110,150,40);
        scrl.setBounds(100,240,500,200);
        btnprint.setBounds(690,280,100,40);
        btncancel.setBounds(690,330,100,40);
        tbl.setModel(model);
        cm.getColumn(0).setPreferredWidth(80);
        cm.getColumn(1).setPreferredWidth(140);
        cm.getColumn(2).setPreferredWidth(140);
        cm.getColumn(3).setPreferredWidth(140);
        add(lblname);
        add(lblname2);
        add(lblimg);
        add(lblend);
        add(lblstart);
        add(txtstart);
        add(txtend);
        add(scrl);
        add(btnprint);
        add(btncancel);
        add(lblcolor);
        add(lblcolor2);
        lblcolor.setOpaque(true);
        lblcolor2.setOpaque(true);
        txtend.addFocusListener(this);
        btnprint.addActionListener(this);
        btncancel.addActionListener(this);
    }
public void focusGained(FocusEvent f)
{

}
@SuppressWarnings("unchecked")
public void focusLost(FocusEvent f)
{
    if(f.getSource()==txtend)
    {
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
            Statement st=con.createStatement();
            ResultSet res=st.executeQuery("select * from facultyattendancetbl where date between '"+txtstart.getText()+"' and '"+txtend.getText()+"'");
            @SuppressWarnings("resource")
            PrintWriter pw=new PrintWriter("payment.pages");
            pw.println("Payment Report Form"+txtstart.getText()+"to"+txtend.getText());
            pw.println("-------------------------------------------------------------");
            pw.println("Student Id\tStudent Name\tPayment Date\tPaying Amount");
            model.setRowCount(0);
            while(res.next())
            {
                @SuppressWarnings("rawtypes")
                Vector v=new Vector();
                 v.add(res.getString(2));
                 v.add(res.getString(1));
                 v.add(res.getString(3));
                 v.add(res.getString(4));
                 model.addRow(v);
                 pw.println(res.getString(2));
                 pw.println(res.getString(1));
                 pw.println(res.getString(3));
                 pw.println(res.getString(4));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
   }
    @SuppressWarnings("deprecation")
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource()==btnprint)
    {
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
            Statement st=con.createStatement();
            ResultSet res=st.executeQuery("select * from facultyattendancetbl where date between '"+txtstart.getText()+"' and '"+txtend.getText()+"'");
            PrintWriter pw=new PrintWriter("faculty_report.txt");
            pw.println("Payment Report Form"+txtstart.getText()+"to"+txtend.getText());
            pw.println("-------------------------------------------------------------");
            pw.println("Student Id\tStudent Name\tPayment Date\tPaying Amount");
            while(res.next())
            {
                 pw.print(res.getString(2));
                 pw.print(res.getString(1));
                 pw.print(res.getString(3));
                 pw.println(res.getString(4));
            }
            pw.close();
            Runtime rt=Runtime.getRuntime();
            rt.exec("open -a Pages.app"); 
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    if(a.getSource()==btncancel)
    {
        this.dispose();
    }
    }
    public static void main(String[] args) {
        new facultyreportform();
    }
}
