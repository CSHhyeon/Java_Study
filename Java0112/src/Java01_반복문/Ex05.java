package Java01_반복문;

public class Ex05
{

	public static void main(String[] args)
	{
		for(int i = 1; i <= 100; i++) {
			System.out.printf("%d %% 10 = %d%n", i, i % 10);	 
			System.out.printf("%d %% 30 = %d%n",i, i % 30);
			System.out.printf("%d %% 10 %% 3 = %d%n",i, i % 10 % 3); 
		}
		
		/*
		int tmp = 33;
		System.out.println(tmp % 10);	 //tmp = 33일 때 3
		System.out.println(tmp % 10 % 3);//tmp = 33일 때 0
		System.out.println(tmp % 30);    //tmp = 33일 때 3

		System.out.println(34 % 10);	 //4
		System.out.println(34 % 10 % 3); //1
		System.out.println(34 % 30);	 //4
		
		System.out.println(3 % 10);	     //3
		System.out.println(3 % 10 % 3);  //0
		System.out.println(3 % 30);		 //3
		
		System.out.println(4 % 10);	 	 //4
		System.out.println(4 % 10 % 3);  //1
		System.out.println(4 % 30);		 //4
		
		System.out.println(60 % 10);	 //0
		System.out.println(60 % 10 % 3); //0
		System.out.println(60 % 30);	 //0
		*/
	}

}
