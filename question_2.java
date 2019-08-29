package codex_assignment2;

public class Question_2
{

	public static void main(String[] args) 
	{
		int a=0,b=1,c,sum=0;
		System.out.print(a+","+b);
		for(int i=1;i<4000000;i++)
		{
			c=a+b;
			System.out.println(",  "+c);
			a=b;
			b=c;
			if(c%2==0)
			{
				sum=sum+c;
		}
	}
    System.out.println("Sum"+sum);
	}

}
