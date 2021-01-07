package olivia.mitchell.ch13;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ch13lesson1 implements ActionListener,ChangeListener{
JFrame frame;
JTextField lastName;
JTextField firstName;
JButton myButton;
JButton colorButton;
JTextArea discription;
JSpinner ageSpinner;
String[] favList = {"Bob's Burgers","Futurama","The Office","Arrested Development","Parks and Recreation","The Coldbergs","Everybody Hates Chris","My Name is Earl","The Middle","King of the Hill","Psych","Rick and Morty","The Simpsons","30Rock","Disenchantment"};
int index = 0;
JComboBox cBtestBox;
	
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
		ageSpinner.addChangeListener(this);
		
		JList favShowList = new JList(favList);
		
		favShowList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//favShowList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		//favShowList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		favShowList.setSelectedIndex(2);
		
		cBtestBox = new JComboBox();
		cBtestBox.setEditable(true);
		//cBtestBox.setSelectedIndex(1);
		//cBtestBox.setSelectedItem("Bob's Burgers");
		
		JScrollPane listScrollbar = new JScrollPane(favShowList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
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
		contentPane.add(listScrollbar);
		contentPane.add(cBtestBox);
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
		index++;
		discription.setText(favList[index]);
		String fName = firstName.getText();
		String lName = lastName.getText();
		String disText = discription.getText();
		
		JOptionPane.showMessageDialog(frame, "hello "+fName+" "+lName+"\n"+disText);
		
		cBtestBox.addItem(fName);
		cBtestBox.addItem(lName);
		cBtestBox.addItem(disText);
		String selected = (String)cBtestBox.getSelectedItem();
		firstName.setText(selected);
		}
		else {
		JOptionPane messagebox = new JOptionPane();
		String title = messagebox.showInputDialog(frame,"Enter a title for the dialog box",JOptionPane.WARNING_MESSAGE);
		String result = messagebox.showInputDialog(frame,"Enter your favorite color",title,JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null,"you like the color "+result);
		}
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		int userAge = (Integer)ageSpinner.getValue();
		int targetAge = 25;
		if (userAge < targetAge) {
			int toTAge = targetAge - userAge;
			JOptionPane.showMessageDialog(frame,"you are "+toTAge+" years from target age");
		}
		else {
			JOptionPane.showMessageDialog(frame,"wow your old");
		}
	}

}
