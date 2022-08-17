package java_method;
// static 선언이 안 되어 있는 메서드를 사용하는 방법에 대해 코드로 구현하기
// 이 문제는 메인 메서드에서 static 선언이 없는 메서드를 사용하는 방법에 대한 문제
// 클래스명.메서드명();
public class Java100_method_ExamStatic2 {
	
	public void helloWorld() {
		System.out.println("Hello, World~");
	}
	
	
	public static void main(String[] args) {
		
		// [1] : 메서드 호출
		//helloWorld(); // 메인 메서드는 static 메서드만 호출할 수 있기 때문에 error
		
		// [2] : 객체 생성 후 메서드 호출
		Java100_method_ExamStatic2 obj=new Java100_method_ExamStatic2();
		obj.helloWorld();
		obj.pradak();
		
	}
	// ex)
		public void pradak() {
			System.out.println("사실 나는 bbq를 더 좋아해");		
		} 
		
		
	
}
