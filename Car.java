package prob1;

public class Car 
{
	private double fuelCapacity;
	private double fuelEfficiency;
	private double fuelLevel;
	private double totalDistance;
	
	public Car(double fuelCapacity, double fuelEfficiency)
	{
		this.fuelCapacity = fuelCapacity;
		this.fuelEfficiency = fuelEfficiency;
		this.fuelLevel = 0.0;
		this.totalDistance = 0.0;
	}
	
	public Car(double fuelCapacity, double fuelEfficiency, double fuelLevel)
	{
		this.fuelCapacity = fuelCapacity;
		this.fuelEfficiency = fuelEfficiency;
		this.fuelLevel = fuelLevel;
		this.totalDistance = 0.0;
	}
	
	public void drive (double time, double rate)
	{
		double e = fuelEfficiency;
		double totalTime = time;
		double totalDistance = 0.0;
		double fuelConsumed = 0.0;
		
		while (totalTime > 0)
		{
			double d = rate * totalTime;
			double fuelNeeded = d / e;
			
			if (fuelNeeded > fuelLevel)
			{
				d = fuelLevel * e;
				fuelConsumed = fuelLevel;
				totalTime = 0;
			}
			else
			{
				fuelConsumed = fuelNeeded;
				totalTime = 0;
			}
			
			totalDistance += d;
			fuelLevel -= fuelConsumed;
			
			if (fuelLevel < 0)
			{
				fuelLevel = 0.0;
				break;
			}

		}
		this.totalDistance += totalDistance;
	}
	
	public void fillUp(double amount)
	{
		if (fuelCapacity < (fuelLevel + amount))
		{
			fuelLevel = fuelCapacity;
		}
		else 
		{
			fuelLevel += amount;
		}
	}
	
	public double getFuelCapacity()
	{
		return fuelCapacity;
	}
	
	public double getFuelEfficiency()
	{
		return fuelEfficiency;
	}
	
	public double getFuelLevel()
	{
		return fuelLevel;
	}
	
	public double getTotalDistance()
	{
		return totalDistance;
	}
	
	@Override
	public String toString()
	{
		String msg;
		msg = "fuelLevel=" + getFuelLevel()
		+ ", totalDistance:" + getTotalDistance() 
		+ ", fuelCapacity=" + getFuelCapacity() 
		+ ", fuelEfficiency=" + getFuelEfficiency();
		return msg;
	}

}
