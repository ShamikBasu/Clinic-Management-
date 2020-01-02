import patienttracker.*;

import java.io.*;

import java.util.*;

import java.util.Calendar;

import java.awt.*;  

import java.awt.event.*;  

public class AEvent3 extends Frame 
{
	Button doctor,patient, main_menu,lab,staff,medicine, facility ,write1;
	Graphics g;
	public AEvent3()
	{
		setSize(700,500);  
		setLayout(null);  
		setVisible(true);
		setBackground(new Color(51,46,46));
		setTitle("STARK INDUSTRIES");
		
		main_menu=new Button("MAIN MENU");
		main_menu.setBounds(250,200,80,30);
		add(main_menu);
		main_menu.setBackground(new Color(218, 52, 52));
		
		doctor=new Button("DOCTOR");
		doctor.setBounds(100,120,80,30); 
		add(doctor);
		doctor.setBackground(new Color(185, 125, 16));

		patient=new Button("PATIENT");
		patient.setBounds(400,120,80,30); 
		add(patient);
		patient.setBackground(new Color(185, 125, 16));

		lab=new Button("LAB");
		lab.setBounds(60,200,80,30); 
		add(lab);
		lab.setBackground(new Color(185, 125, 16));
		
		medicine=new Button("MEDICINE");
		medicine.setBounds(460,200,80,30); 
		add(medicine);
		medicine.setBackground(new Color(185, 125, 16));
		
		facility=new Button("FACILITY");
		facility.setBounds(100,280,80,30); 
		add(facility);
		facility.setBackground(new Color(185, 125, 16));
	
		staff=new Button("STAFF");
		staff.setBounds(400,280,80,30); 
		add(staff);
		staff.setBackground(new Color(185, 125, 16));

		write1=new Button("WRITE TO FILE");
		write1.setBounds(250,400,80,30); 
		add(write1);
		write1.setBackground(new Color(185, 125, 16));
		
		facility.addActionListener(new MyActionListener(this));
		medicine.addActionListener(new MyActionListener(this));
		lab.addActionListener(new MyActionListener(this));
		staff.addActionListener(new MyActionListener(this));
		main_menu.addActionListener(new MyActionListener(this));
		doctor.addActionListener(new MyActionListener(this));
		patient.addActionListener(new MyActionListener(this));
		write1.addActionListener(new MyActionListener(this));

	}
	
	
}
class MyActionListener implements ActionListener
{
	AEvent3 ba;
	static B a= null;
	MyActionListener(AEvent3 ba)
	{
		this.ba=ba;
		
	}

	public void actionPerformed(ActionEvent ae)
	{			
			
			String s=ae.getActionCommand();
			
			ba.setFont(new Font("Dialog",Font.BOLD,16));
			if(s.equals("MAIN MENU"))
				 a.cons();     
			else if(s.equals("DOCTOR"))			
				a.doc();
			else if(s.equals("PATIENT"))
				a.pat();
			else if(s.equals("MEDICINE"))
				a.med();
			else if(s.equals("LAB"))
				a.lb();
			else if(s.equals("STAFF"))
				a.stf();
			else  if(s.equals("FACILITY"))
				a.fac();
			else 
				a.writeIntoFile();
			ba.repaint();								
	}
	public static void main(String args[])
	{  
	a= new B();
	new AEvent3(); 	
	}
}

