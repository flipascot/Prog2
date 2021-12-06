package all;

import java.awt.*;
import com.mycompany.brick.MyApp;

import java.awt.event.*;
import javax.swing.*;

public class gomb extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	
	gomb(){
		
		
		
		button = new JButton();
		button.setBounds(100, 100, 250, 100);
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
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			com.mycompany.brick.MyApp MyApp=new com.mycompany.brick.MyApp();
			
		}	
	}
}