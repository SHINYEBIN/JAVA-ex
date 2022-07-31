package java_loop;
// while 반복문 사용하여 홀수, 짝수 구하기 문제
// 조건) 1-30까지의 수에서 짝수만 출력하시오
// 이 문제는 while 반복문과 그 안에서 조건문을 사용할 수 있는지를 묻는 문제

public class Java100_while_Withif {
	public static void main(String[] args) {
		// 짝수 출력하기
		
		// [1] : 변수 선언
		int number=1;
		
		// [2] 반복문을 돌면서 홀수, 짝수 체크
		while(number<=30) {
			// 반복을 돌면서 짝수인지 홀수인지 체크--> 출력
			// 짝수이면 출력
			if(number%2==0) {
				System.out.println(number);
			}
			// 반복문을 빠져나오기 위해서는 number 값을 반복 때 마다 증가.
			number++;
		}
		
		
		// 홀수 출력하기
		int n=1;
		while(n<=30) {
			if(n%2==1) {
				System.out.println(n);
			}
			n++;
		}
		System.out.println();
	}

}
