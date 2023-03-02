package Java01_객체;

public class Ex04_NPCMain
{

	public static void main(String[] args)
	{
		Ex04_NPC hp1 = new Ex04_NPC(); //new : 객체를 생성하는 명령어, Ex04_NPC() 생성자 호출
		hp1.say();
		
		Ex05_Goods goods = new Ex05_Goods();
		goods.color = "red";	//객체의 멤버, 기능에 접근할 때 우리는 . 을 이용하여 접근한다.
		goods.num = 1;
		
		//goods.code = "1111";    //-> private 변수라 직접 접근 불가능!
		goods.setCode("111");
		String code = goods.getCode();
		System.out.println(code); //System.out.println(goods.getCode());라고 해도 괜찮다.
		
		String id = "111";
		String pwd = "111";
		if(id.equals("111") && pwd.equals("111")) {
			goods.setCode("111");
		}
		

	}

}
