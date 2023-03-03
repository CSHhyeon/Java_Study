package Java02_제너릭.sec02.num03_와일드카드;

public class CourseEx
{
	public static void main(String[] args)
	{
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		
		//학생만 가능
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<Student>(new HighStudent()));
		Course.registerCourse2(new Applicant<Student>(new MiddleStudent()));
		
		//직장인 및 일반인만 가능
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
	}
}
