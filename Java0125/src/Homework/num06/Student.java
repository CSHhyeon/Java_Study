package Homework.num06;

public class Student
{
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	//해시코드는 학번
	public int hashCode() {
		return studentNum;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(this.studentNum == student.studentNum) return true;
		}
		return false;
	}
}
