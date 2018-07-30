package a_datatype;

public class Ex_stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열 : String
		//StiringBuffer/StringBuilder
		StringBuffer a = new StringBuffer("홍길동");
		StringBuffer b = new StringBuffer("홍길동");
//상황에 맞게 
//
		b.append("2");

		if(a.equals(b)) 
		{
				System.out.println("이름동일");
		}
		else
		{
			System.out.println("이름다름");
			
		}
		
		
	}

}
