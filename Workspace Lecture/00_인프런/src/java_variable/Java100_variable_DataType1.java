// ����, �Ǽ�, ������ Ÿ���� ���� ��뿡��


package java_variable;

public class Java100_variable_DataType1 {

	public static void main(String[] args) {
		// (1) ���� ����
		int a; // ������ ����� ���� �̸��� a�� ������;
		int b=33;int c=90;
		double d; // �Ǽ��� ����� ���� �̸��� d�� ������;
		char e; // ���ڰ� ����� ���� �̸��� e�� ������;
		
		// (2) ����� ������ ���� ����
		a=10;
		d=10;	// ���� 10�� �Է��ϸ� 10.0���� ���;
		e='A';	// �ֵ���ǥ�ϸ� ����;
		
		//(3) ���
		System.out.println(a);	//10
		System.out.println(b);	//error
		System.out.println(c);	//90
		System.out.println(d);	//10.0
		System.out.println(e);	//error
		


	}

}



