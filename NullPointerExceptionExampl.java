package exam;

public class NullPointerExceptionExampl {

	public static void main(String[] args) {
		
		/* 
		int[] intArray = null;
		//intArray[0] = 10;	//-> NullPointException
		
		String str = null;
		//System.out.println("총 문자 수 : " + str.length()); //-> NullPointException
		 */
		
		
		
		String subject = "자바 프로그래밍";
		int index = subject.indexOf("프로그래밍");
		System.out.println(index);
		
		//boolean result = subject.contains("프로그래밍");
		//System.out.println(result);
		
		
		
		
	}

}
