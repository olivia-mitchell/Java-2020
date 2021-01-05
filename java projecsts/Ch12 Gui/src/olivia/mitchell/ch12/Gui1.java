package olivia.mitchell.ch12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Gui1 implements ActionListener {
	
	public static void main(String[] args) {
		new Gui1();
	}

	public Gui1() {
		//adding a window
				JFrame myFrame = new JFrame();
				
				//adding a Layout manager
				FlowLayout myLayout = new FlowLayout();
				myFrame.setLayout(myLayout);
				
				//adding JFrame basic settings
				myFrame.setTitle("JFrame Window");
				myFrame.setSize(400, 200);
				myFrame.setLocation(200, 300);
				myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//adding a Label
				JLabel myLabel = new JLabel("This is my label!");
				myFrame.add(myLabel);
				
				//adding a button
				JButton myButton = new JButton("Click Here");
				myButton.addActionListener(this);
				myFrame.add(myButton);
				myFrame.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		JOptionPane.showMessageDialog(null,"Hey that tickles!");
		
	}

}
