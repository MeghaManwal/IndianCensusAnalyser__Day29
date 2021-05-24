package com.codeanalyser;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;

public class StateCodeAnalyser_test {
	
	private static final String csvPath ="C:\\Users\\Varsha Manwal\\Desktop\\BridgeLabz\\Fellowship\\Day29_IndianStatesCensusAnalyzer\\StateCensusAnalyser\\Data\\codeFile.csv";
	
	@Test
	public void givenCensusCsvFile_returnCorrectRecords() throws IOException {
		StateCodeAnalyser stateCensusAnalyser = new StateCodeAnalyser();
		int recordsNumb = stateCensusAnalyser.LoadIndianCodeData(csvPath);
		assertEquals(640,recordsNumb);	
	}

}
