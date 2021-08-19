import java.util.*;
public class fibbonicseries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the range of the given number :");
		int n =s.nextInt();
		int a = 0;
		int b=1;
		int c=1;
		System.out.println(a);
		System.out.println(b);
		for(int i =4; c<n ; i++)
		//while(c<=n)
		{
			
				c= a+b;
			a= b;
			b=c;
			if(c<n)
			 System.out.println(c);
		}
       
	}

}