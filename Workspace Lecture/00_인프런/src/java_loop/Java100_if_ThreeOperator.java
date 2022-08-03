package java_loop;
// 삼항 연산자를 이용하여 12시보다 작으면 오전, 크면 오후를 출력하도록 구현
// 이 문제는 삼항 연산자의 사용법에 대한 문제
public class Java100_if_ThreeOperator {
	public static void main(String[] args) {
		
		// [1] : 변수 선언
		int hour=11;
		
		// [2] : 삼항 연산자 테스트 --> 10보다 작거나 같으면 100을 곱하시오.
		int test=hour<=10?hour*100:hour;
		System.out.println("[2] : "+test);
		
		// [3] : 삼항 연산자를 이용하여 12시보다 작으면 오전, 크면 오후 출력
		// 방법 1
		String ampm=hour<12?"오전":"오후";
		System.out.println("[3] : "+ampm);
		
		// 방법 2
		String str1="오전";
		String str2="오후";
		String ampm1=hour<12?str1:str2;
		System.out.println("[3] : "+ampm1);
		
		// 방법 1이 방법 2보다 간편하게 사용가능. 
		// 삼항 연산자 쓰는 이유는 한줄로 간편하게 작성하고 사용하고자 하는 용도로 쓰는 경우가 많기 때문에 굳이 별도의 줄에 변수를 빼놓고 작성하진 않음.
		
	}
}
