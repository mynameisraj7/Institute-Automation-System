import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class menuform extends JFrame implements ActionListener,MouseListener,MouseMotionListener
{
    int c=0,k=0;
    JLabel lblcolor =new JLabel();
    JLabel lblcolor2 =new JLabel();
    JLabel lblcolor3 =new JLabel();
    JLabel lblcolor4 =new JLabel();
    JLabel lblcolor5 =new JLabel();
    JLabel lblcolor6 =new JLabel();
    JLabel lblcolor7 =new JLabel();
    JLabel lblcolor8 =new JLabel();
    JLabel lblcolor9 =new JLabel();
    JLabel lblcolor10 =new JLabel();
    JLabel lblimg = new JLabel();
    JLabel lblimg2 = new JLabel();
    JLabel lblimg3 = new JLabel();
    JLabel lblimg4 = new JLabel();
    JLabel lblimg5 = new JLabel();
    JLabel lblimg6 = new JLabel();
    JLabel lblimg7 = new JLabel();
    JLabel lblimg8 = new JLabel();
    JLabel lblimg9= new JLabel();
    JLabel lblimg10= new JLabel();
    JLabel lblimg11= new JLabel();
    JLabel lblimg12= new JLabel();
    JLabel lblimg13= new JLabel();
    JLabel lblimg14= new JLabel();
    JLabel lblimg15= new JLabel();
    JLabel lblimg16= new JLabel();
    JLabel lblimg17= new JLabel();
    JLabel lblimg18= new JLabel();
    JLabel lblimg19= new JLabel();
    JLabel lblimg20= new JLabel();
    JLabel lblname=new JLabel("Institute Dashboard");
    JLabel lblname2=new JLabel("Aditya");
    JLabel lblname3=new JLabel("Master");
    JLabel lblname4=new JLabel("Payments");
    JLabel lblname5=new JLabel("Report");
    JLabel lblname6=new JLabel("Courses");
    JLabel lblname7=new JLabel("Exit");
    JLabel lblname8=new JLabel("Enquiry");
    JLabel lblname9=new JLabel("Follow Up");
    JLabel lblname10=new JLabel("Admission");
    JLabel lblname11=new JLabel("Attendance");
    JLabel lblname12=new JLabel("Fee");
    JLabel lblname13=new JLabel("   Batch");
    JLabel lblname14=new JLabel("   Course");
    JLabel lblname15=new JLabel("   Student");
    JLabel lblname16=new JLabel("   Faculty");
    JLabel lblname17=new JLabel("   Batch Change");
    JLabel lblname18=new JLabel("   TOTAL COURSES");
    JLabel lblname19=new JLabel("   TOTAL BATCHES");
    JLabel lblname20=new JLabel("   TOTAL FOLLOWUP");
    JLabel lblname21=new JLabel("   TOTAL STUDENTS");
    JLabel lblname22=new JLabel("   TOTAL ENQUIRYS");
    JLabel lblname23=new JLabel("   TOTAL FACULTY");
    JLabel lblname24=new JLabel("0");
    JLabel lblname25=new JLabel("0");
    JLabel lblname26=new JLabel("0");
    JLabel lblname27=new JLabel("0");
    JLabel lblname28=new JLabel("0");
    JLabel lblname29=new JLabel("0");
    JLabel lblname30=new JLabel("   Payment Report");
    JLabel lblname31=new JLabel("   Faculty Report");
    JLabel lblname32=new JLabel("   Student Report");
    JTextArea txttext=new JTextArea("Institute Automation System is a large system which can be \nused for maanaging an institute information electronically \nincluding information of the student, faculties etc.\n\nMost important this information can be easily shared with authorised user.\nRecords can be easily searched and reports can be \neasily generated.");
    JMenuBar mb=new JMenuBar();
    JMenu mnumast=new JMenu("Master");
    JMenu mnutra=new JMenu("Transaction");
    JMenu mnurep=new JMenu("Report");
    JMenu mnuexit=new JMenu("Exit");
    JMenuItem mnumastbatch=new JMenuItem("Batch");
    JMenuItem mnumastcourse=new JMenuItem("Course");
    JMenuItem mnumaststud=new JMenuItem("Student");
    JMenuItem mnumastfact=new JMenuItem("Faculty");
    JMenuItem mnutrafee=new JMenuItem("Fee");
    JMenuItem mnutrabchange=new JMenuItem("Batch Change");
    JMenuItem mnutraatt=new JMenuItem("Attendance");
    JMenuItem mnurepreport=new JMenuItem("Report");
    public menuform()
    {
        Toolkit tk= Toolkit.getDefaultToolkit();
        int x=((int) tk.getScreenSize().getWidth());
        int y=((int) tk.getScreenSize().getHeight());
        setLayout(null);
        setSize(x,y);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        lblcolor.setBackground(new Color(168,66,203));
        lblcolor.setBounds(0,0,210,y);
        lblcolor2.setBackground(new Color(168,66,203));  
        lblcolor2.setBounds(1270,0,200,y);
        lblcolor3.setBackground(new Color(215, 189, 226));  
        lblcolor3.setBounds(210,0,1060,80);
        lblcolor4.setBackground(new Color(215, 189, 226));  
        lblcolor4.setBounds(710,150,510,260);
        lblcolor5.setBackground(new Color(250, 225, 180));  
        lblcolor5.setBounds(290,500,275,150);
        lblcolor6.setBackground(new Color(225, 143, 79));  
        lblcolor6.setBounds(600,500,275,150);
        lblcolor7.setBackground(new Color(144, 206, 74));  
        lblcolor7.setBounds(908,500,275,150);
        lblcolor8.setBackground(new Color(174, 85, 77));  
        lblcolor8.setBounds(908,690,275,150);
        lblcolor9.setBackground(new Color(39, 146, 235));  
        lblcolor9.setBounds(290,690,275,150);
        lblcolor10.setBackground(new Color(235, 39, 102));  
        lblcolor10.setBounds(600,690,275,150);
        lblimg.setBounds(585,12,55,55);
        ImageIcon dimg=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/univeristy_4902100.png").getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(),Image.SCALE_DEFAULT));
       lblimg.setIcon(dimg); 
       lblimg2.setBounds(67,30,55,55);
       ImageIcon dimg2=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/user_1077012.png").getImage().getScaledInstance(lblimg2.getWidth(),lblimg2.getHeight(),Image.SCALE_DEFAULT));
      lblimg2.setIcon(dimg2); 
      lblimg3.setBounds(1325,28,80,80);
      ImageIcon dimg3=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/coin_4779353.png").getImage().getScaledInstance(lblimg3.getWidth(),lblimg3.getHeight(),Image.SCALE_DEFAULT));
     lblimg3.setIcon(dimg3); 
     lblimg4.setBounds(67,156,70,70);
       ImageIcon dimg4=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/online-survey_6728483.png").getImage().getScaledInstance(lblimg4.getWidth(),lblimg4.getHeight(),Image.SCALE_DEFAULT));
      lblimg4.setIcon(dimg4); 
      lblimg5.setBounds(58,306,70,70);
      ImageIcon dimg5=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/mobile_12983361.png").getImage().getScaledInstance(lblimg5.getWidth(),lblimg5.getHeight(),Image.SCALE_DEFAULT));
     lblimg5.setIcon(dimg5); 
     lblimg6.setBounds(67,456,70,70);
      ImageIcon dimg6=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/report_11176291.png").getImage().getScaledInstance(lblimg6.getWidth(),lblimg6.getHeight(),Image.SCALE_DEFAULT));
     lblimg6.setIcon(dimg6); 
     lblimg7.setBounds(64,600,70,70);
     ImageIcon dimg7=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/online-learning_2997255.png").getImage().getScaledInstance(lblimg7.getWidth(),lblimg7.getHeight(),Image.SCALE_DEFAULT));
     lblimg7.setIcon(dimg7); 
     lblimg8.setBounds(64,730,70,70);
      ImageIcon dimg8=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/exit_15340094.png").getImage().getScaledInstance(lblimg8.getWidth(),lblimg8.getHeight(),Image.SCALE_DEFAULT));
     lblimg8.setIcon(dimg8); 
     lblimg9.setBounds(1321,156,70,70);
     ImageIcon dimg9=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/research_12236855.png").getImage().getScaledInstance(lblimg9.getWidth(),lblimg9.getHeight(),Image.SCALE_DEFAULT));
     lblimg9.setIcon(dimg9); 
     lblimg10.setBounds(1328,300,79,79);
     ImageIcon dimg10=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/follow_15356742.png").getImage().getScaledInstance(lblimg10.getWidth(),lblimg10.getHeight(),Image.SCALE_DEFAULT));
     lblimg10.setIcon(dimg10); 
    lblimg11.setBounds(1328,456,74,74);
     ImageIcon dimg11=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/agreement_8427598.png").getImage().getScaledInstance(lblimg11.getWidth(),lblimg11.getHeight(),Image.SCALE_DEFAULT));
      lblimg11.setIcon(dimg11); 
      lblimg12.setBounds(260,150,450,260);
      ImageIcon dimg12=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/1*fb6BV_SDkh6nL2HuYg_duA.jpg").getImage().getScaledInstance(lblimg12.getWidth(),lblimg12.getHeight(),Image.SCALE_DEFAULT));
       lblimg12.setIcon(dimg12); 
       lblimg13.setBounds(1328,592,79,79);
       ImageIcon dimg13=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/relationship_17394499.png").getImage().getScaledInstance(lblimg13.getWidth(),lblimg13.getHeight(),Image.SCALE_DEFAULT));
        lblimg13.setIcon(dimg13); 
        lblimg14.setBounds(1339,730,79,79);
        ImageIcon dimg14=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/pay_625599.png").getImage().getScaledInstance(lblimg14.getWidth(),lblimg14.getHeight(),Image.SCALE_DEFAULT));
         lblimg14.setIcon(dimg14); 
         lblimg15.setBounds(330,536,60,60);
         ImageIcon dimg15=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/graduation-hat_589898.png").getImage().getScaledInstance(lblimg15.getWidth(),lblimg15.getHeight(),Image.SCALE_DEFAULT));
          lblimg15.setIcon(dimg15); 
          lblimg16.setBounds(645,536,60,60);
          ImageIcon dimg16=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/database_2103508.png").getImage().getScaledInstance(lblimg16.getWidth(),lblimg16.getHeight(),Image.SCALE_DEFAULT));
           lblimg16.setIcon(dimg16); 
           lblimg17.setBounds(945,536,60,60);
           ImageIcon dimg17=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/user_6639614.png").getImage().getScaledInstance(lblimg17.getWidth(),lblimg17.getHeight(),Image.SCALE_DEFAULT));
            lblimg17.setIcon(dimg17); 
            lblimg18.setBounds(330,726,60,60);
           ImageIcon dimg18=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/hat_11499806.png").getImage().getScaledInstance(lblimg18.getWidth(),lblimg18.getHeight(),Image.SCALE_DEFAULT));
            lblimg18.setIcon(dimg18); 
            lblimg19.setBounds(645,728,55,55);
            ImageIcon dimg19=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/document_1541972.png").getImage().getScaledInstance(lblimg19.getWidth(),lblimg19.getHeight(),Image.SCALE_DEFAULT));
             lblimg19.setIcon(dimg19); 
             lblimg20.setBounds(945,726,60,60);
             ImageIcon dimg20=new ImageIcon( new ImageIcon("/Users/Aditya/Downloads/loss_17069122.png").getImage().getScaledInstance(lblimg20.getWidth(),lblimg20.getHeight(),Image.SCALE_DEFAULT));
              lblimg20.setIcon(dimg20); 
       lblname.setBounds(665,25,700,40);
       lblname.setFont(new Font("Arial",Font.BOLD,24));
       lblname2.setBounds(64,88,200,40);
       lblname2.setFont(new Font("Arial",Font.BOLD,19));
       lblname3.setBounds(64,230,200,40);
       lblname3.setFont(new Font("Arial",Font.BOLD,19));
      lblname4.setBounds(50,380,200,40);
       lblname4.setFont(new Font("Arial",Font.BOLD,19));
       lblname5.setBounds(64,528,200,40);
       lblname5.setFont(new Font("Arial",Font.BOLD,19));
       lblname6.setBounds(60,666,200,40);
       lblname6.setFont(new Font("Arial",Font.BOLD,19));
       lblname7.setBounds(79,804,700,40);
       lblname7.setFont(new Font("Arial",Font.BOLD,19));
       lblname8.setBounds(1329,230,700,40);
       lblname8.setFont(new Font("Arial",Font.BOLD,19));
       lblname9.setBounds(1324,380,700,40);
       lblname9.setFont(new Font("Arial",Font.BOLD,19));
       lblname10.setBounds(1324,534,700,40);
       lblname10.setFont(new Font("Arial",Font.BOLD,19));
       lblname11.setBounds(1320,666,700,40);
       lblname11.setFont(new Font("Arial",Font.BOLD,19));
       lblname12.setBounds(1354,806,700,40);
       lblname12.setFont(new Font("Arial",Font.BOLD,19));
       lblname13.setBounds(185,150,160,40);
       lblname13.setFont(new Font("Arial",Font.BOLD,19));
       lblname13.setBackground(new Color(0, 0, 0)); 
       lblname13.setForeground(new Color(255,255,255));
       lblname14.setBounds(185,190,160,40);
       lblname14.setFont(new Font("Arial",Font.BOLD,19));
       lblname14.setBackground(new Color(0, 0, 0)); 
       lblname14.setForeground(new Color(255,255,255));
       lblname15.setBounds(185,230,160,40);
       lblname15.setFont(new Font("Arial",Font.BOLD,19));
       lblname15.setBackground(new Color(0, 0, 0)); 
       lblname15.setForeground(new Color(255,255,255));
       lblname16.setBounds(185,270,160,40);
       lblname16.setFont(new Font("Arial",Font.BOLD,19));
       lblname16.setBackground(new Color(0, 0, 0)); 
       lblname16.setForeground(new Color(255,255,255));
       lblname17.setBounds(185,310,160,40);
       lblname17.setFont(new Font("Arial",Font.BOLD,19));
       lblname17.setBackground(new Color(0, 0, 0)); 
       lblname17.setForeground(new Color(255,255,255));
       lblname18.setFont(new Font("Arial",Font.BOLD,18));
       lblname18.setBounds(295,602,190,40);
       lblname19.setFont(new Font("Arial",Font.BOLD,18));
       lblname19.setBounds(604,602,180,40);
       lblname20.setFont(new Font("Arial",Font.BOLD,17));
       lblname20.setBounds(904,602,200,40);
       lblname22.setFont(new Font("Arial",Font.BOLD,18));
       lblname22.setBounds(604,795,180,40);
       lblname23.setFont(new Font("Arial",Font.BOLD,17));
       lblname23.setBounds(910,795,200,40);
       lblname24.setFont(new Font("Arial",Font.BOLD,31));
       lblname24.setBounds(485,560,80,30);
       lblname25.setFont(new Font("Arial",Font.BOLD,31));
       lblname25.setBounds(800,560,80,30);
       lblname26.setFont(new Font("Arial",Font.BOLD,31));
       lblname26.setBounds(1100,560,80,30);
       txttext.setBounds(724,210,425,160);
       lblname27.setFont(new Font("Arial",Font.BOLD,31));
       lblname27.setBounds(485,746,80,30);
       lblname28.setFont(new Font("Arial",Font.BOLD,31));
       lblname28.setBounds(800,746,80,30);
       lblname29.setFont(new Font("Arial",Font.BOLD,31));
       lblname29.setBounds(1097,746,80,30);
       txttext.setFont(new Font("Arial",Font.BOLD,17)); 
       lblname21.setFont(new Font("Arial",Font.BOLD,18));
       lblname21.setBounds(295,795,190,40);
       txttext.setBackground(new Color(215, 189, 226)); 
       lblname30.setBounds(185,450,200,40);
       lblname30.setFont(new Font("Arial",Font.BOLD,19));
       lblname30.setBackground(new Color(0, 0, 0)); 
       lblname30.setForeground(new Color(255,255,255));
       lblname31.setBounds(185,490,200,40);
       lblname31.setFont(new Font("Arial",Font.BOLD,19));
       lblname31.setBackground(new Color(0, 0, 0)); 
       lblname31.setForeground(new Color(255,255,255));
       lblname32.setBounds(185,530,200,40);
       lblname32.setFont(new Font("Arial",Font.BOLD,19));
       lblname32.setBackground(new Color(0, 0, 0)); 
       lblname32.setForeground(new Color(255,255,255));
        mb.add(mnumast);
        mb.add(mnutra);
        mb.add(mnurep);
        mb.add(mnuexit);
        this.setJMenuBar(mb);
        add(lblname13);
        add(lblname14);
        add(lblname15);
        add(lblname16);
        add(lblname17);
        add(lblname30);
        add(lblname31);
        add(lblname32);
        add(lblimg);
        add(lblimg2);
        add(lblimg3);
        add(lblimg4);
        add(lblimg5);
        add(lblimg6);
        add(lblimg7);
        add(lblimg8);
        add(lblimg9);
        add(lblimg10);
        add(lblimg11);
        add(lblimg12);
        add(lblimg13);
        add(lblimg14);
        add(lblimg15);
        add(lblimg16);
        add(lblimg17);
        add(lblimg18);
        add(lblimg19);
        add(lblimg20);
        add(lblname);
        add(lblname2);
        add(lblname3);
        add(lblname4);
        add(lblname5);
        add(lblname6);
        add(lblname7);
        add(lblname8);
        add(lblname9);
        add(lblname10);
        add(txttext);
        add(lblname11);
        add(lblname12);
        add(lblname18);
        add(lblname19);
        add(lblname20);
        add(lblname21);
        add(lblname22);
        add(lblname23);
        add(lblname24);
        add(lblname25);
        add(lblname26);
        add(lblname27);
        add(lblname28);
        add(lblname29);
        mnumast.add(mnumastbatch);
        mnumast.add(mnumastcourse);
        mnumast.add(mnumaststud);
        mnumast.add(mnumastfact);
        mnutra.add(mnutrafee);
        mnutra.add(mnutrabchange);
        mnutra.add(mnutraatt);
        mnurep.add(mnurepreport);
        add(lblcolor);
        add(lblcolor2);
        add(lblcolor3);
        add(lblcolor4);
        add(lblcolor5);
        add(lblcolor6);
        add(lblcolor7);
        add(lblcolor8);
        add(lblcolor9);
        add(lblcolor10);
        txttext.setEditable(false);
        lblcolor.setOpaque(true);
        lblcolor2.setOpaque(true);
        lblcolor3.setOpaque(true);
        lblcolor4.setOpaque(true);
        lblcolor5.setOpaque(true);
        lblcolor6.setOpaque(true);
        lblcolor7.setOpaque(true);
        lblcolor8.setOpaque(true);
        lblcolor9.setOpaque(true);
        lblcolor10.setOpaque(true);
        lblname13.setOpaque(true);
        lblname14.setOpaque(true);
        lblname15.setOpaque(true);
        lblname16.setOpaque(true);
        lblname17.setOpaque(true);
        lblname30.setOpaque(true);
        lblname31.setOpaque(true);
        lblname32.setOpaque(true);
        lblname13.setVisible(false);
        lblname14.setVisible(false);
        lblname15.setVisible(false);
        lblname16.setVisible(false);
        lblname17.setVisible(false);
        lblname30.setVisible(false);
        lblname31.setVisible(false);
        lblname32.setVisible(false);
        setBackground(new Color(163,42,205));
        lblname3.addMouseMotionListener(this);
        lblname5.addMouseMotionListener(this);
        lblimg4.addMouseMotionListener(this);
        lblimg5.addMouseMotionListener(this);
        lblimg6.addMouseMotionListener(this);
        lblname3.addMouseListener(this);
        lblimg4.addMouseListener(this);
        lblimg5.addMouseListener(this);
        lblimg6.addMouseListener(this);
        lblimg7.addMouseListener(this);
        lblimg8.addMouseListener(this);
        lblimg9.addMouseListener(this);
        lblimg10.addMouseListener(this);
        lblimg11.addMouseListener(this);
        lblimg12.addMouseListener(this);
        lblimg13.addMouseListener(this);
        lblimg14.addMouseListener(this);
        lblcolor.addMouseMotionListener(this);
        lblimg7.addMouseMotionListener(this);
        lblname15.addMouseListener(this);
        lblname16.addMouseListener(this);
        lblname17.addMouseListener(this);
        lblname4.addMouseListener(this);
        lblname5.addMouseListener(this);
        lblname6.addMouseListener(this);
        lblname7.addMouseListener(this);
        lblname8.addMouseListener(this);
        lblname9.addMouseListener(this);
        lblname10.addMouseListener(this);
        lblname11.addMouseListener(this);
        lblname12.addMouseListener(this);
        lblname13.addMouseListener(this);
        lblname14.addMouseListener(this);
        lblname5.addMouseListener(this);
        lblname30.addMouseListener(this);
        lblname31.addMouseListener(this);
        lblname32.addMouseListener(this);
        lblimg6.addMouseListener(this);
        mnumastbatch.addActionListener(this);
        mnumastcourse.addActionListener(this);
        mnumaststud.addActionListener(this);
        mnumastfact.addActionListener(this);
        mnutrafee.addActionListener(this);
        mnutrabchange.addActionListener(this);
        mnutraatt.addActionListener(this);
        mnurepreport.addActionListener(this);
        int d=0;
        try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select * from coursetbl");
                while(res.next())
                {
                       d =Integer.parseInt(lblname24.getText());
                       lblname24.setText(Integer.toString(d+1));
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            d=0;
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select * from batchcreation");
                while(res.next())
                {
                       d =Integer.parseInt(lblname25.getText());
                       lblname25.setText(Integer.toString(d+1));
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            d=0;
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select * from followuptbl");
                while(res.next())
                {
                       d =Integer.parseInt(lblname26.getText());
                       lblname26.setText(Integer.toString(d+1));
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            d=0;
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select * from studenttbl");
                while(res.next())
                {
                       d =Integer.parseInt(lblname27.getText());
                       lblname27.setText(Integer.toString(d+1));
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            d=0;
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select * from enquirytbl");
                while(res.next())
                {
                       d =Integer.parseInt(lblname28.getText());
                       lblname28.setText(Integer.toString(d+1));
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            d=0;
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ias","root","mysqlstudent");
                Statement st=con.createStatement();
                ResultSet res=st.executeQuery("select * from facultytbl");
                while(res.next())
                {
                       d =Integer.parseInt(lblname29.getText());
                       lblname29.setText(Integer.toString(d+1));
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
    }
    public void setv()
    {
        lblname13.setVisible(true);
        lblname14.setVisible(true);
        lblname15.setVisible(true);
        lblname16.setVisible(true);
        lblname17.setVisible(true);
    }
    public void setf()
    {
        lblname13.setVisible(false);
        lblname14.setVisible(false);
        lblname15.setVisible(false);
        lblname16.setVisible(false);
        lblname17.setVisible(false);
    }
    public void mouseClicked(MouseEvent m)
    {
        if(m.getSource()==lblname3)
        {
            c=c+m.getClickCount();
            setv();
        }
        if(m.getSource()==lblimg4)
        {
            c=c+m.getClickCount();
            setv();
        }
        if(m.getSource()==lblname5)
        {
            k=k+m.getClickCount();
            lblname30.setVisible(true);
            lblname31.setVisible(true);
            lblname32.setVisible(true);
        }
        if(m.getSource()==lblimg6)
        {
            k=k+m.getClickCount();
            lblname30.setVisible(true);
            lblname31.setVisible(true);
            lblname32.setVisible(true);
            //System.out.println(k);
        }
       if(k==3)
        {
            if(m.getSource()==lblname5)
            {
              lblname30.setVisible(false);
              lblname31.setVisible(false);
              lblname32.setVisible(false);
            }
            if(m.getSource()==lblimg6)
            {
                lblname30.setVisible(false);
                lblname31.setVisible(false);
                lblname32.setVisible(false);
            }
            k=0;
        }
        if(k>2)
        {
            k=0;
            lblname30.setVisible(false);
            lblname31.setVisible(false);
            lblname32.setVisible(false);
        }
        if(c==2)
        {
            if(m.getSource()==lblname3)
            {
              setf();
            }
            if(m.getSource()==lblimg4)
            {
               setf();
            }
            c=0;
        }
        if(c>2)
        {
            c=0;
            setf();
        }
        if(m.getSource()==lblname30&& lblname30.isVisible()==true)
        {
            new payreportform();
            lblname30.setVisible(false);
            lblname31.setVisible(false);
            lblname32.setVisible(false);
        }
        if(m.getSource()==lblname31&& lblname31.isVisible()==true)
        {
            new facultyreportform();
            lblname30.setVisible(false);
            lblname31.setVisible(false);
            lblname32.setVisible(false);
        }
        if(m.getSource()==lblname32&& lblname32.isVisible()==true)
        {
            new studentreportform();
            lblname30.setVisible(false);
            lblname31.setVisible(false);
            lblname32.setVisible(false);
        }
        if(m.getSource()==lblname13&& lblname13.isVisible()==true)
        {
            new batchcreationform();
            setf();
        }
        if(m.getSource()==lblname14&& lblname14.isVisible()==true)
        {
            new courseform();
            setf();
        }
        if(m.getSource()==lblname15&& lblname15.isVisible()==true)
        {
            new studentform();
            setf();
        }
        if(m.getSource()==lblname16&& lblname16.isVisible()==true)
        {
            new facultyform();
            setf();
        }
        if(m.getSource()==lblname17&& lblname17.isVisible()==true)
        {
            new batchchangeform();
            setf();
        }
        if(m.getSource()==lblname4)
        {
            new paymentform();
        }
        if(m.getSource()==lblimg5)
        {
            new paymentform();
        }
        if(m.getSource()==lblname7)
        {
            this.dispose();
        }
        if(m.getSource()==lblimg8)
        {
            this.dispose();
        }
        if(m.getSource()==lblname8)
        {
            new enquiryform();
        }
        if(m.getSource()==lblimg9)
        {
            new enquiryform();
        }
        if(m.getSource()==lblname9)
        {
            new followupform();
        }
        if(m.getSource()==lblimg10)
        {
            new followupform();
        }
        if(m.getSource()==lblname10)
        {
            new enrollmentform();
        }
        if(m.getSource()==lblimg11)
        {
            new enrollmentform();
        }
        if(m.getSource()==lblname11)
        {
            new attendanceform();
        }
        if(m.getSource()==lblimg13)
        {
            new attendanceform();
        }
        if(m.getSource()==lblname12)
        {
            new feeform();
        }
        if(m.getSource()==lblimg14)
        {
            new feeform();
        }
        if(m.getSource()==lblimg7)
        {
            new coursedescform();
        }
    }
    public void mousePressed(MouseEvent m)
    {
      
    }
    public void mouseEntered(MouseEvent m)
    {
       
    }
    public void mouseReleased(MouseEvent m)
    {
        
    }
    public void mouseMoved(MouseEvent m)
    {
        if(m.getSource()==lblname13 && lblname13.isVisible()==true)
        {
            lblname13.setBackground(new Color(96,96,96));
        }
        if(lblname14.isVisible()==true&& m.getSource()==lblname14)
        {
            lblname14.setBackground(new Color(96,96,96));
        }

    }
    public void mouseExited(MouseEvent m)
    {
       
    }
    public void mouseDragged(MouseEvent m)
    {

    }
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource()==mnumastbatch)
        {
            new batchcreationform();
        }
        if(a.getSource()==mnumastcourse)
        {
            new courseform();
        }
        if(a.getSource()==mnumaststud)
        {
            new studentform();
        }
        if(a.getSource()==mnumastfact)
        {
            new facultyform();
        }
        if(a.getSource()==mnutrafee)
        {
            new feeform();
        }
        if(a.getSource()==mnutrabchange)
        {
            new batchchangeform();
        }
        if(a.getSource()==mnutraatt)
        {
            new attendanceform();
        }
    }
    public static void main(String[] args) {
        new menuform();
    }
}