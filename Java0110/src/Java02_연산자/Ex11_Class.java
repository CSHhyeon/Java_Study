package Java02_연산자;

class Person{
	int height;
	String gender;
	
	public void printInfo(String name) {
		System.out.println(name);
	}
}

public class Ex11_Class
{
	public static void main(String[] args)
	{
		//객체 지향 프로그래밍
		Person minho = new Person();
		Person yujin = new Person();
		minho.height = 169;
		minho.gender = "남자";
		
		if(minho.height == 169 && minho.gender.equals("남자")) {
			minho.printInfo("내 이름은 민호야!");
		}
		
		yujin.height = 150;
		yujin.gender = "여자";
		
		if(yujin.height == 150 && yujin.gender.equals("여자")) {
			yujin.printInfo("내 이름은 유진이야!");
		}
		
		/*
		int height = 169;
		String sex = "남자";
		
		int minho_h = 169;
		int yujin_h = 150;
		String s1 = "남자";
		String s2 = "여자";
		
		if(height == minho_h && s1.equals(sex)) {
			System.out.println("민호");
		}
		else if(height == yujin_h && s2.equals(sex)) {
			System.out.println("유진");
		}*/
	}
}
