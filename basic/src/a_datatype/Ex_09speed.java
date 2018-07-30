package a_datatype;

public class Ex_09speed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long start = 0L;
		long end = 0L;
		//string 문자열 추가 
		
		String str = "";
		
		start = System.currentTimeMillis();
		for(int i=0; i<50000; i++) {
			str=str +"A";
			
		}
		//string buffer 문자열 추가 
		StringBuffer sb = new StringBuffer("");
		start = System.currentTimeMillis();
		for(int i=0; i<50000; i++)
		{
			sb.append("A");
			
		}
		end = System.currentTimeMillis()-start;
		System.out.println("StringBuffer;" + end);
		
	}

}
