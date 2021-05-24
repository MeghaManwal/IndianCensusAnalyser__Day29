package com.codeanalyser;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.censusanalyser.CensusAnalyserException;
import com.censusanalyser.StateCensusAnalyser;

public class StateCodeAnalyser_test {
	
	private static final String csvPath ="C:\\Users\\Varsha Manwal\\Desktop\\BridgeLabz\\Fellowship\\Day29_IndianStatesCensusAnalyzer\\StateCensusAnalyser\\Data\\codeFile.csv";
	private static final String csvWrongPath ="C:\\Users\\Varsha Manwal\\Desktop\\BridgeLabz\\Fellowship\\Day29_IndianStatesCensusAnalyzer\\StateCensusAnalyser\\codeFile.csv";
	
	@Test
	public void givenCodeCsvFile_returnCorrectRecords() throws IOException, CodeAnalyserException {
		StateCodeAnalyser stateCodeAnalyser = new StateCodeAnalyser();
		int recordsNumb = stateCodeAnalyser.LoadIndianCodeData(csvPath);
		assertEquals(640,recordsNumb);	
	}
	
	@Test
	public void given_IndiaCodeData_CsvFile_ShouldThrowException() throws IOException {
		try {
			StateCodeAnalyser stateCodeAnalyser = new StateCodeAnalyser();
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(CensusAnalyserException.class);
			stateCodeAnalyser.LoadIndianCodeData(csvPath);
		} catch(CodeAnalyserException e) {
		    assertEquals(CodeAnalyserException.ExceptionType.Csv_File_Problem, e.type);
		}
	}

}
