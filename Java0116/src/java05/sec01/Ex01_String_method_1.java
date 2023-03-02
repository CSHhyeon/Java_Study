package java05.sec01;

public class Ex01_String_method_1
{

	public static void main(String[] args)
	{
		String ssn = "9906122345123";
		char sex = ssn.charAt(6); //string의 6번째에 있는 것 받아오기
		switch(sex) {
		case '1' :
		case '3' :
			System.out.println("남자");
			break;
		case '2' :
		case '4' :
			System.out.println("여자");
			break;
		}

	}

}
