package controller;

import view.DataCollectScreen;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Controller implements ActionListener {
	
	private DataCollectScreen dcs;
	
	public Controller () {
		dcs = new DataCollectScreen();
		dcs.getJbRun().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == dcs.getJbRun()) {
			dcs.getJsAge().getValue();
		}
	}

}
