package com;
import javax.swing.*; 
public class Swing {
	

		public static void main(String[] args) {  
			JFrame f=new JFrame();//creating instance of JFrame  
			          
			JButton b=new JButton("click");//creating instance of JButton  
			
		
			b.setBounds(20,50,100, 30);//x axis, y axis, width, height  
			System.out.println(4);         
			f.add(b);//adding button in JFrame
			System.out.println(5);
			          
			f.setSize(200,300);//400 width and 500 height  
			f.setLayout( null );//using no layout managers  
			f.setVisible(true);//making the frame visible  
			}  
		
		
	}


