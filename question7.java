public class question7 
{
 public static void main(String[] args) 
	{
		int num=1,pri=1,a;
		while(num<10001)
		{
			pri=pri+2;
			a=1;
			while(true)
			{
				a=a+2;
				if(pri==a)
				{
					num++;
					break;
				}
				else if(pri%a==0 && pri!=0)
				{
					break;
				}
			}
		}
		System.out.println("The " +num+ " prime no is " +pri);
   }
}
