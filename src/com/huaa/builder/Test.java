package com.huaa.builder;

/**
 * This class used for test builder pattern
 * 
 * @author Huaa
 * @date 2018-06-09 23:19
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student.Builder().setId(12345).setName("huaa").setAddress("shanghai")
				.setPassword("huaa1234").setGender("male").build();
		System.out.println(student.toString());

	}

}
