package quiz26;

import java.io.Reader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

class Data{
	private String region;
	private String area;
	private int year;
	private int month;
	private int price;

	Data () {
		price = -1;
	}

	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return region + ", " + area + ", " + year + ", " + month + ", " + price;
	}


}

public class RamdaQuiz01 {
	public static void main(String[] args) {
		/*
		 * 1. BufferedReader클래스를 사용해서 파일을 읽어들이세요.
		 * 2. ,기준으로 잘라서 Data클래스에 값을 한줄 단위로 저장한다.
		 *    결측치 -> 빠진값
		 * 3. 람다식을 이용해서, 지역이 서울, 짝수 월, 분양가격은 4000이상의 객체만 뽑아서
		 *    새로운 리스트에 저장
		 */
		try (BufferedReader br = new BufferedReader(new InputStreamReader
				(new FileInputStream("주택도시보증공사_전국 평균 분양가격(2020년 2월).csv"), "EUC-KR") )) {

			String str = "";
			List<Data> list = new ArrayList<>();


			str = br.readLine();

			while((str = br.readLine()) != null) {
				str = str.trim();
				String[] temp = str.split(",");
				Data tempData = new Data();
				tempData.setRegion(temp[0]);
				tempData.setArea(temp[1]);
				tempData.setYear(Integer.parseInt(temp[2]));
				tempData.setMonth(Integer.parseInt(temp[3]));
				if(temp.length >= 5) {
					temp[4] = temp[4].replace("\"","");
					temp[4] = temp[4].replace("-","-1");
					tempData.setPrice(Integer.parseInt(temp[4]));
				}
				
				list.add(tempData);
			}

			List<Data> result = list.stream()
					.filter((s) -> s.getRegion().equals("서울") && s.getMonth() % 2 == 0 && s.getPrice() >= 4000)
					.collect(Collectors.toList());

			int count = 1;
			for(Data line : result) {
				System.out.print(count + ": " + line.getRegion() + "," + line.getArea() + ","
						+ line.getYear() + "," + line.getMonth() + "," + line.getPrice());
				System.out.println();
				count++;
			}

		} catch(IOException e) {
			System.out.println(e);
		}

	}
}
