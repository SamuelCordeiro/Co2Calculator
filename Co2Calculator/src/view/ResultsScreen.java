package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ResultsScreen {
	
	private JFrame jfResultsScreen;
	private JPanel jpResultsScreen;
	private JLabel jlTitle;
	private JTextPane jtpResults;
	
	public ResultsScreen() {
	
		jlTitle = new JLabel("Results");
	    jlTitle.setForeground(new Color(153, 0, 0));
	    jlTitle.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
	    jlTitle.setHorizontalAlignment(SwingConstants.CENTER);
	    jlTitle.setBounds(10, 11, 464, 42);
	    
	    jtpResults = new JTextPane();
	    jtpResults.setFont(new Font("Tahoma", Font.BOLD, 15));
	    jtpResults.setForeground(new Color(255, 0, 0));
	    jtpResults.setBackground(new Color(153, 204, 153));
	    jtpResults.setBounds(45, 51, 393, 210);
	    jtpResults.setEditable(false);
	    
		jpResultsScreen = new JPanel();
	    jpResultsScreen.setBackground(new Color(153, 204, 51));
	    jpResultsScreen.setBorder(new EmptyBorder(5, 5, 5, 5));
	    jpResultsScreen.setLayout(null);
	    jpResultsScreen.add(jlTitle);
	    jpResultsScreen.add(jtpResults);
	    
	    jfResultsScreen = new JFrame("Co2 Calculator");
	    jfResultsScreen.setBounds(100, 100, 500, 350);
	    jfResultsScreen.setVisible(true);
	    jfResultsScreen.setContentPane(jpResultsScreen);
	}

	public JTextPane getJtpResults() {
		return jtpResults;
	}
}
