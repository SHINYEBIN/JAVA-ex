package java_method;
// ���� �޼��忡�� 100�� ������ �� ���� �����ǰԲ� Call by reference ������� �ڵ� �����ϱ�
// �� ������ �ռ� �ٷ�� ������ Call by value ����� Call by reference ������� �����ؼ� ������� �ǹ�.
// a ���� ���� ����� �������� �ڵ� �����ϱ�
public class Java100_method_MethodCall2 {
	
	public static void sum(Integer a) {
		a+=400;
		//System.out.println("sum() �޼���ȿ��� a �� ��� --> "+a); 
		System.out.println(a); // �ּ� ���� ������ �� �ƴ϶� 100�̶�� ���� ������
		
	}
	
	
	public static void main(String[] args) {
		
		// [1] : ���� ���� �� �޼��� ȣ��
		// Wrapper Ŭ������ Integer Ŭ���� Ÿ������ ���� a�� �����ϰ�, new�� ��ü�� �����Ͽ� �ش� �ּ� ���� �޼���� ������.
		//Java100_method_MethodCall2 a=new Java100_method_MethodCall2();
		Integer a= new Integer(100);
		sum(a); // sum �޼ҵ忡 a ������
		// System.out.println("main() �޼���ȿ��� a �� ��� --> "+a);
		System.out.println(a);
		
		
		
	}
	
}
