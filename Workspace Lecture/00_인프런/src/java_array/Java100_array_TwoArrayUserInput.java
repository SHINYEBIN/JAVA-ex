package java_array;
// ����� �Է��� �޾� 2���� �迭�� �����ϰ� ���� �Է��ϴ� �ڵ� �����ϱ�
// �̶�, ��ø �ݺ����� ����Ͽ� ���.
// �� ������ �迭 ������ ����ڷκ��� �Է��� �޾Ƽ� 2���� �迭�� ���� �� �ִ����� ���� ����

import java.util.Scanner;
public class Java100_array_TwoArrayUserInput {
	public static void main(String[] args) {
		
		// [1] : ����� �Է��� ���� ��ü ����
		Scanner scan=new Scanner(System.in);
		
		// [2] : 2���� �迭�� ��� ���� ���� --> ����� �Է����� ó��.
		System.out.print("���� ������ �Է��ϰ� [Enter] ġ���� =");
		int R=scan.nextInt();
		System.out.print("���� ������ �Է��ϰ� [Enter] ġ���� = ");
		int C=scan.nextInt();
		
		// [3] : char 2���� �迭 ���� --> ����ڷκ��� R,C �Է¹޾� --> gameMap[R][C] ����.
		char [][] gameMap=new char[R][C];
		
		// [4] : ����� �Է��� �޾Ƽ� ������ String �迭 ���� --> �� �� ũ�⸦ [R]�� ���ֵ��� �Ѵ�.(��)
		// ũ�⸦ R��ŭ�� ���ָ� �Ǵ� ����? --> ������ ����ڰ� �Է��ϴ� ���� ���� for���� ���鼭 2���� �迭�� �Է��ϱ� �����̴�.
		String[] strAr=new String[R]; 
		
		// [5] : 2���� �迭 ��� --> ����ڰ� �Է��ϴ� ������ ����
		for(int i=0;i<R;i++) {
			System.out.println((i+1)+"��° �࿡ �Է��� ����"+C+"���� ���ʴ�� �Է��ϰ� [Enter] ġ����.");
			strAr[i]=scan.next();
			for(int j=0;j<C;j++) {
				gameMap[i][j]=strAr[i].charAt(j); //j �ε����� �ִ� ���� �ϳ��� �����ͼ� --> gameMap ��ǥ�� ����.
				
			}
		}
		
		// [6] : 2���� �迭�� ����ִ� �� ����ϱ�
		System.out.println(strAr); // �ּҰ�
		System.out.println(strAr[0]); // KOR
		System.out.println(strAr[1]); // USA
		
		System.out.println("=========================================================");
		
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				System.out.print(gameMap[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
	
	
	
}
