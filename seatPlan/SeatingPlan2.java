package seatPlan;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class SeatingPlan2 {

	public static void main(String[] args) throws IOException {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Seating Plan");
		ArrayList<String> names = NameArray.nameShuffler();
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("How long is each row? ");
		int columns = input1.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("How many rows are there? ");
		int rows = input2.nextInt();
		
		String[][] bookData = new String[rows][columns];
		
		
		if (names.size() < rows*columns) {
			for (int i=names.size(); i < rows*columns; i++) {
				names.add("");
			}
		}
		
		for (int i = 0 ; i < rows ; i++) {
			for (int j = 0 ; j < columns ; j++) {
				bookData[i][j] = names.get(j+(i*columns));
			}
		}
		
		int rowCount = 0;
		for (String[] aBook : bookData) {
			Row row = sheet.createRow(++rowCount);
			int columnCount = 0;
			for (String field : aBook) {
				Cell cell = row.createCell(++columnCount);
				cell.setCellValue(field);
			}
		}
		
		try (FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Seating Plan" + rows +"x" + columns +".xls")) {
			workbook.write(outputStream);
		}
	}
}
