package java_operator;
// 관계 연산자에 대한 내용
// 이 문제는 자바의 기본적인 관계 연산자에 대해서 알고 있는지를 묻는 문제
public class Java100_operator_RelationalOperators {
	public static void main(String[] args) {
		
		// [!] : 관계 연산자 --> ==,!=,>,>=,<,<=
		// 관계 연산자를 사용해서 연산을 수행하면 그 결과는 참(true), 거짓(false)이 된다. --> 따라서, 그 결과를 받는 타입은 boolean.
		int kor=70,eng=40,math=70;
		boolean rst1,rst2,rst3,rst4,rst5,rst6;
		
		rst1=kor==eng; // false
		rst2=kor!=math; // false
		rst3=kor>eng; // true
		rst4=kor>=math; // true
		rst5=kor<eng; // false
		rst6=kor<=math; // true
		
		System.out.println(rst1);
		System.out.println(rst2);
		System.out.println(rst3);
		System.out.println(rst4);
		System.out.println(rst5);
		System.out.println(rst6); // ctrl alt 화살표↓ 누르면 아랫줄로 복사된다.
		
		
		
		
	}

}
