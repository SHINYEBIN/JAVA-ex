package java_array;
// 크기 5의 정수형 배열을 선언하고 55,88,60,100,90으로 각 요소의 값을 초기화하시오.
// 이 문제는 배열 선언과 동시에 특정 값으로 초기화 할 수 있는지를 묻는 문제
// 초기화를 할 수 있는 2가지 방법 모두 작성하기

public class Java100_array_Basic004 {
	public static void main(String[] args) {
		
		// [1] : 배열 선언과 동시에 특정 값으로 초기화
		int[] sales_table={55,88,60,100,90};
		System.out.println(sales_table[1]); //88
		
		// [2] 
		int[] sales_table2=new int[] {55,88,60,100,90}; // 1번 방식보다 불편함.
		System.out.println(sales_table2[2]); //60
		
		// [3]
		int[] sales_table3;
		//sale_table3= {55,88,60,100,90}; //error 
		sales_table3= new int[] {55,88,60,100,90}; // error 수정
		System.out.println(sales_table3[3]); //100
		
	}
}









