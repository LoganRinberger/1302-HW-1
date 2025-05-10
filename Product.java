package prob1;

public class Product 
{
	private int batch;
	private String code;
	private String date;
	//private int indexDateBegins;
	private String plant;
	
	public Product(String code)
	{
		this.code = code;
		batch = extractBatch();
		plant = extractPlant();
		date = extractDate();
	}
	

	private int extractBatch()
	{
		int bn = 0; 
		
		if (Character.isAlphabetic(code.charAt(2))) 
        {
			bn = Integer.parseInt(code.substring(11));
        } 
        else 
        {
        	bn = Integer.parseInt(code.substring(10));
        }
        return bn;
	}

	
	private String extractDate()
	{
		
		if (Character.isAlphabetic(code.charAt(2))) 
        {
            return code.substring(3, 11);
        } 
        else 
        {
            return code.substring(2, 10);
        }
	}
	
	private String extractPlant() 
	{
	    if (Character.isAlphabetic(code.charAt(2))) 
	    {
	        return code.substring(0, 3);
	    } 
	    else 
	    {
	        return code.substring(0, 2);
	    }
	}
	
	public int getBatch()
	{
		return batch;
	}
	
	public String getCode()
	{
		return code;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public String getPlant()
	{
		return plant;
	}
	
	public boolean isAfter2000() 
	{
        int year = Integer.parseInt(date.substring(4));
        
        return year >= 2000;
    }
	
	public boolean isMonthEqual(int month)
	{
		int productMonth = Integer.parseInt(date.substring(0, 2));
		
		return productMonth == month;
	}
	
	public String toString() 
	{
		String msg;
		msg = "code= " + code 
		+ " -> Plant= " + plant 
		+ ", Date= " + date 
		+ ", Batch= " + batch;
		
		return msg;
	}

}
