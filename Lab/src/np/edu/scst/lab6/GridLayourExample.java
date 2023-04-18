package np.edu.scst.lab6;
import javax.swing.*;
import java.awt.*;
public class GridLayourExample {
	

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Swing GridLayout Example");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JPanel panel = new JPanel(new GridLayout(2, 3));

	        JButton button1 = new JButton("Button 1");
	        JTextField textField1 = new JTextField();
	        JLabel label1 = new JLabel("Label 1");
	        JCheckBox checkBox1 = new JCheckBox("Check Box 1");
	        JRadioButton radioButton1 = new JRadioButton("Radio Button 1");

	        panel.add(button1);
	        panel.add(textField1);
	        panel.add(label1);
	        panel.add(checkBox1);
	        panel.add(radioButton1);

	        frame.add(panel);
	        frame.pack();
	        frame.setVisible(true);
	    }
	}

