package Java01.sec01_5번;

import java.util.Objects;

public class Student
{
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}

	//코드작성
	@Override
	public int hashCode()
	{
		return studentNum.hashCode();
		//return Objects.hash(studentNum);
	}

	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(studentNum.equals(student.getStudentNum())) {
				return true;	//같다고 최종판결
			}
		}
		return false;
	}
}
