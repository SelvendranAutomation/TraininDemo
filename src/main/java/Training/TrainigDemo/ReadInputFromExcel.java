package Training.TrainigDemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class ReadInputFromExcel {
	private String id=null;
	private String city=null;
	private String st=null;
	private String lat_n=null;
	private String long_w=null;

	String inputFilePath="C:\\Users\\DELL\\Desktop\\inputRead.xls";
	ArrayList<InputFormat> arrList=new ArrayList<InputFormat>();
	InputFormat ip=null;
	Workbook wb=null;
	
	
	public void readExcel(){
		try{
		File f=new File(inputFilePath);
		FileInputStream fis=new FileInputStream(f);
		if(inputFilePath.endsWith(".xslx")){
		wb=new XSSFWorkbook(fis);}
		else if(inputFilePath.endsWith(".xls")){
			wb=new HSSFWorkbook(fis); 	
		}
		Sheet sheet=wb.getSheetAt(0);		
		 
		Iterator<Row> rowIterator=sheet.rowIterator();
		while(rowIterator.hasNext()){
			Row rowAll=rowIterator.next();
			

			Iterator<Cell> celIterator=rowAll.cellIterator();
			
			while(celIterator.hasNext()){
				Cell cell=celIterator.next();
				
				int cellNo=cell.getColumnIndex();
				
				switch(cellNo){
				case 0:
					id=getCellValue(cell);
					break;
				case 1:
					city=getCellValue(cell);
					break;				
				case 2:
					st=getCellValue(cell);
					break;				
				case 3:
					lat_n=getCellValue(cell);
					break;	
				case 4:
					long_w=getCellValue(cell);
					break;				

				}
				
				
				
			}
			ip=new InputFormat(id,city,st,lat_n,long_w);
			arrList.add(ip);
			
			
			
		}
		
		
		}catch(Exception e){
        	 System.out.println(e.getMessage());
         }
		 
	}
     
	
public String getCellValue(Cell cell){
	
	switch(cell.getCellType()){
	case Cell.CELL_TYPE_STRING:
		return cell.getStringCellValue();
		 
	case Cell.CELL_TYPE_NUMERIC:
		return String.valueOf(cell.getNumericCellValue());
		//return ""+cell.getNumericCellValue(); 
	
	}
		return null;
		
		
	}
	
 }
		


