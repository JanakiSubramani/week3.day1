package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Name of the student is: ");
	}

	public void studentDept() {
		System.out.println("Department of the student is: ");
	}
	
	public void studentId() {
		System.out.println("ID of the student is: ");
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		System.out.println(".......................");
		s.deptName();
		System.out.println(".......................");
		s.studentId();
		s.studentName();
		s.studentDept();
		
	}
}
