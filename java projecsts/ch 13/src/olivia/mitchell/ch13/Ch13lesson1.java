package olivia.mitchell.ch13;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ch13lesson1 implements ActionListener{
JFrame frame;
JTextField lastName;
JTextField firstName;
JButton myButton;
JButton colorButton;
JTextArea discription;
JSpinner ageSpinner;
	
	public Ch13lesson1() {
		frame = new JFrame();
		
		//BoxLayout myLayout = new BoxLayout(frame, BoxLayout.Y_AXIS);
		JPanel contentPane = (JPanel)frame.getContentPane();
		
		FlowLayout myLayout = new FlowLayout();
		BoxLayout box = new BoxLayout(contentPane, BoxLayout.Y_AXIS);
		frame.setLayout(box);
		
		
		frame.setTitle("Message Dialog Gui");
		frame.setSize(500, 500);
		frame.setLocation(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		firstName = new JTextField(20);
		lastName = new JTextField();
		
		discription = new JTextArea(5,20);
		discription.setLineWrap(true);
		
		JScrollPane disScrollbar = new JScrollPane(discription, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		ageSpinner = new JSpinner(new SpinnerNumberModel(18,0,130,1));
		
		myButton = new JButton("Submit");
		myButton.addActionListener(this);
		
		colorButton = new JButton("click on me");
		colorButton.addActionListener(this);
		
		contentPane.add(new JLabel("First Name"));
		contentPane.add(firstName);
		contentPane.add(new JLabel("Last Name"));
		contentPane.add(lastName);
		contentPane.add(new JLabel("Discription"));
		contentPane.add(disScrollbar);
		contentPane.add(new JLabel("Age"));
		contentPane.add(ageSpinner);
		
		contentPane.add(myButton);
		contentPane.add(colorButton);
		
		frame.pack();
		frame.setVisible(true);
	}

	private void SpinnerNumberModel(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new Ch13lesson1();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object control = e.getSource();
		
		if (control == myButton) {
		String fName = firstName.getText();
		String lName = lastName.getText();
		String disText = discription.getText();
		
		JOptionPane.showMessageDialog(frame, "hello "+fName+" "+lName+"\n"+disText);
		}
		else {
		JOptionPane messagebox = new JOptionPane();
		String title = messagebox.showInputDialog(frame,"Enter a title for the dialog box",JOptionPane.WARNING_MESSAGE);
		String result = messagebox.showInputDialog(frame,"Enter your favorite color",title,JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null,"you like the color "+result);
		}
	}

}
