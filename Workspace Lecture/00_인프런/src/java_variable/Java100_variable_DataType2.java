package java_variable;

public class Java100_variable_DataType2 {

	public static void main(String[] args) {
		
		// [1] : 기본형타입--> 8개 --> 변수 선언과 동시에 값을 입력
		byte b=100;
		short s=30000;
		int i=2100000000;
		long l=7000000000L;
		float f=9.8F;	// 규칙이기 때문에 뒤에 L과 F를 붙여줘야 한다.(대소문자 불문이지만 소문자보다는 대문자를 많이 쓰는 편이다.)
		double d=3.14;
		char c='A';
		boolean bl=false;
		
		//[2] : 출력
		System.out.println(b +"byte 최댓값-->"+Byte.MAX_VALUE);	
		System.out.println(s +"short 최댓값-->"+Short.MAX_VALUE);
		System.out.println(i +"int 최댓값-->"+Integer.MAX_VALUE);
		System.out.println(l +"long 최댓값-->"+Long.MAX_VALUE);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bl);
	}

}
