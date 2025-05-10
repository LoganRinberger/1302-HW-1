package prob1;

public class EmployeeUtilities 
{
	
	public EmployeeUtilities() {}
	
	public Employee getEmployeeWithMostHours(Employee[] emps)
	{
		Employee employeeWithMostHours = emps[0];
		
		for (int i = 1; i < emps.length; i++)
		{
			if (emps[i].getTotalHours() > employeeWithMostHours.getTotalHours()) 
			{
				employeeWithMostHours = emps[i];
			}
		}
		return employeeWithMostHours; 
	}
	
	public double[] getHoursArray(Employee[] emps)
	{
		double[] hoursArray = new double[emps.length];
		
		for (int i = 0; i < emps.length; i++)
		{
			hoursArray[i] = emps[i].getTotalHours();
		}
		
		return hoursArray;
	}
	
	public double getTotalPay(Employee[] emps)
	{
		double totalPay = 0;
		
		for(int i = 0; i < emps.length; i++)
		{
			totalPay += emps[i].getPay();
		}
		
		return totalPay;
	}

}
