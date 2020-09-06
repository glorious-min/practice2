
public class quiz2 {

	public static void main(String[] args) {
		
		int a=2; // 사람의 수 
		int b= 0; // 몇일 
		int c = 300000; //책의 수 
		
		
		while(c>0) {
			c=c-30*a;
			b++;
			if(b%10==0) {
				a=a*2;
			}
		}
		System.out.println(a);
		System.out.println(b);
		
		
		
		

	}

}
