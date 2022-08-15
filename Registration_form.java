/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration_form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */


public class Registration_form extends JFrame implements ActionListener {
JPanel w, c ,e , f ,s;
JLabel name, mobile, gender,DOB, adress, con,title , res;
JTextField box1, box2;
JRadioButton male, female;
JCheckBox box;
ButtonGroup gengp;
JComboBox date,month,year;
JButton save,reset;
JTextArea text,resadd, box3;


private String dates[]
		= { "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "10",
			"11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20",
			"21", "22", "23", "24", "25",
			"26", "27", "28", "29", "30",
			"31" };
	private String months[]
		= { "Jan", "feb", "Mar", "Apr",
			"May", "Jun", "July", "Aug",
			"Sup", "Oct", "Nov", "Dec" };
	private String years[]
		= { "1995", "1996", "1997", "1998",
			"1999", "2000", "2001", "2002",
			"2003", "2004", "2005", "2006",
			"2007", "2008", "2009", "2010",
			"2011", "2012", "2013", "2014",
			"2015", "2016", "2017", "2018",
			"2019" };
        
        
        
        
        
  public Registration_form(String a){
  
  setSize(1000,700);
  setMinimumSize(new Dimension(900,700));
  setTitle("REGISTRATION FORM");
 
w= new JPanel();
w.setBackground(Color.cyan);
w.setPreferredSize(new Dimension(400,700));

s= new JPanel();
s.setBackground(Color.cyan);
s.setPreferredSize(new Dimension(900,100));

f= new JPanel();
f.setBackground(Color.cyan);
f.setPreferredSize(new Dimension(900,100));

 e= new JPanel();
e.setBackground(Color.cyan);
e.setPreferredSize(new Dimension(200,700));
  
 c= new JPanel();
c.setBackground(Color.cyan);
c.setPreferredSize(new Dimension(400,500));
c.setBackground(Color.white);
  
  

box1= new JTextField();
box1.setPreferredSize(new Dimension(250,20));
  box2= new JTextField();
  box2.setPreferredSize(new Dimension(250,20));
  
  box3= new JTextArea();
  box3.setPreferredSize(new Dimension(250,80));
  
  
  
  
  title = new JLabel("REGISTRATION FORM ");
 title.setFont(new Font("Arial", Font.PLAIN, 27));
		
		
  
  name = new JLabel("  NAME  ");
  name.setPreferredSize(new Dimension(100,50));
  mobile = new JLabel(" MOBILE  ");
  mobile.setPreferredSize(new Dimension(100,50));
  gender = new JLabel(" GENDER ");
  gender.setPreferredSize(new Dimension(100,50));
  DOB = new JLabel("  DOB ");
  DOB.setPreferredSize(new Dimension(150,50));
  adress = new JLabel("ADDRESS");
  adress.setPreferredSize(new Dimension(100,50));
   
   
   male = new JRadioButton("  Male ");
   male.setFont(new Font("Arial", Font.PLAIN, 15));
   male.setSelected(true);
   
   female = new JRadioButton(" Female  ");
  female.setFont(new Font("Arial", Font.PLAIN, 15));
  female.setSelected(false);
  
   box = new JCheckBox("Accept terms and conditions");
   box.setBackground(Color.cyan);
   box.setFont(new Font("Arial", Font.PLAIN, 15));
   box.setPreferredSize(new Dimension(350,50));
   
   
   save = new JButton("Save");
   save.setPreferredSize(new Dimension(70,50));
   save.addActionListener(this);
  
   reset = new JButton("Reset");
   reset.setPreferredSize(new Dimension(70,50));
    reset.addActionListener(this);
   
   date = new JComboBox(dates);
   date.setFont(new Font("Arial", Font.PLAIN, 15));
		
   month = new JComboBox(months);
   month.setFont(new Font("Arial", Font.PLAIN, 15));
		
 year = new JComboBox(years);
 year.setFont(new Font("Arial", Font.PLAIN, 15));
		
 
 res =new JLabel();
 res.setFont(new Font("Arial", Font.PLAIN, 15));
		
   
   w.add(title);
   w.add(name);
   w.add(box1);
   w.add(mobile);
   w.add(box2);
     w.add(gender);
   w.add(male);
   w.add(female);
    w.add(DOB);
   w.add(date);
   w.add(month);
   w.add(year);
   w.add(adress);
   w.add(box3);
  w.add(box);
   w.add(save);
   w.add(reset);
   w.add(res);
   
   text = new JTextArea();
   text.setPreferredSize(new Dimension(300,300));
   text.setLineWrap(true);
   
   resadd = new JTextArea();
   resadd.setPreferredSize(new Dimension(300,300));
   resadd.setLineWrap(true);
   
   c.add(text);
  
  
  
  
   add(f, BorderLayout.SOUTH);
  add(c, BorderLayout.CENTER);
  add(w, BorderLayout.WEST);
  add(s, BorderLayout.NORTH);
 add(e, BorderLayout.EAST);
  
  
  }
 
   
    public static void main(String[] args) {
        // TODO code application logic here
        Registration_form obj = new Registration_form("Registration form");
        obj.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
       
        
		if (e.getSource() == save) {
			if (box.isSelected()) {
				String data1,data2;
				String data
					= "Name : "
					+ box1.getText() + "\n"
					+ "Mobile : "
					+ box2.getText() + "\n";
				if (male.isSelected())
					data1 = "Gender : Male"
							+ "\n";
				else
					data1 = "Gender : Female"
							+ "\n";
				 data2
					= "DOB : "
					+ (String)date.getSelectedItem()
					+ "/" + (String)month.getSelectedItem()
					+ "/" + (String)year.getSelectedItem()
					+ "\n";

				String data3 = "Address : " + box3.getText();
				text.setText(data + data1 + data2 + data3);
				text.setEditable(false);
				res.setText("Registration Successfully..");
			}
			else {
				text.setText("");
				resadd.setText("");
				res.setText("Please accept the"
							+ " terms & conditions..");
			}
		}
                
                
                else if (e.getSource() == reset) {
			box1.setText("");
			box3.setText("");
			box2.setText("");
			res.setText("");
			text.setText("");
			box.setSelected(false);
			date.setSelectedIndex(0);
			month.setSelectedIndex(0);
			year.setSelectedIndex(0);
			resadd.setText("");
		}
	}


        
        
        
        
        
        
        
        
        
        
        
        }
        
        
        
    }
    
}
