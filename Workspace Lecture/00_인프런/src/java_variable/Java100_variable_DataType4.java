package java_variable;
//System.out.print(),println(),printf() � ���� ����.
// �� ������ ��½� ���� ���Ǵ� print(),println(),printf() ���Ŀ� ���� �˰� �ִ� ���� ���� ����.
public class Java100_variable_DataType4 {

	public static void main(String[] args) {
		
		// [1] : �⺻�� Ÿ��--> 8��--> ���� ����� ���ÿ� ���� �Է�
		byte b=26;
		short s=32767;
		int i=210000000;
		long l=7000000000L;
		float f=9.8F;
		double d=3.14;
		char c='A';
		boolean bl=false;
		
		// [2] : print(),println()
		System.out.print("�ȳ��ϼ���~");
		System.out.print(" ȫ�浿�̰�, ���� �л��Դϴ�.");
		System.out.println("�ȳ��ϼ���~");
		System.out.println("ȫ�浿�̰� ���� �л��Դϴ�.");	 //SYSOUTġ�� ctrl + space bar�� ������ �ڵ��ϼ���
		
		// [3] : printf() ��� --> �����ڸ� ���
		// %d(����), %f(�Ҽ��� ����), %c(����), %s(���ڿ�), %b(�ο�), %n(�ٹٲ�),%e(����),%o(8����),%x(16����)
		System.out.printf("�� %d���� ���л��Դϴ�. %d,%d,%d �Ҽ��� ���� -->%.2f,%.115f,���� --> %c,%b, %n",b,s,i,l,f,d,c,bl);
		System.out.printf("%n");
		System.out.printf("�� %d���� ���ػ��Դϴ�. %d�⵿�� ��ȸ���� ���� ��Ҵٰ�� �� �� ������ ������ ��Ҵٰ� �����մϴ�. %c������ �ƴ����� �׷��� �б���Ȱ�� ������ �ߴٰ� �����մϴ�.",b,b,c);
		System.out.println();
		b=16;
		System.out.printf("10���� 10�� 8������ %o�̰�, 16�����δ� %x�̴�.",b,b); //�� 16������ �ϸ� a�� ���ñ�?=> 0~9 �׸��� 10���� a�� �ȴ�. �׷� b�� ���� 11�� ���� b�� �ǰ� 15�� f�� �ȴ�. 16��  10�� ���´�.
		System.out.println();
		System.out.printf("10���� 10�� 8������ %o�̰�, 16�����δ� %x�̴�.",b,15);
		

	}

}
