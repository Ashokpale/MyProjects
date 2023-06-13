package com.student;

import java.util.ArrayList;
import java.util.List;


public class StudentManagmentSystem {
	
	private List <Student>students;
	
	public StudentManagmentSystem(){
		students = new ArrayList<>();
		
	}
	
	public void addStudent(Student student){
		students.add(student);
	}
	
	public void StudentInformation(int roll_number){
		
		for(Student student : students){
			if(student.getRoll_number() == roll_number){
				System.out.println("Name:" + student.getName());;
				System.out.println("Roll Number:" + student.getRoll_number());
				System.out.println("Grade:" + student.getGrade());
				System.out.println("Attendenace:" + student.getAttendance());
				return;
			}
			
		}
		
		System.out.println("Student with Roll Number" + roll_number + "Not Found.");
		
	}
	
	 public void updateStudentGrade(int rollNumber, String grade) {
	        for (Student student : students) {
	            if (student.getRoll_number() == rollNumber) {
	                student.setGrade(grade);
	                System.out.println("Grade updated for student with roll number " + rollNumber);
	                return;
	            }
	        }
	        System.out.println("Student with roll number " + rollNumber + " not found.");
	    }
	
	public void updateStudentAttendance(int roll_number, int attendance){
		
		for(Student student:students){
			
			if(student.getRoll_number()==roll_number){
				student.setAttendance(attendance);
				System.out.println("Attendance updated for student with roll number " + roll_number);
				 return;
				
			}
			
		}
		
		System.out.println("Student with Roll Number" + roll_number + "Not Found.");
	}



   public void generateReport(){
	   
	   System.out.println("Student Report:");
       for (Student student : students) {
           System.out.println("Name: " + student.getName());
           System.out.println("Roll Number: " + student.getRoll_number());
           System.out.println("Grade: " + student.getGrade());
           System.out.println("Attendance: " + student.getAttendance());
           System.out.println("-----------------------");
   }
   }
}
	   
	   



