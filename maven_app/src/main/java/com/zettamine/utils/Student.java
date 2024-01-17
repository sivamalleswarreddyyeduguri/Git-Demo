package com.zettamine.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student
{
	private int roll;
	private String name;
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args){
		List<Student> std=Arrays.asList(new Student(1,"punya"),new Student(2,"siva"),new Student(3,"rohit"));
		
		
		Map<Integer, String> collect = std.stream().collect(Collectors.toMap(Student::getRoll,malli->malli.getName()));
		System.out.println(collect);
	}


}
