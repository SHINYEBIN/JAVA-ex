package java_method;
// ��ȯ���� �ְ� �޴� ���ڰ��� ���� �޼��� �����ϱ�
// �� ������ �ڹ��� �޼��� �ۼ����� ��ȯ��, ���ڰ��� ���� ���ذ� �ִ����� ���� �����̴�.

public class Java100_method_Exam003{
	
	public static int returnMethod(){
		int ret=100;
		ret *=100;
		return ret;
	}
	
	
	public static void main(String[]args) {
	
		// [3] : ��ȯ�� --> O   �޴� ���ڰ� --> X
		// ��ȯ���� �ִٴ� ���� �޼���(�Լ�) ȣ�⿡ ���� ���ϰ��� �ִ� ���̹Ƿ� ȣ��� ���ϰ��� �޴� ������ �����Ѵ�.
		
		int res;
		res=returnMethod();
		
		// ���
		System.out.println("�޼��� ȣ�⿡ ���� ���ϵ� �� = "+res);
		
	}
}