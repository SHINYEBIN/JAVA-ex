package java_loop;
// if~ else ���ǹ��� ����
// �� ������ �ڹ��� if~ else ���ǹ��� ����� �� �ִ����� ���ؼ� ���� ����
public class Java100_if_Basic002 {
	public static void main(String[] args) {
		
		// [1] : ���� ����
		int kor=80, eng=90, math=100;
		
		// [2] : if ���ǹ��� ����ϱ�
		if(kor>=80) { 
			System.out.println("����� ���� ������ B�����Դϴ�.");
		}
		System.out.println("������ �� ���Դٸ� 80���� �ȵǼ��Դϴ�.");
		
		// [3] : if~ else ���ǹ� ����ϱ�
		if(eng>=90) {
			System.out.println("���� ������ A �����Դϴ�.");
			System.out.println("�����ؿ�~");
		}else {
			System.out.println("90�� �̸��Դϴ�..�Ф�");
		}
	}

}
