package question;
// 중첩 for문 사용하여 4x+5y=60 해 구해서 (x,y)형태로 출력. 단 x와 y는 10 이하 자연수.
public class Exercise05 {

	public static void main(String[] args) {
		int x=0;
	
		int y=0;
		int result=60;
		System.out.println("("+x+"), ("+y+")");
		for(x=1;x<10;x++) {
			for(y=1;y<10;y++) {
				 result=4*x+5*y;
			}
		}

	}

}
