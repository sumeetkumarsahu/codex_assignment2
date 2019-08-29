package codex_assignment2;

public class Question_4 
{

	public static void main(String[] args) 
	{
		
		int i,j,num,r,s=0,max=0;
		 for(i=100;i<1000;i++)
		 {
			 for(j=100;j<1000;j++)
			 {   s=0;
				 num=i*j;
				 while(num>0)
				   {
					 r=num%10;
					 s=(s*10)+r;
					 num=num/10;
				  }
				 if (s==i*j)
				 {
				 if(i*j>max)
					 max=i*j;
				 }
		      } 
		
	       }
	 System.out.println("largest no"+max);

	}
}
