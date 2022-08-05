package java_operator;
// 수치 연산자를 사용한 연산에서 소숫점 결과가 예상과 다르게 나오는 것에 대해서 설명하기
// 이 문제는 자바의 기본적인 수치 연산자에 대해서 알고 있는지를 묻는 문제

public class Java100_operator_ArithmeticOperators2 {
	public static void main(String[]args) {
		
		// [!] : 연산의 결과 --> 정수끼리라도 나누기의 경우 소숫점 형태가 나올 수 있음.
		int a=60, b=8;
		int rst1; double rst2,rst3,rst4;
		
		rst1=a/b;
		System.out.println(rst1); //7.5가 아니라 7이 출력. -->타입이 정수형이므로--> 실수형으로 변환.
		System.out.println((double)rst1); //7.5가 아니라 7.0이 출력--> 리턴 받는 변수를 실수형으로 하더라도 원하는 결과를 얻지는 못한다.
		
		rst2=a/(double)b; // 어느 한 쪽의 값을 double 타입으로 변환(둘 다 double로 형변환해도 됨).
		System.out.println(rst2); // 7.5
		
		rst3=100/3;
		System.out.println(rst3); // 33.0(rst3이 double타입이기 때문에 33이 아닌 33.0으로 출력)
		
		// 만약 33 뒤 소숫점 아래자리까지 표출하고 싶다면?
		// 방법 1
		rst3=100/(double)3;
		System.out.println(rst3); // 앞뒤 둘 중 한 쪽의 값을 바꿔주거나 둘 다 바꿔줘도 된다.
		
		// 방법 2
		rst4=100.0/3;
		System.out.println(rst4); 
		
		// 세 과목 평균내기(소숫점 이하 생략)
		
		// 세 과목 평균내기(소숫점 뒤 세자리까지 표시), printf()(=printformat())사용하기
		a=75;b=25;
		int c=93;
		rst4=(a+b+c)/3.0;
		
		System.out.printf("세과목의 평균 점수는 %.3f입니다.",rst4);
		
		
		
		
		
	}

}
