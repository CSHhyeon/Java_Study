package Java04_JVM;

//stack 영역에서 변수가 어떻게 처리되는지 확인(Debuging)
//1) break point 지정
//F5(Step Into) -> 메서드가 있으면 그 메소드 내부 코드로 진입해서 실행
//F6(Step Over) -> 메서드를 만나면 메서드 내부 코드로 진입하지 않고 결과만 반환받아 실행한 뒤 다음줄로 넘어감.
public class Ex01_MemoryStack
{
	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 20;
		
		adder(num1, num2);
		System.out.println("-----------------");

	}
	
	public static int adder(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
}
