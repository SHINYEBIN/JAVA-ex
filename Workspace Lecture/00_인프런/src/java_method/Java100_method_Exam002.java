package java_method;
// ��ȯ���� ���� �޴� ���ڰ��� 2�� �ִ� ���� �޼��带 �����ϱ�.
// �� ������ �ڹ��� �޼��� �ۼ����� ��ȯ��, ���ڰ��� ���� ���ذ� �ִ����� ���� ����

public class Java100_method_Exam002{
	
	public static void plusMethod(int a, int b) {
		// �ܼ� ���
		System.out.printf("���ڷ� �Ѱܹ��� 2���� ���� %d�� %d�Դϴ�.%n",a,b);
		
		// ���� ���
		int res=a+b;
		System.out.println("�� ���� ���� ���� = "+res);
	
	}
	
	public static void main(String[] args) {
		
		// [2] : ��ȯ�� -->X          �޴� ���ڰ� --> O
		// �޼� �尡 �޴� ���ڰ��� �ִٴ� ���� ȣ��ο��� �Ķ���� ���� �ѱ�ٴ� ��.
		int a=100, b=200;
		plusMethod(a,b);
		
		
	}
}