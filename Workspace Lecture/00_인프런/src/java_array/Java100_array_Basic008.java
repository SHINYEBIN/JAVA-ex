package java_array;
// 다중 배열 선언
// 이 문제는 배열 선언을 여러 개 해야하는 경우 한 줄에 모두 선언하고 만들 수 있는지를 묻는 문제.
import java.util.Arrays;

public class Java100_array_Basic008{
	public static void main(String[] args) {
		
		// [1]
		int[] a,b,c;
		
		// [2]
		int d[],e[],f[];
		
		// [3]
		int g[],h,i;
		
		// 배열 사용이 가능한 지 체크
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
		//h=new int[3]; // error 정수형 변수로 선언된 것이다.
		h=300; // 에러 수정
		//i=new int[3]; // error
		i=100; // 에러 수정
		System.out.println(Arrays.toString(g));
		System.out.println(h);
		System.out.println(i);
		
		
		
		
	}
}