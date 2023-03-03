package Java01.sec06_11번;
import java.util.StringTokenizer;

public class Token
{
	public static void main(String[] args)
	{
		String str = "아이디, 이름, 패스워드";
		StringTokenizer st = new StringTokenizer(str, ", ");
		 while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken());
	     }
	}
}
