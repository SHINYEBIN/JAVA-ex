package java_array;

public class Java100_array_OneTwoArrayexample {

	public static void main(String[] args) {
		
		// ex) 2���� �迭 ����
		String[][] meats= {
				{"ġŲ","���","�ߺ�����","�߰����� ������ũ"},
				{"��������","����","��� ������ũ","�η�ġ��"},
				{"�Ұ���","�Ұ�� ������ũ"}
		};
		
		System.out.println(meats[0][1]); 
		
		// �ݺ��� �Ἥ ����ϱ�
		for(int i=0;i<meats.length;i++) {
			for(int j=0;j<meats[i].length;j++) {
				System.out.print(meats[i][j]+" ");
			}
			System.out.println();
		}
		
		// ���� for�� ���
		for(String[] meat:meats) {
			System.out.println(meat); // ġŲ �������� �Ұ���
		}
		
		// �� ���� �̾Ƽ� ���
		System.out.println(meats[0][1].charAt(1)); // ��
		System.out.println(meats[1][2].charAt(4)); // �� //���鵵 �ε��� �����Ѵٴ� �� don't forget!
		System.out.println(meats[2][1].charAt(7)); // ũ
		
		

	}

}
