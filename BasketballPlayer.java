/*
This homework represents my own work. I understand that I may receive help, but I did not copy any portion of this assignment 
from anywhere. I understand that a violation of this will result in a Report of Academic Dishonesty. - Logan Scott Rinberger”
*/

package prob1;

public class BasketballPlayer 
{
	private int freeThrowsAttempted;
	private int freeThrowsMade;
	private String name;
	private int threePointersAttempted;
	private int threePointersMade;
	private int twoPointersAttempted;
	private int twoPointersMade;
	
	public BasketballPlayer(String name)
	{
		this.name = name;
		freeThrowsAttempted = 0;
		freeThrowsMade = 0;
		threePointersAttempted = 0;
		threePointersMade = 0;
		twoPointersAttempted = 0;
		twoPointersMade = 0;
	}
	
	public double getFreeThrowPercent()
	{
		double freeThrowPercent = 0.0;
		if (freeThrowsAttempted == 0)
		{
			return freeThrowPercent;
		}
		else 
		{
			freeThrowPercent = 100.0 * freeThrowsMade / freeThrowsAttempted;
			return freeThrowPercent;
		}
	}
	
	public int getFreeThrowsAttempted()
	{
		return freeThrowsAttempted;
	}
	
	public int getFreeThrowsMade()
	{
		return freeThrowsMade;
	}
	
	public String getName()
	{
		return name; 
	}
	
	public double getThreePointerPercent()
	{
		double threePointerPercent = 0.0;
		if (threePointersAttempted == 0)
		{
			return threePointerPercent;
		}
		else 
		{
			threePointerPercent = 100.0 * threePointersMade / threePointersAttempted;
			return threePointerPercent;
		} 
	}
	
	public int getThreePointersAttempted()
	{
		return threePointersAttempted;
	}
	
	public int getThreePointersMade()
	{
		return threePointersMade;
	}
	
	public int getTotalPoints()
	{
		int totalPoints = 1 * freeThrowsMade 
		+ 2 * twoPointersMade + 3 * threePointersMade;
		return totalPoints;
	}
	
	public double getTwoPointerPercent()
	{
		double twoPointerPercent = 0.0;
		if (twoPointersAttempted == 0)
		{
			return twoPointerPercent;
		}
		else 
		{
			twoPointerPercent = 100.0 * twoPointersMade / twoPointersAttempted;
			return twoPointerPercent;
		} 
	}
	
	public int getTwoPointersAttempted()
	{
		return twoPointersAttempted;
	}
	
	public int getTwoPointersMade()
	{
		return twoPointersMade; 
	}
	
	public void shootFreeThrow(boolean isMade)
	{
		freeThrowsAttempted++;
		if (isMade)
		{
			freeThrowsMade++;
		}
	}
	
	public void shootThreePointer(boolean isMade)
	{
		threePointersAttempted++;
		if (isMade) 
		{
			threePointersMade++;
		}
	}
	
	public void shootTwoPointer(boolean isMade)
	{
		twoPointersAttempted++;
		if (isMade) 
		{
			twoPointersMade++;
		}
	}
	
	@Override
	public String toString()
	{
		String nl = "\n";
		String msg = "Player:" + this.name + ", points:" + this.getTotalPoints() 
		+ nl + "   Free Throws: " + "made:" + this.freeThrowsMade + ", attempted:" + this.getFreeThrowsAttempted()
		+ ", percent:" + this.getFreeThrowPercent() 
		+ nl + "    2 Pointers: " + "made:" + this.twoPointersMade + ", attempted:" + this.getTwoPointersAttempted()
		+ ", percent:" + this.getTwoPointerPercent()
		+ nl + "Three Pointers: " + "made:" + this.threePointersMade + ", attempted:" + this.getThreePointersAttempted()
		+ ", percent:" + this.getThreePointerPercent();
		
		return msg;
	}

	public static void main(String[] args) 
	{
		BasketballPlayer k = new BasketballPlayer ("Kevin");
		System.out.print(k.toString());
	}

}
