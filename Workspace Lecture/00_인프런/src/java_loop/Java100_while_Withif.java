package java_loop;
// while �ݺ��� ����Ͽ� Ȧ��, ¦�� ���ϱ� ����
// ����) 1-30������ ������ ¦���� ����Ͻÿ�
// �� ������ while �ݺ����� �� �ȿ��� ���ǹ��� ����� �� �ִ����� ���� ����

public class Java100_while_Withif {
	public static void main(String[] args) {
		// ¦�� ����ϱ�
		
		// [1] : ���� ����
		int number=1;
		
		// [2] �ݺ����� ���鼭 Ȧ��, ¦�� üũ
		while(number<=30) {
			// �ݺ��� ���鼭 ¦������ Ȧ������ üũ--> ���
			// ¦���̸� ���
			if(number%2==0) {
				System.out.println(number);
			}
			// �ݺ����� ���������� ���ؼ��� number ���� �ݺ� �� ���� ����.
			number++;
		}
		
		
		// Ȧ�� ����ϱ�
		int n=1;
		while(n<=30) {
			if(n%2==1) {
				System.out.println(n);
			}
			n++;
		}
		System.out.println();
	}

}
