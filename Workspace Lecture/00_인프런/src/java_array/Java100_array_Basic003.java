package java_array;
// 배열 요소에 데이터 값 넣기
// 이 문제는 배열을 생성한 후 데이터 값을 입력하는 방법에 대해 묻는 문제

public class Java100_array_Basic003 {
	public static void main(String[]args) {
		
		// [1] : 배열 선언
		int[] sales_table=new int[5];
		
		// [2] : 선언한 배열 공간에 값 입력하기
		sales_table[0]=3;
		sales_table[1]=11;
		sales_table[2]=22;
		sales_table[3]=33;
		sales_table[4]=44;
		
		System.out.println(sales_table[0]);
		System.out.println(sales_table[1]);
		System.out.println(sales_table[2]);
		System.out.println(sales_table[3]);
		System.out.println(sales_table[4]);
		System.out.println(sales_table[sales_table.length-1]);
		
		
		
		System.out.println("----------------------------------------------------------");
		
		
		// 내가 푼 방법
		int ar1[]= {3,11,22,33,44};
		System.out.println(ar1[0]);
		System.out.println(ar1[1]);
		System.out.println(ar1[2]);
		System.out.println(ar1[3]);
		System.out.println(ar1[4]);
		
		int stl=ar1.length;
		System.out.println(ar1[stl-1]);
	}
	
}











