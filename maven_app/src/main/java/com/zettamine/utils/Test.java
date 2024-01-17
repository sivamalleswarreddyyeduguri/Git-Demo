package com.zettamine.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Test {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(10,20,13,17,18);
		
		
		  //natural sorting
		  List<Integer> sort = l.stream().sorted().collect(Collectors.toList());
		  
		  System.out.println(sort);
		  
		  
		  
		  
		  //Customized sorting
		  List<Integer> sortComparator = l.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		  System.out.println(sortComparator);
		  
		  
		
		  
		  
		 List<Integer> data = l.stream().filter(a-> a%2==0).collect(Collectors.toList());
		 
		 System.out.println(data);
		 
		 
		 
		 
		 
		 
		 // list of integers to list of string
		 List<String> collect = l.stream().map(a-> a.toString()).collect(Collectors.toList());
		
		
		 
		 
		 
		  //converting list of list of integers to list of integers
		 
		 List<Integer> l1 = List.of(1,2,3);
		 List<Integer> l2 = List.of(4,5,6);
		 List<Integer> l3 = List.of(7,8,9);
		 
		 List<List<Integer>> list = List.of(l1,l2,l3);
		 
		List<Integer> collect2 = list.stream().flatMap(b->b.stream()).collect(Collectors.toList());
		 System.out.println(collect2);

		 
		 
		 
		 
		 
		 List<Integer> arr = Arrays.asList(10,20,30,40);
		 
		 Integer[] arrData = l.stream().toArray(Integer[]::new);
		 
		 Stream.of(arrData).forEach(e->System.out.println(e));
		 
		 
		 List<String> names = Arrays.asList("apple","bananna");
		 
		 String s = "apple";
		 
		names.stream().filter(name->name.equalsIgnoreCase(s)).collect(Collectors.toList()).forEach(e->System.out.println(e));
		 
		       
		
		  
	}
    
	
}
