package java_array;
// �迭�� ������ for���� ���� �ݺ��� ������� �ʰ� �Ѳ����� ����ϴ� �ڵ� �ۼ��ϱ�
// �� ������ �ݺ����� �ƴ� �޼���� �迭�� ��� ������ ����ϴ� ����� ���� ����


// [!] : Arrays.toString() �޼���
// �ݺ����� ������� �ʰ� �迭�� ���� ����ϰ��� �Ѵٸ� Arrays Ŭ������ toString() �޼��带 ����Ѵ�.
// toString() ���ڷδ� �迭���� �־��ָ� �ȴ�.
// ����� ���ؼ��� �⺻������ java.util.Arrays ����Ʈ ������ �Ǿ��� �־�� �Ѵ�. --> �̶��� �����ݷ�(;) ����!
import java.util.Arrays;

public class Java100_array_Basic007{
	public static void main(String[] args) {
		
		// [1] : �迭 ����
		int[] ar1= {238,483,239,442,487,239,873};
		
		// [2] : toString() �޼��� ����Ͽ� �� ���
		System.out.println(Arrays.toString(ar1)); // [] ��ȣ�� ���·� �迭 ǥ�ø� �����ָ鼭 ��� ��.
		System.out.println(ar1[0]); //238
		
		// [3] : for �ݺ���
		for(int i=0;i<ar1.length;i++) {
			System.out.print(ar1[i]+" ");
		}
		
		
		
		
	}
	
}