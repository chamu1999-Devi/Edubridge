package com;
import java.awt.event.*;  
import javax.swing.*;   
public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		    JFrame f=new JFrame("Button Example");  
		    
		    final JTextField tf=new JTextField();  
		    tf.setBounds(50,50, 150,20);  
		    
		    JButton b=new JButton("Login");  
		    b.setBounds(50,100,95,30);  
		    
		    b.addActionListener(new ActionListener(){ 
		    	
		    	public void actionPerformed(ActionEvent e){ 
		    		System.out.println(1);
		            tf.setText("Welcome to Javatpoint.");  
		            System.out.println(2);
		        }  
		    }); 
		    
		    f.add(b);
		    f.add(tf);  
		    f.setSize(400,400);  
		    f.setLayout(null);  
		    f.setVisible(true);   
		}  
		}

	
