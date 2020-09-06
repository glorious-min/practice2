import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
   
		Scanner sc = new  Scanner(System.in);
		int sum = 0;
		System.out.print("하샤드 수를 입력해 주세요 : ");
		int x = sc.nextInt();
		int a = x;
      
		while (a >= 1) {
			sum += a % 10;
	
			a /= 10;
		}
 
		if (x % sum == 0) {
			System.out.println("하샤드 수 판별 : "+ true);
		} else {
			System.out.println("하샤드 수 판별 : "+ false);
		}} }