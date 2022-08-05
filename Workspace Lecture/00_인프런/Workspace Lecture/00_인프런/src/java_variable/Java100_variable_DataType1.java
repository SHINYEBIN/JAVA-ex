// 정수, 실수, 문자형 타입의 변수 사용에서


package java_variable;

public class Java100_variable_DataType1 {

	public static void main(String[] args) {
		// (1) 변수 선언
		int a; // 정수가 저장될 변수 이름을 a로 만들어라;
		int b=33;int c=90;
		double d; // 실수가 저장될 변수 이름을 d로 만들어라;
		char e; // 문자가 저장될 변수 이름을 e로 만들어라;
		
		// (2) 선언된 변수에 값을 대입
		a=10;
		d=10;	// 정수 10을 입력하면 10.0으로 출력;
		e='A';	// 쌍따옴표하면 에러;
		
		//(3) 출력
		System.out.println(a);	//10
		System.out.println(b);	//error
		System.out.println(c);	//90
		System.out.println(d);	//10.0
		System.out.println(e);	//error
		


	}

}



