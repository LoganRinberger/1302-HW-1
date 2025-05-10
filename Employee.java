package prob1;

public class Employee 
{
	private double[] hours = new double[7];
	private String name;
	private double payRate;
	
	public Employee (String name, double payRate)
	{
		this.name = name;
		this.payRate = payRate;
		this.newWeek();
	}
	
	public double getHours(int day)
	{	
		return hours[day];
	}
	
	public void setHours(int day,double hours)
	{
		this.hours[day] = hours;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getNumDaysWorked()
	{
		int numDaysWorked = 0;
		for (int i = 0; i < hours.length; i++)
		{
			if (hours[i] > 0)
			{
				numDaysWorked++;
			}
		}
		return numDaysWorked;
	}
	
	public double getPay()
	{
		double pay = 0.0;
		double weekDayOvertime = 0.0;
		int bonus = 0;
		double weekDayHours = 0.0;
		
		if (getWeekdayHours() > 40)
		{
			weekDayOvertime = getWeekdayHours() - 40;
		}
		
		if (getWeekdayHours() > 40)
		{
			weekDayHours = 40;
		}
		else
		{
			weekDayHours = getWeekdayHours();
		}
		
		if (getNumDaysWorked() == 7)
		{
			bonus = 50;
		}
		
		pay = (weekDayHours * payRate) + (weekDayOvertime * (payRate * 1.5)) + (getWeekendHours() * (payRate * 2)) + bonus;
		
		return pay;
	}
	
	public double getPayRate()
	{
		return payRate;
	}
	
	public double getTotalHours()
	{
		double totalHours = 0.0;
		for (int i = 0; i < hours.length; i++)
		{
			totalHours += hours[i];
		}
		return totalHours;
	}
	
	public double getWeekdayHours()
	{
		double weekDayHours = 0.0;
		for (int i = 0; i < 5; i++)
		{
			weekDayHours += hours[i];
		}
		return weekDayHours;
	}
	
	public double getWeekendHours()
	{
		double weekendHours = 0.0;
		for (int i = 5; i < 7; i++)
		{
			weekendHours += hours[i];
		}
		return weekendHours;
	}
	
	public void mergeEmployee(Employee e)
	{
		for (int i = 0; i < hours.length; i++)
		{
			hours[i] += e.hours[i];
		}
	}
	
	public void newWeek()
	{
		for (int i = 0; i < hours.length; i++)
		{
			hours[i] = 0;
		}
	}
	
	@Override
	public String toString()
	{
		String nl = "\n";
		String td = "%.2f";
		String msg = "Pay Stub" + nl + "--------" + nl + "Name:" + getName() 
		+ ", Pay Rate $" + String.format(td, getPayRate()) + nl 
		+ "Hours:Mon:" + String.format(td, hours[0]) 
		+ " Tue:" + String.format(td, hours[1])
		+ " Wed:" + String.format(td, hours[2])
		+ " Thu:" + String.format(td, hours[3]) 
		+ " Fri:" + String.format(td, hours[4]) 
		+ " Sat:" + String.format(td, hours[5])
		+ " Sun:" + String.format(td, hours[6]) 
		+ nl + "Days worked:" + getNumDaysWorked() 
		+ ", TotalHours:" + String.format(td, getTotalHours()) 
		+ nl + "Weekday hours:" + String.format(td, getWeekdayHours()) 
		+ ", Weekend hours: " + String.format(td, getWeekendHours())
		+ nl + "Total pay: $" + String.format(td, getPay());
		
		return msg; 
	}
	
	public static void main(String[] args)
	{
		System.out.print(toString());
	}
	
}
