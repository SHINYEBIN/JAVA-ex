package java_operator;
// ��ġ�����ڿ� ���� ����.
// �� ������ �ڹ��� �⺻���� ��ġ �����ڿ� ���ؼ� �˰� �ִ����� ���� ����.

public class Java100_operator_ArithmeticOperators {

	public static void main(String[] args) {
		// [1] : ��ġ ������ --> +,-,*,/(��),%(������ ������)
		int a, b, c, d;
		a=60; b=8; c=300; d=400;
		int rs=a+b;
		System.out.println(a + b);
		System.out.println("a + b =" + a+b);  // a+b=68�� �ƴ϶� 608�� ���´�...!
		System.out.println("a + b =" + (a+b)); // a+b=68
		System.out.println("a + b =" + rs); // ������ ������ �����(68)�� �����Ͽ� ���.
		System.out.println("a - b =" + (a-b)); // a-b=52
		System.out.println("a * b =" + (a*b)); // a*b=480
		System.out.println("a / b =" + (a/b)); //a/b=7(��)
		System.out.println("a % b = " + (a%b)); // a%b=4(������)
		
		
	}

}
