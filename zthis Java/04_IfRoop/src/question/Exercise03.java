package question;
//1부터 100까지의 정수 중 3의 배수의 총합구하기
public class Exercise03 {
	public static void main(String[]args) {
		int result=0;
		
		for(int i=1;i<=100;i++) {
			//result+= 3*i; 		// 이렇게하면 다음값이 i는 2가 아니라 4가 되기 때문에 3의 배수가 나오지 않는다.
			if(i%3==0) {
				result+=i;
			}
		}
		System.out.println(result);
	}
}
