package java_method;
// static ������ �� �Ǿ� �ִ� �޼��带 ����ϴ� ����� ���� �ڵ�� �����ϱ�
// �� ������ ���� �޼��忡�� static ������ ���� �޼��带 ����ϴ� ����� ���� ����
// Ŭ������.�޼����();
public class Java100_method_ExamStatic2 {
	
	public void helloWorld() {
		System.out.println("Hello, World~");
	}
	
	
	public static void main(String[] args) {
		
		// [1] : �޼��� ȣ��
		//helloWorld(); // ���� �޼���� static �޼��常 ȣ���� �� �ֱ� ������ error
		
		// [2] : ��ü ���� �� �޼��� ȣ��
		Java100_method_ExamStatic2 obj=new Java100_method_ExamStatic2();
		obj.helloWorld();
		obj.pradak();
		
	}
	// ex)
		public void pradak() {
			System.out.println("��� ���� bbq�� �� ������");		
		} 
		
		
	
}
