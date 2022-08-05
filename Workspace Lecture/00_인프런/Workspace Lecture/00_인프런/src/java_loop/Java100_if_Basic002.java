package java_loop;
// if~ else 조건문의 사용법
// 이 문제는 자바의 if~ else 조건문을 사용할 수 있는지에 대해서 묻는 문제
public class Java100_if_Basic002 {
	public static void main(String[] args) {
		
		// [1] : 변수 선언
		int kor=80, eng=90, math=100;
		
		// [2] : if 조건문만 사용하기
		if(kor>=80) { 
			System.out.println("당신의 국어 점수는 B학점입니다.");
		}
		System.out.println("학점이 안 나왔다면 80점이 안되서입니다.");
		
		// [3] : if~ else 조건문 사용하기
		if(eng>=90) {
			System.out.println("영어 점수는 A 학점입니다.");
			System.out.println("축하해요~");
		}else {
			System.out.println("90점 미만입니다..ㅠㅠ");
		}
	}

}
