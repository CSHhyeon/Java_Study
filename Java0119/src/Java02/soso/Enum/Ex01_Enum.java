package Java02.soso.Enum;

enum MySeason{ SPRING, SUMMER, FALL, WINTER }
enum Human_Sex{ MAN, WOMAN, OTHER }

public class Ex01_Enum
{
	public static void main(String[] args)
	{
		createThing(Human_Sex.MAN);	//열거형이라서 직접 넣기 가능
		
	}
	
	public static void createThing(Human_Sex s) {
		switch(s) {
		case MAN:
			System.out.println("남성");
			break;
		case WOMAN:
			System.out.println("여성");
			break;
		default:
			System.out.println("other");
		}
	}
}

// 열거형(enum) : 서로 관련된 상수들을 모아 놓고 대표할 수 있는 이름을 정의한 것 ex) 계절, 요일, 직급

