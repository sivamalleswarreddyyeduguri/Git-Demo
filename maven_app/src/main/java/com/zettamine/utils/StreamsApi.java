package com.zettamine.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Employee{
	
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
public class StreamsApi {

	public static void main(String[] args) {
		
		  List<Integer> l1 = Arrays.asList(10,20,30,17,16,19);
		
		  List<String> data1 = l1.stream().map(s->s.toString()).collect(Collectors.toList());
			
		  System.out.println(data1);
		
		
		   List<Integer> data2 = l1.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		   System.out.println(data2);
		   
		   
		   Optional<Integer> max = l1.stream().max((a,b)->a.compareTo(b));
		   System.out.println(max.get());
		   
		   
		   Optional<Integer> min = l1.stream().min((a,b)->a.compareTo(b));
		   System.out.println(min.get());
		   
		  
		   OptionalDouble average = l1.stream().mapToInt(Integer::intValue).average();
		   System.out.println(average.getAsDouble());
		   
		   
		   List<List<Integer>> l2 = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6));
		   
		   List<Integer> listOfIntegers = l2.stream().flatMap(p->p.stream()).collect(Collectors.toList());
		   System.out.println(listOfIntegers);
		   
		   Integer[] array = l1.stream().toArray(Integer[]::new);
		   
	}

}
