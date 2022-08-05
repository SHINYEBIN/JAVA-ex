package java_array;
// 배열을 복사하는 메서드에 관련된 예제 코드 구현하기
// 이 문제는 배열 복사시 사용하는 메서드명과 사용법에 대한 문제
// 헷갈릴 수 있으니 여러 번 연습하기!


// [!] : 배열 복사하기
// arraycopy() 메서드 사용 --> 사용법 --> System.arraycopy(원본배열명,???,복사배열명,???,길이);
import java.util.Arrays;
public class Java100_array_Basic009{
	public static void main(String[] args) {
		
		// [1] : ar1, ar2 배열 선언
		int[] ar1= {1,2,3,4,5};
		int[] ar2= {1,2,3,4,5,6,7,8,9,10};
		
		// [2] : 배열 복사하기  --> System.arraycopy()
		System.arraycopy(ar1, 2, ar2, 4, 3); //{1,2,3,4,3,4,5,8,9,10};
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2)); 
		
		
		
	}
} 