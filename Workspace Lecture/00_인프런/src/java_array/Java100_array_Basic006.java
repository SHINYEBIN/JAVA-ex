package java_array;
// ũ�� 5�� �������� �Ǽ��� �迭�� �����ϰ� ������ �ּ� ���� ����ϱ�
// �ּ� ���� �ٸ� ���� ���� ���̶�� �Ѵ�.
// �� ������ �迭 ������ ����ִ� ���� ������ Ÿ�������� ���ؼ� �˰� �ִ��� ���� ����.

public class Java100_array_Basic006 {
	public static void main(String[] args) {
		
		// [1] : �������� �Ǽ��� �迭 ���� ����
		int[] ar1;
		ar1=new int[] {3,3,3,3,4};
		double[] ar2=new double[] {9.8,2.45,5.98,5.11,3.14};
		
		// [2] : ������ �迭 ��� �� ���
		System.out.println(ar1[ar1.length-1]); //4
		System.out.println(ar2[ar2.length-1]); //3.14
		
		// [3] : �迭�� ��ü�� �� ��� --> �ּ�(����) �� --> I : ������ �迭, D : �Ǽ��� �� 
		System.out.println(ar2); // �Ǽ��� �迭 --> D
		
		
		
	}
}
