package Java02_map.sec06_Properties;

import java.io.IOException;
import java.util.Properties;

public class PropertiesExample
{
	public static void main(String[] args) throws IOException
	{
		//Properties 컬렉션 생성
		Properties pro = new Properties();
		
		//database.properties 파일 로드
		pro.load(PropertiesExample.class.getResourceAsStream("database.properties"));
		
		//주어진 키에 대한 값을 읽기
		String driver = pro.getProperty("driver");
		String url = pro.getProperty("url");
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		
		//값 출력
		System.out.println("driver = " + driver);
		System.out.println("url = " + url);
		System.out.println("username = " + username);
		System.out.println("password = " + password);
	}
}
