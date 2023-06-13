package com.student;


	
	
	public class Student {
		 
		
		private String name ;
		private int roll_number;
		private String grade;
		private int attendance;
		
		 Student(String name, int roll_number, String grade, int attedance){
			this.name= name ;
			this.roll_number=roll_number;
			this.grade= grade;
			this.attendance = attedance;
			
			
		}
		public int getAttendance() {
			return attendance;
		}
		public void setAttendance(int attendance) {
			this.attendance = attendance;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRoll_number() {
			return roll_number;
		}
		public void setRoll_number(int roll_number) {
			this.roll_number = roll_number;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		
		
	}


