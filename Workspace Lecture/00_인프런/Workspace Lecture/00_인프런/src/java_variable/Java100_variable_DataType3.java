package java_variable;
// ������ ������ ���������� ��(Type) ��ȯ���Ѽ� ����ϸ� � ����� ������ ��
// �� ������ �������� �������� Ÿ�� ��ȯ �� �Ͼ�� ��ȭ�� ���� ����.
public class Java100_variable_DataType3 {
	public static void main(String[] args) {
		
	//[1]
	short a='A';
	System.out.println(a);	//A�� �ƽ�Ű�ڵ� 65	Z�� �ƽ�Ű�ڵ�� A(65)+(26-1)=Z(90)
	
	//[2]
	short b=90;
	System.out.println((char)b); // �ƽ�Ű�ڵ尡 90�� �ش��ϴ� ���ڸ� ����ض�
	
	//[3]
	char c='a';
	System.out.println((short)c);	//a�� �ƽ�Ű�ڵ�� 97 z�� �ƽ�Ű�ڵ�� a(97)+(26-1)=z(122)
		
	}

}
