
public class quiz2 {

	public static void main(String[] args) {
		
		int a=2; // ����� �� 
		int b= 0; // ���� 
		int c = 300000; //å�� �� 
		
		
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
