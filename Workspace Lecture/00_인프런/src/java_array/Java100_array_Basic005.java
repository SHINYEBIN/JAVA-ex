package java_array;
// �迭 ����� ���� �ݺ����� ����Ͽ� ��� ���.
// �� ������ �迭 ����� ���� for���� ���� �ݺ����� ����Ͽ� ����� �� �ִ��� ���� ����

public class Java100_array_Basic005 {
	public static void main(String[] args) {
		
		// [1] : �迭 ����� ���ÿ� Ư�� ������ �ʱ�ȭ
		int sales_table[]= {33,52,93,100,87};
		
		// [2] : �ݺ����� ����Ͽ� ��� �� ���
		for(int i=0;i<sales_table.length;i++) {
			System.out.print(sales_table[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
}
