
public class q47 {
	public static void main(String[] args)
	{
	int temp,n=25861;
	int l=n%10;
	while(n!=0)
		{
		temp=n%10;
		{
			if(l<temp)
			{
				l=temp;
			}
			n=n/10;
		}
			
		}
		System.out.println(l);
	}
	}

