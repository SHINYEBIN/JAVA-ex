package java_loop;
// ���� �����ڸ� �̿��Ͽ� 12�ú��� ������ ����, ũ�� ���ĸ� ����ϵ��� ����
// �� ������ ���� �������� ������ ���� ����
public class Java100_if_ThreeOperator {
	public static void main(String[] args) {
		
		// [1] : ���� ����
		int hour=11;
		
		// [2] : ���� ������ �׽�Ʈ --> 10���� �۰ų� ������ 100�� ���Ͻÿ�.
		int test=hour<=10?hour*100:hour;
		System.out.println("[2] : "+test);
		
		// [3] : ���� �����ڸ� �̿��Ͽ� 12�ú��� ������ ����, ũ�� ���� ���
		// ��� 1
		String ampm=hour<12?"����":"����";
		System.out.println("[3] : "+ampm);
		
		// ��� 2
		String str1="����";
		String str2="����";
		String ampm1=hour<12?str1:str2;
		System.out.println("[3] : "+ampm1);
		
		// ��� 1�� ��� 2���� �����ϰ� ��밡��. 
		// ���� ������ ���� ������ ���ٷ� �����ϰ� �ۼ��ϰ� ����ϰ��� �ϴ� �뵵�� ���� ��찡 ���� ������ ���� ������ �ٿ� ������ ������ �ۼ����� ����.
		
	}
}
