package java_array;
// 1,2���� �迭�� ���� �� ����� �پ��� ������ ����
// �� ������ �ڹ� �迭�� ���ؼ� 2���� �迭 ���ַ� ���� �� ����� �پ��ϰ� �غ��� ���չ���.

public class Java100_array_OneTwoArray {
	public static void main(String[] args) {
		
		// [1] : String 1���� �迭 --> 3���� ���ڿ��� ���� �� �ִ� �迭 �����ϱ�
		// String Ÿ���� ���� ���� 3���� �����ϱ� ���� ���� ���� --> �̶�, ������ ���� �� ��Ҵ� �⺻�� --> null�� �ʱ�ȭ.
		String[] province=new String[3];
		System.out.println(province[0]);
		System.out.println(province[1]);
		System.out.println(province[2]);
		
		// [2] : String �迭 �ʱ�ȭ --> ���� �Է�
		province[0]="������";
		province[1]="����";
		province[2]="���";
		System.out.println(province[0]);
		System.out.println(province[1]);
		System.out.println(province[2]);
		
		// [3] : String �迭 �ʱ�ȭ --> �迭 ���� �� ������ {}�� ���ÿ� �ʱ�ȭ
		String[] nation=new String[] {"�ѱ�","�̱�","�߱�"};
		System.out.println(nation[1]);
		
		String[] flower= {"����ȭ","�عٶ��","������"};
		System.out.println(flower[1]);
		
		// [4] : �ݺ����� ����Ͽ� �迭 �� ��� ���
		for(int i=0;i<flower.length;i++) {
			System.out.print(flower[i]+" ");
		}
		System.out.println();
		
		// [5] : ���� for������ �迭 ��� ���
		for(String aaa: flower) {
			System.out.print(aaa+" ");
		}
		System.out.println();
		
		// [6] : String 2���� �迭 ����� --> 2x3 Shape
		// �ƽþ� --> ���Ͼƽþ�(�ѱ�,�߱�,�Ϻ�), �����ƽþ�(�±�,��Ʈ��,�ʸ���)
		String[][]asia_nations= {
				{"�ѱ�","�߱�","�Ϻ�"},
				{"�±�","��Ʈ��","�ʸ���"}
		};
		System.out.println(asia_nations[0]); // ���Ͼƽþ� ������ �����ϰ� �ִ� 1���� �迭�� �ּҸ� �����ϴ� ���� ���
		System.out.println(asia_nations[1]); // �����ƽþ� ������ �����ϰ� �ִ� 1���� �迭�� �ּҸ� �����ϴ� ���� ���
		
		System.out.println(asia_nations[0][0]);
		System.out.println(asia_nations[0][1]); //���� ����� ���� ���
		System.out.println(asia_nations[1][0]);
		
		System.out.println(asia_nations.length); //2 //1���� �迭 2�� ������ �ֱ� ������ 2��� ����.
		System.out.println(asia_nations[0].length); //3 
		System.out.println(asia_nations[1].length); //3 
		
		// [7] : �ݺ����� ����� String 2���� �迭 �� ���
		for(int i=0;i<asia_nations.length;i++) {
			for(int j=0;j<asia_nations[i].length;j++) {
				System.out.print(asia_nations[i][j]+" ");
			}
			System.out.println();
		}
		
		// [8] : charAt() �޼��� ��� --> �ش� �ε����� �ִ� ���� ��ȯ --> �ܾ char �迭�� �ѱ��ھ� ������ �� ����.
		String[] strAr= {"shin","yee","bin"};
		System.out.println(strAr[0]); //
		System.out.println(strAr[0].charAt(3)); //n
		System.out.println(strAr[1].charAt(1)); //e
		System.out.println(strAr[2].charAt(2)); //n
		
		
		// [9] : �ݺ������� charAt() �޼��� ���
		// [9-1] �߸��� ��1
		for(int i=0;i<strAr.length;i++) {
			System.out.println(strAr[i].charAt(i)); // s e n
		}
		
		// [9-2] : �߸��� ��2
		for(int i=0;i<strAr.length;i++) {
			for(int j=0;j<strAr.length;j++) {
				System.out.println(strAr[i].charAt(j));
			}
		}
		 
		// [9-3]
		System.out.println(strAr.length);
		//System.out.println(strAr[0].length); // ERROR
		System.out.println(strAr[0].length()); // SHIN --> 4
		
		for(int i=0;i<strAr.length;i++) {
			for(int j=0;j<strAr[i].length();j++) {
				System.out.print(strAr[i].charAt(j));
			}
		System.out.println(" ");
		}
		
		// [10] : length vs length()
		// length : �迭�� ���̸� �����ִ� �� 
		// length(): ���ڿ��� ���̸� �����ִ� ��
		
		int[]aaa=new int[10];
		System.out.println(aaa.length); // 10
		
		String bbb= "Welcome to Seoul";
		System.out.println(bbb.length()); // 16
		

		

	}
}
