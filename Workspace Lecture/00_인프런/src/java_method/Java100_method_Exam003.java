package java_method;
// 반환값이 있고 받는 인자값이 없는 메서드 구현하기
// 이 문제는 자바의 메서드 작성법과 반환값, 인자값에 대한 이해가 있는지를 묻는 문제이다.

public class Java100_method_Exam003{
	
	public static int returnMethod(){
		int ret=100;
		ret *=100;
		return ret;
	}
	
	
	public static void main(String[]args) {
	
		// [3] : 반환값 --> O   받는 인자값 --> X
		// 반환값이 있다는 것은 메서드(함수) 호출에 따른 리턴값이 있는 것이므로 호출시 리턴값을 받는 변수를 정의한다.
		
		int res;
		res=returnMethod();
		
		// 출력
		System.out.println("메서드 호출에 따른 리턴된 값 = "+res);
		
	}
}