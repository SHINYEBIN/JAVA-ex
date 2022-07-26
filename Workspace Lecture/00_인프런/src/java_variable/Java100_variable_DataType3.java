package java_variable;
// 정수형 변수를 문자형으로 형(Type) 변환시켜서 출력하면 어떤 결과가 나오는 지
// 이 문제는 정수형과 문자형의 타입 변환 시 일어나는 변화에 대한 문제.
public class Java100_variable_DataType3 {
	public static void main(String[] args) {
		
	//[1]
	short a='A';
	System.out.println(a);	//A의 아스키코드 65	Z의 아스키코드는 A(65)+(26-1)=Z(90)
	
	//[2]
	short b=90;
	System.out.println((char)b); // 아스키코드가 90에 해당하는 문자를 출력해라
	
	//[3]
	char c='a';
	System.out.println((short)c);	//a의 아스키코드는 97 z의 아스키코드는 a(97)+(26-1)=z(122)
		
	}

}
