

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Toolkit;

import javax.swing.*;//jframe

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener

{
	
JTextField TextBox1 = new JTextField(20);//text

JTextField TextBox2 = new JTextField(20);// 

JTextField TextBox3 = new JTextField(30);

JTextField TextBox4 = new JTextField(20);
	
JButton Button1 = new JButton ("Show Rectangle");

JButton Button2 = new JButton ("Show Oval");

JButton Button3 = new JButton ("Show Arc");

JButton Button4 = new JButton ("Show Polygon");

int var=0;

public Gui() {
		
		int Height= 350;
		
		int Width=500;
	
		
	//	image1=new  ImageIcon(getClass().getResource("hi.jpg"));
	
		setSize(Width,Height);// to use w and h
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        JLabel title= new JLabel("Welcome :)", JLabel.CENTER);
   
        JLabel title1= new JLabel("___________________________", JLabel.CENTER);
        
	title1.setFont(new Font("Serif", Font.BOLD, 14));
     	
     	title1.setForeground(Color.blue);
        
     	title.setFont(new Font("Serif", Font.BOLD, 40));
     	
     	title.setForeground(Color.green);
  
		JLabel Label2 = new JLabel("Please Select One To Show It :");  
		
	Label2.setFont(new Font("Serif", Font.BOLD, 14));
     	
     	Label2.setForeground(Color.red);
          
          add(title);
          
          add(title1);
  		
  		add(Label2);
  		
  		add(Button1);
  		
  		Button1.setBackground(Color.cyan);

  		add(Button2);
  		
  		Button2.setBackground(Color.cyan);
  		
  		add(Button3);
  		
  		Button3.setBackground(Color.cyan);
  		
  		add(Button4);
  
  		Button4.setBackground(Color.cyan);
  		
  //	  ImageIcon dog_gif = new ImageIcon("hi.jpg");
  		
  		setLayout(null);
		
		    title.setBounds(10,20,500,30);
		    
		    title1.setBounds(10,30,500,30);
		    
		    Label2.setBounds(10,70,200,30);
		    
		    Button1.setBounds(20,120,120,30);
			  
		    Button2.setBounds(160,120,120,30);
		    
		    Button3.setBounds(300,120,120,30);
			  
		    Button4.setBounds(440,120,120,30);
		    
		    Button1.addActionListener(this);
		    
		    Button2.addActionListener(this);
		    
	        Button3.addActionListener(this);
		    
		    Button4.addActionListener(this);
	
		    setVisible(true);// to make visibl
		   
	
		    	    
	}

public void paint(Graphics graphic) {
	
	super.paint(graphic);
	
	if(var==1) {
		
	super.paint(graphic);
		
		graphic.setColor(Color.red);
		graphic.drawRect(37,200,100,100);
		graphic.fillRect(37,200,100,100);

	}
	
	else if(var==2)
	{
super.paint(graphic);
		
		graphic.setColor(Color.green);
		
		graphic.fillOval(180,200,100,100);
		
	}
	
	else if(var==3)
	{
super.paint(graphic);
		
		graphic.setColor(Color.blue);
		graphic.fillArc(320,200,100,180,50,90);
}

	else if(var==4)
	{		
		
super.paint(graphic);
		
		graphic.setColor(Color.red);
		int xPoints[]= {470,500,369,378,570,399};
		
		int yPoints[]= {500,525,508,400,394,189};
		//graphic.setColor(newColor);
		
		graphic.fillPolygon(xPoints,yPoints,5);
		//graphic.fillPolygon(10,50,100,100);
		
	}
}

	public static void main(String[] args) {
		
		 new Gui();
		 
	}

	@Override
	public void actionPerformed(ActionEvent x) {
		
		// TODO Auto-generated method stub
		
		if(x.getSource()==Button1) {
			
			var=1;
			repaint();			
		}
		
		 if (x.getSource()==Button2)
			
		{
			var=2;
			repaint();

		}
		 
	    if(x.getSource()==Button3)	 
	    {
	    	var=3;
	    	repaint();
	}			
	    if(x.getSource()==Button4)
	    {
		
	    	var=4;
	    	repaint();
	    	
	}
	 
	}
}


