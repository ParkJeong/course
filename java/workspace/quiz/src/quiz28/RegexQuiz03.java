package quiz28;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class Product{
	private String day;
	private String store;
	private String grade;
	private String detail;
	private String price;
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}

public class RegexQuiz03 {
	
	// 엑셀 생성
	public static void excel(List<Product> list) {
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		// 워크시트 생성
		XSSFSheet sheet = workbook.createSheet();
		
		// 행 생성
		XSSFRow row = sheet.createRow(0);
		
		// 셀 생성
		XSSFCell cell;
		
		cell = row.createCell(0);
		cell.setCellValue("날짜");
		
		cell = row.createCell(1);
		cell.setCellValue("지점");

		cell = row.createCell(2);
		cell.setCellValue("등급");

		cell = row.createCell(3);
		cell.setCellValue("상세정보");

		cell = row.createCell(4);
		cell.setCellValue("가격");
		
		
		// 데이터 정보 구성
		Product vo;
		for(int i = 0; i < list.size(); i++) {
			vo = list.get(i);
			
			row = sheet.createRow(i + 1);
			cell = row.createCell(0);
			cell.setCellValue(vo.getDay());
			
			cell = row.createCell(1);
			cell.setCellValue(vo.getStore());
			
			cell = row.createCell(2);
			cell.setCellValue(vo.getGrade());
			
			cell = row.createCell(3);
			cell.setCellValue(vo.getDetail());

			cell = row.createCell(4);
			cell.setCellValue(vo.getPrice());
		}
		
		try(FileOutputStream fos = new FileOutputStream("test2.xlsx")){
			workbook.write(fos);
		} catch(IOException e) {
			
		}
	}
	
	public static void main(String[] args) {
		/*
		 * 1. day, store, grade, detail, price를 멤버로 갖는 Product클래스를 생성
		 * 2. Product 클래스는 getter, setter를 생성
		 * 3. BufferedReader를 사용해서 건담.txt파일을 읽어들인다.
		 * 4. 패턴별로 Product에 저장훈 후에 리스트에 추가
		 * 
		 * 5. 외부 라이브러리를 사용해서 xlsx엑셀파일로 추출하면 된다.
		 */

		try(BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream("건담.txt"), "UTF-8"));
				FileOutputStream fos = new FileOutputStream("test.xlsx")){
			
			String dayPattern = "[0-9]{8}-[0-9]{2}-[0-9]+";
			String storePattern = "건담[ㄱ-힣]* [ㄱ-힣]+점?";
			String gradePattern = "\\[[A-Z]*[ㄱ-힣]*\\]";
			String pricePattern = "[0-9]*,?[0-9]+원";
			
			String line;
			String day;
			String store;
			String grade;
			String detail;
			String price;
			
			ArrayList<Product> products = new ArrayList<>();

			while((line = br.readLine()) != null) {
				Product product = new Product();
				Matcher dayMatcher = Pattern.compile(dayPattern).matcher(line);
				Matcher storeMatcher = Pattern.compile(storePattern).matcher(line);
				Matcher gradeMatcher = Pattern.compile(gradePattern).matcher(line);
				Matcher priceMatcher = Pattern.compile(pricePattern).matcher(line);
//				detail = line.split("\\[[A-Z]*[ㄱ-힣]*\\]")[1].split(pricePattern)[0].trim();
				
				if(dayMatcher.find() && storeMatcher.find() && gradeMatcher.find() && priceMatcher.find()) {
					day = dayMatcher.group();
					store = storeMatcher.group();
					grade = gradeMatcher.group();
					price = priceMatcher.group();
					detail = line.substring(gradeMatcher.end() + 1, priceMatcher.start() - 1);
	
					product.setDay(day);
					product.setStore(store);
					product.setGrade(grade);
					product.setDetail(detail);
					product.setPrice(price);
					
					products.add(product);
				}

			}
			// 엑셀 생성 호출
			excel(products);
			
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("건담");
			XSSFRow curRow;
			XSSFCell cell = null;
			int row = products.size();
			
			// Title
			curRow = sheet.createRow(0);
			cell = curRow.createCell(0);
			cell.setCellValue("건담 정보");
			
			// Head
			curRow = sheet.createRow(1);
			cell = curRow.createCell(0);
			cell.setCellValue("day");
			
			cell = curRow.createCell(1);
			cell.setCellValue("store");
			
			cell = curRow.createCell(2);
			cell.setCellValue("grade");
			
			cell = curRow.createCell(3);
			cell.setCellValue("detail");
			
			cell = curRow.createCell(4);
			cell.setCellValue("price");
			
			//Body
			for(int i = 2; i < row + 2; i++) {
				curRow = sheet.createRow(i);
				
				cell = curRow.createCell(0);
				cell.setCellValue(products.get(i-2).getDay());
				

				cell = curRow.createCell(1);
				cell.setCellValue(products.get(i-2).getStore());
				

				cell = curRow.createCell(2);
				cell.setCellValue(products.get(i-2).getGrade());
				

				cell = curRow.createCell(3);
				cell.setCellValue(products.get(i-2).getDetail());
				

				cell = curRow.createCell(4);
				cell.setCellValue(products.get(i-2).getPrice());
			}
			
			workbook.write(fos);
			System.out.println("끝");
			
			
		} catch(IOException e) {
			System.out.println(e);
		}
			
	}
}
