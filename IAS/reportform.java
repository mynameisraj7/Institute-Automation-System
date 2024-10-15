import java.awt.event.*;
import java.io.PrintWriter;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.util.Vector;
import java.sql.*;
import java.awt.*;
public class reportform extends JFrame implements ActionListener,FocusListener
{
    JLabel lblstart=new JLabel("Start Date");
    JLabel lblend=new JLabel("End Date");
    JTextField txtstart=new JTextField();
    JTextField txtend=new JTextField();
    String col[]={"Student Id","Student Name","Paymentdate","Paying Amount"};
    String Sid,Sname,Pdate,PayingAmt;
    Object data[][]={{Sid},{Sname},{Pdate},{PayingAmt}};
    DefaultTableModel model=new DefaultTableModel(col,0);
    JTable tbl=new JTable(data,col);
    JScrollPane scrl= new JScrollPane(tbl);
    TableColumnModel cm=tbl.getColumnModel(); 
    JButton btnprint=new JButton("Print");
    public reportform()
    {
        setLayout(null);
        setSize(900,440);
        setLocationRelativeTo(null);
        setVisible(true);
        // setResizable(false);
        setBackground(new Color(163,42,205));
        getContentPane().setBackground(new Color(252,246,254));
        lblstart.setFont(new Font("Arial",Font.PLAIN,14));
        txtstart.setFont(new Font("Arial",Font.PLAIN,14));
        lblstart.setBounds(100,100,150,40);
        txtstart.setBounds(250,100,150,40);
        txtend.setFont(new Font("Arial",Font.PLAIN,14));
        lblend.setFont(new Font("Arial",Font.PLAIN,14));
        lblend.setBounds(500,100,150,40);
        txtend.setBounds(650,100,150,40);
        scrl.setBounds(100,150,500,200);
        btnprint.setBounds(720,200,100,40);
        tbl.setModel(model);
        cm.getColumn(0).setPreferredWidth(80);
        cm.getColumn(1).setPreferredWidth(140);
        cm.getColumn(2).setPreferredWidth(140);
        cm.getColumn(3).setPreferredWidth(140);
        add(lblend);
        add(lblstart);
        add(txtstart);
        add(txtend);
        add(scrl);
        add(btnprint);
        txtend.addFocusListener(this);
        btnprint.addActionListener(this);
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
            ResultSet res=st.executeQuery("select * from paymenttbl where pdate between '"+txtstart.getText()+"' and '"+txtend.getText()+"'");
            PrintWriter pw=new PrintWriter("payment.pages");
            pw.println("Payment Report Form"+txtstart.getText()+"to"+txtend.getText());
            pw.println("-------------------------------------------------------------");
            pw.println("Student Id\tStudent Name\tPayment Date\tPaying Amount");
            model.setRowCount(0);
            while(res.next())
            {
                @SuppressWarnings("rawtypes")
                Vector v=new Vector();
                 v.add(res.getString(1));
                 v.add(res.getString(2));
                 v.add(res.getString(5));
                 v.add(res.getString(7));
                 model.addRow(v);
                 pw.println(res.getString(1));
                 pw.println(res.getString(2));
                 pw.println(res.getString(5));
                 pw.println(res.getString(7));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
   }
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource()==btnprint)
    {
        try{
            /*Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
            Statement st=con.createStatement();
            ResultSet res=st.executeQuery("select * from paymenttbl where pdate between '"+txtstart.getText()+"' and '"+txtend.getText()+"'");
            PrintWriter pw=new PrintWriter("payment_report.txt");
            pw.println("Payment Report Form"+txtstart.getText()+"to"+txtend.getText());
            pw.println("-------------------------------------------------------------");
            pw.println("Student Id\tStudent Name\tPayment Date\tPaying Amount");
            while(res.next())
            {
                 pw.println(res.getString(1));
                 pw.println(res.getString(2));
                 pw.println(res.getString(5));
                 pw.println(res.getString(7));
            }
            pw.close();*/
         //  System.out.println("1212121212");
          // Runtime rt=Runtime.getRuntime();
          // rt.exec("open Pages"); 
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        try{
            String[] s={"/Applications/Pages.app","/Documents/pay.pages"};
            Runtime rt= Runtime.getRuntime();
            Process p=null;
            p=rt.exec(s);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    }
    public static void main(String[] args) {
        new reportform();
    }
}