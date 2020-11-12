package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class DataCollectScreen{

	private JFrame jfMainScreen;
	private JPanel jpMainScreen;
	private JLabel jlTitle;
	private JLabel jlIcon;
	private JLabel jlAge;
	private JSpinner jsAge;
	private JButton jbRun;
	private ImageIcon co2Icon;

	public DataCollectScreen() {
		
		jlTitle = new JLabel("CO2 Calculator");
        jlTitle.setForeground(new Color(153, 0, 0));
        jlTitle.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
        jlTitle.setHorizontalAlignment(SwingConstants.CENTER);
        jlTitle.setBounds(10, 11, 464, 42);
		
		jlIcon = new JLabel();
		jlIcon.setBounds(180, 64, 130, 130);
		co2Icon = new ImageIcon(getClass().getResource("/resources/co2.png"));
        jlIcon.setIcon(new ImageIcon(co2Icon.getImage().getScaledInstance(jlIcon.getWidth(), jlIcon.getHeight(), Image.SCALE_DEFAULT)));
		
        jlAge = new JLabel("Selecione a sua idade:");
        jlAge.setForeground(new Color(153, 0, 0));
        jlAge.setFont(new Font("Arial Narrow", Font.BOLD, 14));
        jlAge.setBounds(130, 232, 119, 23);
        
		jsAge = new JSpinner(new SpinnerNumberModel(0, 0, 150, 1));
		jsAge.setBounds(268, 234, 72, 20);
		jsAge.getComponent(0).setBackground(new Color(255, 102, 51));
		jsAge.getComponent(1).setBackground(new Color(255, 102, 51));
		jsAge.getEditor().getComponent(0).setBackground(new Color(255, 153, 153));
        		
		jbRun = new JButton("Run");
        jbRun.setFont(new Font("Tahoma", Font.BOLD, 12));
        jbRun.setBackground(new Color(255, 102, 51));
        jbRun.setForeground(new Color(0, 0, 0));
        jbRun.setBounds(197, 266, 89, 23);
		
        jpMainScreen = new JPanel();
        jpMainScreen.setBackground(new Color(153, 204, 51));
        jpMainScreen.setBorder(new EmptyBorder(5, 5, 5, 5));
        jpMainScreen.setLayout(null);
        jpMainScreen.add(jlTitle);
        jpMainScreen.add(jlIcon);
        jpMainScreen.add(jlAge);
        jpMainScreen.add(jsAge);
        jpMainScreen.add(jbRun);
        
        jfMainScreen = new JFrame("Co2 Calculator");
        jfMainScreen.setBounds(100, 100, 500, 350);
        jfMainScreen.setVisible(true);
        jfMainScreen.setContentPane(jpMainScreen);
	}

	public JButton getJbRun() {
		return jbRun;
	}

	public JSpinner getJsAge() {
		return jsAge;
	}
}




