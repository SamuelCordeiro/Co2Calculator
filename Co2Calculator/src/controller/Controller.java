package controller;

import view.DataCollectScreen;
import view.ResultsScreen;
import java.awt.event.ActionListener;
import model.Co2Calculator;
import java.awt.event.ActionEvent;

public class Controller implements ActionListener {
	
	private DataCollectScreen dcs;
	private Co2Calculator co2Calculator;
	private ResultsScreen resultsScreen;
	
	public Controller () {
		co2Calculator = new Co2Calculator();
		dcs = new DataCollectScreen();
		dcs.getJbRun().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == dcs.getJbRun()) {
			co2Calculator.calculateCo2((Integer)dcs.getJsAge().getValue());
			resultsScreen = new ResultsScreen();
			resultsScreen.getJtpResults().setText("° You emit approximately \"" + co2Calculator.getANNUAL_ISSUE() + "\" kilos of Co2 per year.\r\n\n"
					+ "° During your entire life you have emitted approximately \"" + co2Calculator.getCo2Emitted() + "\" kilos of Co2.\r\n\n"
					+ "° An adult tree can absorb approximately \"" + co2Calculator.getCO2_ABSORBED() + "\" kilos of Co2 per year. \r\n\n"
					+ "° Therefore, to offset all this emission, it would be necessary to plant \"" + co2Calculator.getNumberOfTrees() + "\" trees. \r\n"
					+ "");
		}
	}

}
 