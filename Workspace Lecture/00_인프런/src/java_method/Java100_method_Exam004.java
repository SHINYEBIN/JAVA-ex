package java_method;
// ��ȯ���� �ְ� �޴� ���ڰ��� �ִ� �빮�� ��� �޼��带 �����ϱ�
// �޼���� ("korea") �Է½� �빮�ڷ� ��µǵ��� �����Ѵ�.
// �� ������ �ڹ��� �޼��� �ۼ����� ��ȯ��, ���ڰ��� ���� ���ذ� �ִ����� ���� ����.

public class Java100_method_Exam004{
	
	public static String capitalMethod(String str) {
		
		// ���ڿ� ���� ����
		String ret=str.toUpperCase();
		return ret;
	}
	
	public static void main(String[] args) {
		
		// [4] : ��ȯ�� --> O    �޴� ���ڰ� --> O
		// ��ȯ���� �ִٴ� ���� �޼���(�Լ�) ȣ�⿡ ���� ���ϵǴ� ���� �ִٴ� ���̹Ƿ� ȣ��� ���ϰ��� �޴� ������ �����Ѵ�.
		// ���ڿ� ���� ����
		String rst;
		rst=capitalMethod("korea");
		
		// ���
		System.out.println("�Է��� �ҹ����� �빮�ڴ� = "+rst);
		
		
		
		
	}
}