package question;
// 
public class Exercise04 {

	public static void main(String[] args) {
		while(true) {
			int x=(int)(Math.random()*6)+1; 	//1부터 6까지의 랜덤함수(주사위 1)
			int y=(int)(Math.random()*6)+1;		//1부터 6까지의 랜덤함수(주사위 2)
			System.out.println("("+x+")"+", ("+y+")");
		
			if(x+y==5) {
				break;
			}
		}
		
		 //System.out.println("("+x+")"+", ("+y+")");
	}

}
