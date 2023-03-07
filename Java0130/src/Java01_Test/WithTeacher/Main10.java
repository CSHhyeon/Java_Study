package Java01_Test.WithTeacher;

public class Main10
{
	public static void solution(String[] text) {
		for(int i = 0; i < text.length; i++) {
			int n = Integer.parseInt(text[i].strip().replace(" ", "").replace("+", "1").replace("-", "0"), 2);	//strip() : 공백 제거
			text[i] = String.valueOf((char)n);
			System.out.print(text[i]);
		}
	}
	
	public static void main(String[] args)
	{
		String[] text = {
				"	+ -- + - + -   ",
				"	+ --- + - +   ",
				"	+ -- + - + -   ",
				"	+ - + - + - +   "
		};
		solution(text);
	}

}
