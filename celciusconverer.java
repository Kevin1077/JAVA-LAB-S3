package sample;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TemperatureConvertor extends JFrame implements ActionListener {
	private JTextField celciusTextFeild;
	private JTextField farenheitTextFeild;
	TemperatureConvertor(){
		setTitle("Temperature Convertor");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create jPanel
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		
		//create and add components
		JLabel celciusLable=new JLabel("Celcius");
		celciusTextFeild = new JTextField();
		JLabel farenheitLabel1=new JLabel("Farenheit");
		farenheitTextFeild=new JTextField();
		farenheitTextFeild.setEditable(false);
		JButton convertButton=new JButton("Convert");
		
		//Register the button-> actionListener
		convertButton.addActionListener(this);
		
		panel.add(celciusLable);
		panel.add(celciusTextFeild);
		panel.add(farenheitLabel1);
		panel.add(farenheitTextFeild);
		panel.add(new JLabel());
		panel.add(convertButton);
		
		add(panel);
	}
	public static void main(String[] args) {
		TemperatureConvertor convertor=new TemperatureConvertor();
		convertor.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		double celcius=Double.parseDouble(celciusTextFeild.getText());
				Double farenheit=(celcius*9/5)+32;
				farenheitTextFeild.setText(String.format("%.2f",farenheit));
				
	}

}
