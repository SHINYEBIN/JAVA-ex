package java_loop;
// ���ĺ� 26�� ���ڸ� �빮�ڷ� ����ϴ� �ݺ��� ����
// �� ������ ���ĺ� ������ �빮�� �ƽ�Ű �ڵ忡 ���ؼ� �˰� �װ��� �ݺ������� ����� �� �ִ����� ���� �����̴�.
public class Java100_for_AlphabetPrint {
	public static void main(String[] args) {
		
		//for �ݺ��� --> A(65) ~ Z(90)
		System.out.println((int)'A'); // 65
		System.out.println((int)'Z'); // 90
		for(int i=65;i<=90;i++) {
			System.out.print((char)i+" ");
		}
	}

}
