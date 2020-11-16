import java.util.Scanner;

class Calc{
	public static int abs(int a) {return a>0?a:-a;}
	public static int max(int a, int b) {return (a>b)?a:b;}
	public static int min(int a, int b) {return (a>b)?b:a;}
			
	
}
public class CodeGuruEX {

	public static void main(String[] args) {
		System.out.println(Calc.abs(-9));
		System.out.println(Calc.max(27,24));
		System.out.println(Calc.min(-13,-16));
		
		
		
		
		Scanner sc=new Scanner(System.in); 
		
		System.out.println("첫번째 숫자 입력 :"); 
		int x=sc.nextInt(); 
		System.out.println("두번째 숫자 입력 :"); 
		int y=sc.nextInt(); 
		
		int Max=x-y;
		int Min=x-y;
		if (Max>0)
			System.out.println(x);
		if (Min<0)
			System.out.println(y);
		if (x-y==0)
			System.out.println(0);
		
		int sum=0;
		sum=1+2+3+4+5+6+7+8+9+10;
		System.out.println(sum);
				
	}

}
