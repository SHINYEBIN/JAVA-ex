package java_type;
// ������(int)�� ���ڿ�(String)���� ��ȯ�Ͽ� ������ �ڸ����� ���ϴ� �ڵ带 �����ϱ�
// ���� 12345�� �Է��ϸ� "�ڸ����� '5'"�� ��µǵ���.
// �������� ���ڿ���, ���ڿ��� ���������� ��ȯ�ϴ� ����� ���ؼ� �ƴ� ���� ���� ����.

// �ٲٴ� ����?
// ������������ ������ �ƴ� ��� ���ϱ� ���� ���� �������� �� ���ڰ� �������� ����� ���� �� �ֱ� ����.
// ���� �ܿ��� �޼��� ȣ��� ���ڰ��� ������ ������ ���ڿ��� ó�� �Ǵ� ��ȯ�ϴ� ��쿡�� �ʿ�.
// ��ȯ�ϴ� ����� ���������� �ִ�.

public class Java100_type_IntString {
	public static void main(String[] args) {
		// [1] : ���� ����
		int a=12345;
		String str="12345";
		System.out.println("[1] --> "+str.length()); // 5
		//System.out.println(a.length()); //���ڿ� Ÿ���� �ƴϱ� ������ error
		
		// [2] : ����--> ���ڿ��� ��ȯ --> �ڸ��� ���ϱ�
		String stra=String.valueOf(a);
		System.out.println("[2] --> "+stra.length()); //5
		
		// [3] : ���ڿ� + ������ =?
		System.out.println("[3] --> "+(12345+1)); //12345
		System.out.println("[3] --> "+str+"1"); //12345+1 =123451
		
		// [4] : ���ڿ�--> ������ ��ȯ
		int b=Integer.valueOf(str); 
		System.out.println(b); //12345
		System.out.println("[4] --> "+b+1); // 123451�� ���´�.
		System.out.println("[4] --> "+(b+1)); //12346
		
		
		

	}

}
