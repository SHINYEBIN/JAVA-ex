package java_loop;
// ��ø�� if ���ǹ��� ����ϴ� ����
// �� ������ if ���ǹ��� ��ø�Ͽ� ����ϴ� ����� ���� ����
public class Java100_if_Basic004 {
	public static void main(String[] args) {
		
		// [1] : ��������
		int kor=70, eng=10, math=70;
		int total_score;
		total_score=kor+eng+math;
		
		// [2] : if~ else if~ else ���ǹ� ����ϱ�
		if(total_score>=270) {
			System.out.println("����� �� ������ "+total_score+"�� �Դϴ�. �ſ�ſ� ���߾��~");
			//System.out.println("!!�����մϴ�!!"); //-- ��ȣ�� ���ָ� �� �� ������ �ؿ� else if���� ������ ����. ���� �ּ�ó��.
		}else if(total_score>=240) { 
			System.out.println("����� �� ������"+total_score+"�� �Դϴ�. ���߾��~");
		}else if(total_score>=210) {
			System.out.println("����� �� ������"+total_score+"�� �Դϴ�. ����ϼ���~");
		}else {
			if(math>=60) {
				System.out.printf("����� �� ������ %d���̰�, ���������� %d���Դϴ�. ������ 60�� �̻��̹Ƿ� ����� ����ڰ� �ƴմϴ�.",total_score,math);
			}else { 
				System.out.printf("����� �� ������ %d���̰�, ���������� %d���Դϴ�. ������ 60�� �̸��̹Ƿ� ����� ������Դϴ�.",total_score,math);
			}
		}	
	}

}
