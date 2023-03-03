package Java02_제너릭.sec01.generic;
//제너릭타입은 결정되지 않은 타입을 파라미터로 가지는 클래스와 인터페이스를 말한다.
//public class 클래스명<A, B, C...>{...}
//public interface 인터페이스명<A, B, C...>{...}

class Product<K, M>{	//타입파라미터로 K와 M 정의
	private K kind;
	private M model;	//타입파라미터를 필드 타입으로 정의했다. -> Product 클래스에 다양한 종류와 모델 제품을 저장하기 위해
	public K getKind()
	{
		return kind;
	}
	public void setKind(K kind)
	{
		this.kind = kind;
	}
	public M getModel()
	{
		return model;
	}
	public void setModel(M model)
	{
		this.model = model;
	}
	
}

class Tv{
	@Override
	public String toString()
	{
		return "티비입니다.";
	}
}

class Radio{
	@Override
	public String toString()
	{
		return "파라소닉 라디오입니다.";
	}
}

public class Java02_ProductExample
{
	public static void main(String[] args)
	{
		//K는 Tv로 대체, M은 스트링으로 대체
		Product<Tv, String> p1 = new Product<>();
		p1.setKind(new Tv());
		p1.setModel("삼성스마트 TV");
		
		//Getter의 리턴값은 Tv와 모델이 제공됨
		Tv tv = p1.getKind();
		String tvmodel = p1.getModel();
		
		System.out.println(tv + " : " + tvmodel);
		
		//K는 Radio로 대체, M은 "파라소닉" -> 출력 시 "파라소닉 라디오입니다."라고 오버라이딩
		Product<Radio, String> p2 = new Product<>();
		p2.setKind(new Radio());
		p2.setModel("Parasonic1977");
		
		Radio radio = p2.getKind();
		String radiomodel = p2.getModel();
		System.out.println("radio => " + radio + " model : " + radiomodel);
	}
}
