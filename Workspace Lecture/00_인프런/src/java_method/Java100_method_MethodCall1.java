package java_method;
// �޼���� ���� ���޽� ���� 100�� ������ ���� �ڵ� ��� ���
// �� ������ �ڹ��� �⺻�� Ÿ�԰� ������ Ÿ���� �پ��� �޼��� ȣ�� ��Ŀ� ���� ����
public class Java100_method_MethodCall1 {
	
	// [!] : Call by value --> ���� ���� ȣ��--> ���� ���ؼ� (�޼��带) ȣ��
	// �޼���� ���ڰ��� �ѱ� �� �ش� ���� �����Ͽ� �ѱ�� ��� --> ���� sum() �޼��� ���ο����� ����� ������ ó���� �Ѵ�.
	public static void sum(int a) {
		a+=400;
		System.out.println(a); // 500
		
	}
	
	public static void main(String[] args) {
		
		// [1] : ���� ���� �� �޼��� ȣ��
		int a=100;
		sum(a);
		
		// [2] : ���
		System.out.println(a); // 100
		
	}
}
