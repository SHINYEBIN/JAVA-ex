package java_operator;
// �� ������
// �� ������ �ڹ��� �⺻���� �� �����ڿ� ���ؼ� �˰� �ִ����� ���� ����
public class Java100_operator_LogicalOperators {
	public static void main(String[] args) {
		
		// [!] : �� ������ --> &&, ||(���� ������), !(���� ������)
		// &&(and)			||(or)			!(not)
		// ���� �����ڿ� ���������� ����ν� ������ ���� ��(true), ����(false)���� �����Ƿ� ����� �޴� Ÿ���� boolean
		// A&&B		--> A �׸��� B�� ��� ���̾�߸� ��.
		// A||B		--> A �Ǵ� B �� �� �ϳ��� ���̾�� ��.
		// !A		--> �ݴ��... A�� ���̸� ��������, A�� �����̸� ������.
		
		int a=10,b=20,c=30;
		
		boolean rst1=a<b && c>b; 
		System.out.println(rst1); // true
		
		boolean rst2=a<b || b>c; 
		System.out.println(rst2); // true
		
		boolean rst3=a>c || b!=c;
		System.out.println(rst3); // true
		
		boolean rst4=!rst3;
		System.out.println(rst4); // false
		System.out.println(!rst4); // true
		
		
		
		
	}

}
