package java_operator;
// ��ġ �����ڸ� ����� ���꿡�� �Ҽ��� ����� ����� �ٸ��� ������ �Ϳ� ���ؼ� �����ϱ�
// �� ������ �ڹ��� �⺻���� ��ġ �����ڿ� ���ؼ� �˰� �ִ����� ���� ����

public class Java100_operator_ArithmeticOperators2 {
	public static void main(String[]args) {
		
		// [!] : ������ ��� --> ���������� �������� ��� �Ҽ��� ���°� ���� �� ����.
		int a=60, b=8;
		int rst1; double rst2,rst3,rst4;
		
		rst1=a/b;
		System.out.println(rst1); //7.5�� �ƴ϶� 7�� ���. -->Ÿ���� �������̹Ƿ�--> �Ǽ������� ��ȯ.
		System.out.println((double)rst1); //7.5�� �ƴ϶� 7.0�� ���--> ���� �޴� ������ �Ǽ������� �ϴ��� ���ϴ� ����� ������ ���Ѵ�.
		
		rst2=a/(double)b; // ��� �� ���� ���� double Ÿ������ ��ȯ(�� �� double�� ����ȯ�ص� ��).
		System.out.println(rst2); // 7.5
		
		rst3=100/3;
		System.out.println(rst3); // 33.0(rst3�� doubleŸ���̱� ������ 33�� �ƴ� 33.0���� ���)
		
		// ���� 33 �� �Ҽ��� �Ʒ��ڸ����� ǥ���ϰ� �ʹٸ�?
		// ��� 1
		rst3=100/(double)3;
		System.out.println(rst3); // �յ� �� �� �� ���� ���� �ٲ��ְų� �� �� �ٲ��൵ �ȴ�.
		
		// ��� 2
		rst4=100.0/3;
		System.out.println(rst4); 
		
		// �� ���� ��ճ���(�Ҽ��� ���� ����)
		
		// �� ���� ��ճ���(�Ҽ��� �� ���ڸ����� ǥ��), printf()(=printformat())����ϱ�
		a=75;b=25;
		int c=93;
		rst4=(a+b+c)/3.0;
		
		System.out.printf("�������� ��� ������ %.3f�Դϴ�.",rst4);
		
		
		
		
		
	}

}
