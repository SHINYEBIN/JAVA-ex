package java_loop;
import java.util.Scanner;
// switch ���ǹ��� ����
// ����ڰ� �ڽ��� ���ɴ븦 �Է��ϸ� �ش� ���ɴ뿡 �´� å�� ��õ�ϴ� �ڵ� �����
// �� ������ �ڹ��� switch ���ǹ��� ����� �� �ִ����� ���� ����

public class Java100_switch_Basic001 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// [1] : ���� ����
		int age=sc.nextInt();
		
		// [2] : ����� �Է� ����ó��
		if(age>=10&&age<20) { //11~19
			age=10;
			//System.out.println("10�̶�� �ٽ� ���ɴ븦 �Է����ּ���. ���α׷��� �����մϴ�.");
			//System.exit(0);
		}else if(age>=20&&age<30) { //21~29
			age=20;
			//System.out.println("20�̶�� �ٽ� ���ɴ븦 �Է����ּ���. ���α׷��� �����մϴ�.");
			//System.exit(0);
		}else if(age>=30&&age<40) { //31~39
			age=30;
			//System.out.println("30�̶�� �ٽ� ���ɴ븦 �Է����ּ���. ���α׷��� �����մϴ�.");
			//System.exit(0);
		}else if(age>=40&&age<50) { //41~49
			age=40;
			//System.out.println("40�̶�� �ٽ� ���ɴ븦 �Է����ּ���. ���α׷��� �����մϴ�.");
			//System.exit(0);
		}else if(age>=50&&age<60) { //51~59
			age=50;
			//System.out.println("10�̶�� �ٽ� ���ɴ븦 �Է����ּ���. ���α׷��� �����մϴ�.");
			//System.exit(0);
		}else {
			if(age<10) {
				System.out.println("�ּ� 10 �̻� �Է����ּ��� ���α׷��� �����մϴ�");
				System.exit(0);
			}
		}
		// [3] : switch ���ǹ�
		// ���� ������ �������̾�� �Ѵ�. --> byte, short, int--> �׷��� long Ÿ���� X --> �׷��� char Ÿ���� O --> 'A';
		// break, default ������ �ʵ��� ����!
		switch(age) {
		case 10 : 
			System.out.println(age+"�� �Դϴ�. ���� �ڳʴ� A �����Դϴ�.");
			break;
		case 20 : 
			System.out.println(age+"�� �Դϴ�. ��� ���� �ڳʴ� C �����Դϴ�.");
			break;
		case 30 : 
			System.out.println(age+"�� �Դϴ�. �ڱ� ��� �ڳʴ� E �����Դϴ�.");
			break;
		case 40 : 
			System.out.println(age+"�� �Դϴ�. ����ũ �ڳʴ� B �����Դϴ�.");
			break;
		case 50 : 
			System.out.println(age+"�� �Դϴ�. ����� �ڳʴ� E �����Դϴ�.");
			break;
		default : 
			System.out.println("60�� �̻��Դϴ�. �ǰ�/��� �ڳʴ� E �����Դϴ�.");
		}
		
		
		 
		
		
	}
}
