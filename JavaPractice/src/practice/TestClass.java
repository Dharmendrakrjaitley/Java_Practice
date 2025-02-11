package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls= Arrays.asList("Pune","Nagpur","Bhopal","Raipur");
	    
		   List<String> filteredCity=ls.stream()
		   .filter(s->s.charAt(0)=='R')
		   .collect(Collectors.toList());
		    System.out.println(filteredCity);
		    
		    
		   ls.stream()
		   .filter(s->s.startsWith("R"))
		   .forEach(s->System.out.println(s));
		   
		   ls.stream()
		   .filter(s->s.startsWith("u", 1))
		   .forEach(s->System.out.println(s));
		   


	}

}
