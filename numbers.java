package marvellous;

public class Numbers
{
   public int power (int x, int y)
	{
		int ans = 1;
		for(int icnt = 1; icnt<=y; icnt++)
		{
			ans = ans * x;
		}

		return ans;
	}	
}	

javac -d . arithematic.java