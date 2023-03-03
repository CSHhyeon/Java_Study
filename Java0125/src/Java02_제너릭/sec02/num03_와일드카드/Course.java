package Java02_제너릭.sec02.num03_와일드카드;

public class Course
{
	//모든 사람 등록 가능
	public static void registerCourse1(Applicant<?> applicant) {	//모든 사람이 등록 가능하게 ?(와일드카드)사용
		System.out.println(applicant.kind.getClass().getSimpleName() + " 코스 1 등록완료");
	}
	
	//학생만 등록 가능 -> 타입 제한!
	public static void registerCourse2(Applicant<? extends Student> applicant) {	//모든 사람이 등록 가능하게 ?(와일드카드)사용
		System.out.println(applicant.kind.getClass().getSimpleName() + " 코스 2 등록완료");
	}
	
	//직장인 및 일반인만 등록 가능 -> 타입 제한!
	public static void registerCourse3(Applicant<? super Worker> applicant) {	//모든 사람이 등록 가능하게 ?(와일드카드)사용
		System.out.println(applicant.kind.getClass().getSimpleName() + " 코스 3 등록완료");
	}
}
