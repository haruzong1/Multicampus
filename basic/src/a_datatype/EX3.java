package a_datatype;

public class EX3 
{

	public static void main(String[] args) 
	{
		//정수형 병수 kor 생성
		//kor 변수에 30 대입 
		
		//정수형 변수 eng 생성시, 30대입 
		int kor;
		kor = 30;
		//정수형 변수 eng 생성시 30대입
		int eng = 40; //초기화
		
		if (kor == eng) 
		{
				System.out.println("두정수 동일");
		}		
		else
		{
			System.out.println("두정수 다름");
					
		}
		//국어 점수와 영어점수 바꾸기
		System.out.println("국어;" +kor +",영어" + eng);
		
		System.out.printf("국어;%d, 영어: %d" , kor, eng);
		
		int temp = kor;
		kor = eng;
		eng = temp;
		
		System.out.printf("국어;%d, 영어: %d" , kor, eng);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		

	}

}
