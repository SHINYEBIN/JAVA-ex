package java_array;
// ���� �迭 ����
// �� ������ �迭 ������ ���� �� �ؾ��ϴ� ��� �� �ٿ� ��� �����ϰ� ���� �� �ִ����� ���� ����.
import java.util.Arrays;

public class Java100_array_Basic008{
	public static void main(String[] args) {
		
		// [1]
		int[] a,b,c;
		
		// [2]
		int d[],e[],f[];
		
		// [3]
		int g[],h,i;
		
		// �迭 ����� ������ �� üũ
		a=new int[1];
		b=new int[2];
		c=new int[3];
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
		d=new int[4];
		e=new int[5];
		f=new int[6];
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));
		
		g=new int[7];
		//h=new int[3]; // error ������ ������ ����� ���̴�.
		h=300; // ���� ����
		//i=new int[3]; // error
		i=100; // ���� ����
		System.out.println(Arrays.toString(g));
		System.out.println(h);
		System.out.println(i);
		
		
		
		
	}
}