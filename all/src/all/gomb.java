package all;

import java.awt.*;
import com.mycompany.brick.MyApp;

import java.awt.event.*;
import javax.swing.*;

public class gomb extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	
	JButton button1;
	JLabel label1;
	
	JButton button2;
	JLabel label2;
	
	gomb(){
		
		
		button1 = new JButton();
		button1.setBounds(100, 50, 250, 50);
		button1.addActionListener(this);
		button1.setText("pong");
		
		button1.setFocusable(false);
		button1.setHorizontalTextPosition(JButton.CENTER);
		button1.setVerticalTextPosition(JButton.BOTTOM);
		button1.setFont(new Font("Comic Sans",Font.BOLD,25));
		button1.setIconTextGap(-15);
		button1.setForeground(Color.black);
		button1.setBackground(Color.green);
		button1.setBorder(BorderFactory.createEtchedBorder());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button1);
		//////////////////////////////////////////////////////////
		button = new JButton();
		button.setBounds(100, 125, 250, 50);
		button.addActionListener(this);
		button.setText("Labdas");
		
		button.setFocusable(false);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
		button.setIconTextGap(-15);
		button.setForeground(Color.black);
		button.setBackground(Color.green);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
			//////////////////////////////////////////////////////////
			button2 = new JButton();
			button2.setBounds(100, 200, 250, 50);
			button2.addActionListener(this);
			button2.setText("snake");
			
			button2.setFocusable(false);
			button2.setHorizontalTextPosition(JButton.CENTER);
			button2.setVerticalTextPosition(JButton.BOTTOM);
			button2.setFont(new Font("Comic Sans",Font.BOLD,25));
			button2.setIconTextGap(-15);
			button2.setForeground(Color.black);
			button2.setBackground(Color.green);
			button2.setBorder(BorderFactory.createEtchedBorder());
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(null);
			this.setSize(500,500);
			this.setVisible(true);
			this.add(button2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			com.mycompany.brick.MyApp MyApp=new com.mycompany.brick.MyApp();
			
		}	
		if(e.getSource()==button1) {
			pong2.PongGame PongGame=new pong2.PongGame();
			
		}	
		if(e.getSource()==button2) {
			snake.SnakeGame SnakeGame = new snake.SnakeGame();
			
		}	
	}
}

