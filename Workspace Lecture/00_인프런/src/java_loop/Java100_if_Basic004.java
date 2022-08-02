package java_loop;
// 중첩된 if 조건문을 사용하는 예제
// 이 문제는 if 조건문을 중첩하여 사용하는 방법에 대한 문제
public class Java100_if_Basic004 {
	public static void main(String[] args) {
		
		// [1] : 변수선언
		int kor=70, eng=10, math=70;
		int total_score;
		total_score=kor+eng+math;
		
		// [2] : if~ else if~ else 조건문 사용하기
		if(total_score>=270) {
			System.out.println("당신의 총 점수는 "+total_score+"점 입니다. 매우매우 잘했어요~");
			//System.out.println("!!축하합니다!!"); //-- 괄호를 없애면 이 줄 때문에 밑에 else if에서 에러가 난다. 따라서 주석처리.
		}else if(total_score>=240) { 
			System.out.println("당신의 총 점수는"+total_score+"점 입니다. 잘했어요~");
		}else if(total_score>=210) {
			System.out.println("당신의 총 점수는"+total_score+"점 입니다. 노력하세요~");
		}else {
			if(math>=60) {
				System.out.printf("당신의 총 점수는 %d점이고, 수학점수는 %d점입니다. 수학이 60점 이상이므로 재수강 대상자가 아닙니다.",total_score,math);
			}else { 
				System.out.printf("당신의 총 점수는 %d점이고, 수학점수는 %d점입니다. 수학이 60점 미만이므로 재수강 대상자입니다.",total_score,math);
			}
		}	
	}

}
