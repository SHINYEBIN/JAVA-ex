package java_array;
// �迭 ��ҿ� ������ �� �ֱ�
// �� ������ �迭�� ������ �� ������ ���� �Է��ϴ� ����� ���� ���� ����

public class Java100_array_Basic003 {
	public static void main(String[]args) {
		
		// [1] : �迭 ����
		int[] sales_table=new int[5];
		
		// [2] : ������ �迭 ������ �� �Է��ϱ�
		sales_table[0]=3;
		sales_table[1]=11;
		sales_table[2]=22;
		sales_table[3]=33;
		sales_table[4]=44;
		
		System.out.println(sales_table[0]);
		System.out.println(sales_table[1]);
		System.out.println(sales_table[2]);
		System.out.println(sales_table[3]);
		System.out.println(sales_table[4]);
		System.out.println(sales_table[sales_table.length-1]);
		
		
		
		System.out.println("----------------------------------------------------------");
		
		
		// ���� Ǭ ���
		int ar1[]= {3,11,22,33,44};
		System.out.println(ar1[0]);
		System.out.println(ar1[1]);
		System.out.println(ar1[2]);
		System.out.println(ar1[3]);
		System.out.println(ar1[4]);
		
		int stl=ar1.length;
		System.out.println(ar1[stl-1]);
	}
	
}











