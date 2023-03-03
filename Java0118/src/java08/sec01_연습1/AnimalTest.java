package java08.sec01_연습1;

public class AnimalTest
{

	public static void main(String[] args)
	{
		Dog dog = new Dog(8);
		Chicken chicken = new Chicken(3); 
		Chicken cheatableChicken = new Chicken(5);
		if(cheatableChicken instanceof Cheatable) cheatableChicken.fly();
		
		//3시간 동안 매 시간마다 각 객체들의 이동거리 정보 출력
		for(int i = 1; i < 4; i ++) {
			System.out.println(i + "시간 후");
			dog.run(1); chicken.run(1); cheatableChicken.run(1);
			System.out.println("개의 이동거리=" + dog.getDistance());
			System.out.println("닭의 이동거리=" + chicken.getDistance());
			System.out.println("날으는 닭의 이동거리=" + cheatableChicken.getDistance());
		}
	}

}
