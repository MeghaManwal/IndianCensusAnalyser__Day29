package com.codeanalyser;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class StateCodeAnalyser {
	
	public static  int LoadIndianCodeData(String csvPath) throws IOException {
		Reader reader;
		reader = Files.newBufferedReader(Paths.get(csvPath));
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		CsvToBean <IndianCodeCSV> csvToBean = new CsvToBeanBuilder(reader)
                                             .withType(IndianCodeCSV.class)
                                             .withIgnoreLeadingWhiteSpace(true)
                                             .build();
		Iterator<IndianCodeCSV> codeCSVIterator = csvToBean.iterator();;
		int entries = 0;
		
		while(codeCSVIterator.hasNext()) {
			entries++;
			@SuppressWarnings("unused")
			IndianCodeCSV codeData = codeCSVIterator.next();
		}
		return entries;
	}
	
}
