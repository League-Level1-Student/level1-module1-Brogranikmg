import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	public static void main(String[] args) {
		BinaryConverter onezero = new BinaryConverter();
		onezero.doStuff();
	}
	
	JFrame frame = new JFrame();
	JTextField field = new JTextField(20);
	JLabel label = new JLabel();
	JButton button = new JButton("Превращать!");
	
	public void doStuff() {
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(field);
		panel.add(button);
		button.addActionListener(this);
		panel.add(label);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			label.setText(convert(field.getText()));
			frame.pack();
		}
	}
	
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, дурак!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, дурак!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, дурак!");
             return "-";
        }
   }
}
