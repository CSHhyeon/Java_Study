package Java02_for_to_while;

public class Ex08
{

	public static void main(String[] args)
	{	
		int i = 0;
		while(i < 5) {
			int j = 2;
			while(j < 7) {
				System.out.printf("%d ", i + j);
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
