package java_array;
// �迭�� �����ϴ� �޼��忡 ���õ� ���� �ڵ� �����ϱ�
// �� ������ �迭 ����� ����ϴ� �޼����� ������ ���� ����
// �򰥸� �� ������ ���� �� �����ϱ�!


// [!] : �迭 �����ϱ�
// arraycopy() �޼��� ��� --> ���� --> System.arraycopy(�����迭��,???,����迭��,???,����);
import java.util.Arrays;
public class Java100_array_Basic009{
	public static void main(String[] args) {
		
		// [1] : ar1, ar2 �迭 ����
		int[] ar1= {1,2,3,4,5};
		int[] ar2= {1,2,3,4,5,6,7,8,9,10};
		
		// [2] : �迭 �����ϱ�  --> System.arraycopy()
		System.arraycopy(ar1, 2, ar2, 4, 3); //{1,2,3,4,3,4,5,8,9,10};
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2)); 
		
		
		
	}
} 