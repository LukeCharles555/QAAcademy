package seatPlan;

import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class SeatingPlan {

	public static void main(String[] args) throws IOException {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Seating Plan");
		ArrayList<String> names = NameArray.nameShuffler();
		Object[][] bookData = {
				{"Front Left", "Column 6", "Column 5", "Column 4", "Column 3", "Column 2", "Column 1"},
				{"Row 1", names.get(0), names.get(1), names.get(2), names.get(3), names.get(4), names.get(5)},
				{"Row 2", names.get(6), names.get(7), names.get(8), names.get(9), names.get(10), names.get(11)},
				{"Row 3", names.get(12), names.get(13), names.get(14), names.get(15), names.get(16), names.get(17)},
				{"Row 4", names.get(18), names.get(19), names.get(20), names.get(21), names.get(22), "Back Right"}
		};
		   int rowCount = 0;
	        for (Object[] aBook : bookData) {
	            Row row = sheet.createRow(++rowCount);
	            int columnCount = 0;
	            for (Object field : aBook) {
	                Cell cell = row.createCell(++columnCount);
	                if (field instanceof String) {
	                    cell.setCellValue((String) field);
	                } else if (field instanceof Integer) {
	                    cell.setCellValue((Integer) field);
	                }
	            }
	        }
	        try (FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Seating Plan.xls")) {
	            workbook.write(outputStream);
		
		
	}
}
}
