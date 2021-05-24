package com.censusanalyser;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;

public class StateCensusAnalyser_test {
	
	private static final String csvPath ="C:\\Users\\Varsha Manwal\\Desktop\\BridgeLabz\\Fellowship\\Day29_IndianStatesCensusAnalyzer\\StateCensusAnalyser\\Data\\censusFile.csv";
	
	@Test
	public void givenCensusCsvFile_returnCorrectRecords() throws IOException {
		StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
		int recordsNumb = stateCensusAnalyser.LoadIndiaCensusData(csvPath);
		assertEquals(640,recordsNumb);	
	}

}
