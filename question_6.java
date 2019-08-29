package codex_assignment2;

public class Question_6 
{

	public static void main(String[] args) 
	{
		int i,j,num1,sum1=0;
		int sum2=0;
		for(i=1;i<=100;i++)
		{
		    num1=i*i;
		    sum1=sum1+num1;
		    
		    }
		for(i=1;i<=100;i++)
		{
			sum2=sum2+i;
			
		}
		   
		    System.out.println("diffrence is"+((sum2*sum2)-sum1));
			
		}

}
