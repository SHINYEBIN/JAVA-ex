package java_loop;
// if~ else if~ else 조건문의 사용법
// 이 문제는 자바의 if~ else if~ else 조건문을 사용할 수 있는지에 대해서 묻는 문제
public class Java100_if_Basic003 {
	public static void main(String[] args) {
		
		// [1] : 변수선언
		int kor=70, eng=70, math=70;
		int total_score;
		total_score=kor+eng+math;
		
		// [2] : if~ else if~ else 조건문 사용하기
		if(total_score>=270) {
			System.out.println("당신의 총 점수는 "+total_score+"점 입니다. 매우매우 잘했어요~");
			System.out.println("!!축하합니다!!");
		}else if(total_score>=240) {
			System.out.println("당신의 총 점수는"+total_score+"점 입니다. 잘했어요~");
		}else if(total_score>=210) {
			System.out.println("당신의 총 점수는"+total_score+"점 입니다. 노력하세요~");
			
		}else {
			System.out.println("당신의 총 점수는"+total_score+"점 입니다. 행복은 성적 순이 아니랬어요...! 다른 길을 찾아서 행복하게 삽시다..");
		}
		
		
	}

}
