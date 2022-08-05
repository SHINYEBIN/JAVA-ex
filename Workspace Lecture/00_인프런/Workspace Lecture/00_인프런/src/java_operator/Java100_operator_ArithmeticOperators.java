package java_operator;
// 수치연산자에 대한 설명.
// 이 문제는 자바의 기본적인 수치 연산자에 대해서 알고 있는지를 묻는 문제.

public class Java100_operator_ArithmeticOperators {

	public static void main(String[] args) {
		// [1] : 수치 연산자 --> +,-,*,/(몫),%(나머지 연산자)
		int a, b, c, d;
		a=60; b=8; c=300; d=400;
		int rs=a+b;
		System.out.println(a + b);
		System.out.println("a + b =" + a+b);  // a+b=68이 아니라 608이 나온다...!
		System.out.println("a + b =" + (a+b)); // a+b=68
		System.out.println("a + b =" + rs); // 별도의 변수에 결과값(68)을 저장하여 사용.
		System.out.println("a - b =" + (a-b)); // a-b=52
		System.out.println("a * b =" + (a*b)); // a*b=480
		System.out.println("a / b =" + (a/b)); //a/b=7(몫)
		System.out.println("a % b = " + (a%b)); // a%b=4(나머지)
		
		
	}

}
