package model;

public class Co2Calculator {
	
	private int co2Emitted;
	private int numberOfTrees;
	private final int ANNUAL_ISSUE = 1600;
	private final int CO2_ABSORBED = 22;
	
	public void calculateCo2(int age) {
		co2Emitted = age * ANNUAL_ISSUE;
		numberOfTrees = co2Emitted / CO2_ABSORBED;
	}

	public int getCo2Emitted() {
		return co2Emitted;
	}

	public int getNumberOfTrees() {
		return numberOfTrees;
	}

	public int getANNUAL_ISSUE() {
		return ANNUAL_ISSUE;
	}

	public int getCO2_ABSORBED() {
		return CO2_ABSORBED;
	}

}
