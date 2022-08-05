package java_operator;
// 축약된 형태의 연산자를 사용하여 변수 a의 값을 증가시키기
// 이 문제는 수의 연산시 축약된 형태로 사용하는 방법에 대해서 알고 있는지를 묻는 문제이다.

public class Java100_operator_ArithmeticOperators3 {
	public static void main(String[] args) {
		// [!] : 축약된 형태
		int a=0; int b=100;
		
		a=a+1; 
		System.out.println(a); //1
		
		a+=1; // a=a+1과 똑같은 뜻이다. 주로 이걸 많이 사용한다.
		System.out.println(a); //2
		
		a-=1;
		System.out.println(a); //1
		
		b++;
		System.out.println(b); //101
		
		b++;
		System.out.println(b); //102
		
		b--;
		System.out.println(b); //101
		
		
		
	}
}
