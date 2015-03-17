package main;

public class Student extends Person{
	public final String grade_status;
	
	public Student( String grade_status) {
		this.grade_status = grade_status;
		

	}
	public String getgrade_status(){
			return grade_status;
	}
}
