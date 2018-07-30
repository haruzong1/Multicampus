package a_datatype;

public class string {

	public static void main(String[] args) {
		// 클래스  -참조형
		// 반드시 new 이용
	String a= new String ("홍길동");
	String b= new String ("홍길동");
	if(a == b) {
		System.out.println("같다");
	}
	else {
		System.out.println("다르다");
	}
	if( a.equals(b)) 
	{
		System.out.println("이름동일");
		
	}
	
	}

}
