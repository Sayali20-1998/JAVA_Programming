
package marvellous;
import java.lang.*;


public class Arithematic
{
	public int Add (int no1, int no2)
	{
		return no1 + no2;
	}
	public int Sub (int no1, int no2)
	{
		return no1 - no2;
	}
}

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