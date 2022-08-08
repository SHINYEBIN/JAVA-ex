package java_array;

public class Java100_array_OneTwoArrayexample {

	public static void main(String[] args) {
		
		// ex) 2차원 배열 연습
		String[][] meats= {
				{"치킨","백숙","닭볶음탕","닭가슴살 스테이크"},
				{"돼지갈비","삼겹살","목살 스테이크","두루치기"},
				{"소갈비","소고기 스테이크"}
		};
		
		System.out.println(meats[0][1]); 
		
		// 반복문 써서 출력하기
		for(int i=0;i<meats.length;i++) {
			for(int j=0;j<meats[i].length;j++) {
				System.out.print(meats[i][j]+" ");
			}
			System.out.println();
		}
		
		// 향상된 for문 사용
		for(String[] meat:meats) {
			System.out.println(meat); // 치킨 돼지갈비 소갈비
		}
		
		// 한 글자 뽑아서 출력
		System.out.println(meats[0][1].charAt(1)); // 숙
		System.out.println(meats[1][2].charAt(4)); // 테 //공백도 인덱스 포함한다는 거 don't forget!
		System.out.println(meats[2][1].charAt(7)); // 크
		
		

	}

}
