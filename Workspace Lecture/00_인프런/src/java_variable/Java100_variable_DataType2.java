package java_variable;

public class Java100_variable_DataType2 {

	public static void main(String[] args) {
		
		// [1] : �⺻��Ÿ��--> 8�� --> ���� ����� ���ÿ� ���� �Է�
		byte b=100;
		short s=30000;
		int i=2100000000;
		long l=7000000000L;
		float f=9.8F;	// ��Ģ�̱� ������ �ڿ� L�� F�� �ٿ���� �Ѵ�.(��ҹ��� �ҹ������� �ҹ��ں��ٴ� �빮�ڸ� ���� ���� ���̴�.)
		double d=3.14;
		char c='A';
		boolean bl=false;
		
		//[2] : ���
		System.out.println(b +"byte �ִ�-->"+Byte.MAX_VALUE);	
		System.out.println(s +"short �ִ�-->"+Short.MAX_VALUE);
		System.out.println(i +"int �ִ�-->"+Integer.MAX_VALUE);
		System.out.println(l +"long �ִ�-->"+Long.MAX_VALUE);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bl);
	}

}
