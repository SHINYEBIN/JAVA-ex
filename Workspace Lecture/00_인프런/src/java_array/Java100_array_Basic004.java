package java_array;
// ũ�� 5�� ������ �迭�� �����ϰ� 55,88,60,100,90���� �� ����� ���� �ʱ�ȭ�Ͻÿ�.
// �� ������ �迭 ����� ���ÿ� Ư�� ������ �ʱ�ȭ �� �� �ִ����� ���� ����
// �ʱ�ȭ�� �� �� �ִ� 2���� ��� ��� �ۼ��ϱ�

public class Java100_array_Basic004 {
	public static void main(String[] args) {
		
		// [1] : �迭 ����� ���ÿ� Ư�� ������ �ʱ�ȭ
		int[] sales_table={55,88,60,100,90};
		System.out.println(sales_table[1]); //88
		
		// [2] 
		int[] sales_table2=new int[] {55,88,60,100,90}; // 1�� ��ĺ��� ������.
		System.out.println(sales_table2[2]); //60
		
		// [3]
		int[] sales_table3;
		//sale_table3= {55,88,60,100,90}; //error 
		sales_table3= new int[] {55,88,60,100,90}; // error ����
		System.out.println(sales_table3[3]); //100
		
	}
}









