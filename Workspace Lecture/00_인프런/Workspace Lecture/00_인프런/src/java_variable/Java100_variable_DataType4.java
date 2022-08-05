package java_variable;
//System.out.print(),println(),printf() 등에 대한 예제.
// 이 문제는 출력시 많이 사용되는 print(),println(),printf() 형식에 대해 알고 있는 지를 묻는 문제.
public class Java100_variable_DataType4 {

	public static void main(String[] args) {
		
		// [1] : 기본형 타입--> 8개--> 변수 선언과 동시에 값을 입력
		byte b=26;
		short s=32767;
		int i=210000000;
		long l=7000000000L;
		float f=9.8F;
		double d=3.14;
		char c='A';
		boolean bl=false;
		
		// [2] : print(),println()
		System.out.print("안녕하세요~");
		System.out.print(" 홍길동이고, 저는 학생입니다.");
		System.out.println("안녕하세요~");
		System.out.println("홍길동이고 저는 학생입니다.");	 //SYSOUT치고 ctrl + space bar을 누르면 자동완성됨
		
		// [3] : printf() 출력 --> 지시자를 사용
		// %d(정수), %f(소숫점 형식), %c(문자), %s(문자열), %b(부울), %n(줄바꿈),%e(지수),%o(8진수),%x(16진수)
		System.out.printf("난 %d살의 대학생입니다. %d,%d,%d 소숫점 형식 -->%.2f,%.115f,문자 --> %c,%b, %n",b,s,i,l,f,d,c,bl);
		System.out.printf("%n");
		System.out.printf("난 %d살의 취준생입니다. %d년동안 후회없는 삶을 살았다고는 할 수 없지만 열심히 살았다고 생각합니다. %c학점은 아니지만 그래도 학교생활을 열심히 했다고 생각합니다.",b,b,c);
		System.out.println();
		b=16;
		System.out.printf("10진수 10은 8진수로 %o이고, 16진수로는 %x이다.",b,b); //왜 16진수로 하면 a가 나올까?=> 0~9 그리고 10부터 a가 된다. 그럼 b의 값이 11일 경우는 b가 되고 15는 f가 된다. 16은  10이 나온다.
		System.out.println();
		System.out.printf("10진수 10은 8진수로 %o이고, 16진수로는 %x이다.",b,15);
		

	}

}
