package question;

public class Operator {

	public static void main(String[] args) {
		//int x=10;
		//int y=20;
		//int z=(++x)+(y--);
		//System.out.println(z);
		
		System.out.println("------------------------------------------------------------------------------------");
		
		int score=85;
		String result=(!(score>90))? "��":"��";
		System.out.println(result);
		
		System.out.println("------------------------------------------------------------------------------------");
		
		int pencils=534;
		int students=30;
		
		//�л� �� ���� ������ ���ʼ�
		int pencilsPerStudent=(pencils/students);
		System.out.println(pencilsPerStudent);
		
		//���� ���ʼ�
		int pencilsLeft=(pencils%students);
		System.out.println(pencilsLeft);
		
		System.out.println("------------------------------------------------------------------------------------");
		
		int value=356;
		System.out.println(356-56);
		
		System.out.println("------------------------------------------------------------------------------------");
		
		int x=10;
		int y=5;
		System.out.println( (x>7)&&(y<=5));
		
		System.out.println((x%3 ==2) || (y%2 !=1));
	}

}
