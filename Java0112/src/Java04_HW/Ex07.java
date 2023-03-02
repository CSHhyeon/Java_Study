package Java04_HW;
import java.util.Scanner;

public class Ex07
{

	public static void main(String[] args)
	{
		//아직 못 풀음
		Scanner sc  = new Scanner(System.in);
		char[] include = new char[100]; 
		int[] num = new int[26];
		char input;
		int i = 0;
		
		while(true) {
			input = sc.next().charAt(0);
			if(input >= 'A' && input <= 'Z') {
				include[i] = input;
				i++;
			}
			else {
				for(int a = 0; a < i; a++) {
					switch(include[a]) {
					case 65 : num[0]++; break;
					case 66 : num[1]++; break;
					case 67 : num[2]++; break;
					case 68 : num[3]++; break;
					case 69 : num[4]++; break;
					case 70 : num[5]++; break;
					case 71 : num[6]++; break;
					case 72 : num[7]++; break;
					case 73 : num[8]++; break;
					case 74 : num[9]++; break;
					case 75 : num[10]++; break;
					case 76 : num[11]++; break;
					case 77 : num[12]++; break;
					case 78 : num[13]++; break;
					case 79 : num[14]++; break;
					case 80 : num[15]++; break;
					case 81 : num[16]++; break;
					case 82 : num[17]++; break;
					case 83 : num[18]++; break;
					case 84 : num[19]++; break;
					case 85 : num[20]++; break;
					case 86 : num[21]++; break;
					case 87 : num[22]++; break;
					case 88 : num[23]++; break;
					case 89 : num[24]++; break;
					case 90 : num[25]++; break;
					}
				}
				for(int b = 0; b < 26; b++) {
					if(num[b] != 0) {
						System.out.printf("%c : %d%n", b + 65, num[b]);
					}
				}
				break;
			}
		}
		

	}

}
