package java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestDateTimeApi {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		//format the date or time
		
		//DateTimeFormatter formatter= date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		
	}

}
