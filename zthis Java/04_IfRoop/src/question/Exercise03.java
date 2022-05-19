package question;
//1부터 100까지 정수 중 3의 배수 총합을 구하는 문제
public class Exercise03 {
	public static void main(String[]args) {
		int result=0;
		for(int i=1;i<=100;i++) {
			result+= 3*i;
		}
		System.out.println(result);
	}
}
