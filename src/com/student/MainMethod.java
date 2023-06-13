package com.student;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		StudentManagmentSystem sms = new StudentManagmentSystem();
		
		
		
		while(true){
			
			System.out.println("1. Add Student");
            System.out.println("2. View Student Information");
            System.out.println("3. Update Student Grade");
            System.out.println("4. Update Student Attendance");
            System.out.println("5. Generate Report");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
            case 1:
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                System.out.print("Enter roll number: ");
                int roll_number = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter grade: ");
                String grade = scanner.nextLine();
                System.out.print("Enter attendance: ");
                int attendance = scanner.nextInt();
                scanner.nextLine();
                
                Student student = new Student(name, roll_number, grade, attendance);
                sms.addStudent(student);
                break;
                
            case 2:
                System.out.print("Enter roll number to view student information: ");
                int viewRollNumber = scanner.nextInt();
                scanner.nextLine();
                sms.StudentInformation(viewRollNumber);
                break;
                
            case 3:
                System.out.print("Enter roll number to update grade: ");
                int updateRollNumber = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter new grade: ");
                String newGrade = scanner.nextLine();
                sms.updateStudentGrade(updateRollNumber, newGrade);
                break;
                
            case 4:
                System.out.print("Enter roll number to update attendance: ");
                int updateAttendanceRollNumber = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter new attendance: ");
                int newAttendance = scanner.nextInt();
                scanner.nextLine();
                sms.updateStudentAttendance(updateAttendanceRollNumber, newAttendance);
                break;
                
            case 5:
                sms.generateReport();
                break;
                
            case 6:
                System.out.println("Exiting Student Management System...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;

               
			
		}
				
	}
		
		
	}
}