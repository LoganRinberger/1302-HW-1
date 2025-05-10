package prob1;

public class ProductTest {

	/***
	 * YOU SHOULD WRITE THESE TEST METHODS.
	 * 
	 */
	public static void main(String[] args) {
		testProductConstructor_Plant_3chars_Batch_2chars();
		testProductConstructor_Plant_3chars_Batch_1chars();
		testProductConstructor_Plant_2chars_Batch_2chars();
		testProductConstructor_Plant_2chars_Batch_1chars();
		testIsAfter2000Test_True_Year2019();
		testIsAfter2000Test_True_Year2000();
		testIsAfter2000Test_False_Year1994();
		testIsMonthEqual_True();
		testIsMonthEqual_False();
	}
	
	/***
	 * Construct a product where the plant has 3 characters, and the batch has 2.
	 * Should show that code, plant, date, and batch are correct.
	 */
	public static void testProductConstructor_Plant_3chars_Batch_2chars() 
	{
		System.out.println("-->testProductConstructor_Plant_3chars_Batch_2chars()");
		String plant = "VLD";
		String batch = "43";
		String date = "04041936";
		String code = plant + date + batch;
		Product product = new Product(code);		
		System.out.println("Expected: code= VLD0404193643 -> Plant= VLD, Date= 04041936, Batch= 43");
		System.out.println("Actual:   " + product);
	}

	/***
	 * Construct a product where the plant has 3 characters, and the batch has 1.
	 * Should show that code, plant, date, and batch are correct.
	 */
	public static void testProductConstructor_Plant_3chars_Batch_1chars() 
	{
		System.out.println("\n-->testProductConstructor_Plant_3chars_Batch_1chars()");
		String plant = "VLD";
		String batch = "4";
		String date = "04041936";
		String code = plant + date + batch;
		Product product = new Product(code);
		System.out.println("Expected: code= VLD040419364 -> Plant= VLD, Date= 04041936, Batch= 4");
		System.out.println("Actual:   " + product);
	}

	/***
	 * Construct a product where the plant has 2 characters, and the batch has 2.
	 * Should show that code, plant, date, and batch are correct.
	 */
	public static void testProductConstructor_Plant_2chars_Batch_2chars() 
	{
		System.out.println("\n-->testProductConstructor_Plant_2chars_Batch_2chars()");
		String plant = "VL";
		String batch = "43";
		String date = "04041936";
		String code = plant + date + batch;
		Product product = new Product(code);
		System.out.println("Expected: code= VL0404193643 -> Plant= VL, Date= 04041936, Batch= 43");
		System.out.println("Actual:   " + product);
	}

	/***
	 * Construct a product where the plant has 2 characters, and the batch has 1.
	 * Should show that code, plant, date, and batch are correct.
	 */
	public static void testProductConstructor_Plant_2chars_Batch_1chars() 
	{
		System.out.println("\n-->testProductConstructor_Plant_2chars_Batch_1chars()");
		String plant = "VL";
		String batch = "4";
		String date = "04041936";
		String code = plant + date + batch;
		Product product = new Product(code);
		System.out.println("Expected: code= VL040419364 -> Plant= VL, Date= 04041936, Batch= 4");
		System.out.println("Actual:   " + product);
	}

	/***
	 * Construct a product where the year is 2019 and then call isAfter2000() which should return true.
	 * Show values to illustrate that return is correct.
	 */
	public static void testIsAfter2000Test_True_Year2019() 
	{
		System.out.println("\n-->testIsAfter2000Test_True_Year2019()");
		String plant = "VL";
		String batch = "4";
		String date = "04042019";
		String code = plant + date + batch;
		Product product = new Product(code);
		boolean isAfter2000 = product.isAfter2000();
		System.out.println("Expected: true");
		System.out.println("Actual:   " + isAfter2000);
	}

	/***
	 * Construct a product where the year is 2000 and then call isAfter2000() which should return true.
	 * Show values to illustrate that return is correct.
	 */
	public static void testIsAfter2000Test_True_Year2000() 
	{
		System.out.println("\n-->testIsAfter2000Test_True_Year2000()");
		String plant = "VL";
		String batch = "4";
		String date = "04042000";
		String code = plant + date + batch;
		Product product = new Product(code);
		boolean isAfter2000 = product.isAfter2000();
		System.out.println("Expected: true");
		System.out.println("Actual:   " + isAfter2000);
	}

	/***
	 * Construct a product where the year is 1994 and then call isAfter2000() which should return false.
	 * Show values to illustrate that return is correct.
	 */
	public static void testIsAfter2000Test_False_Year1994() 
	{
		System.out.println("\n-->testIsAfter2000Test_False_Year1994()");
		String plant = "VL";
		String batch = "4";
		String date = "04041994";
		String code = plant + date + batch;
		Product product = new Product(code);
		boolean isAfter2000 = product.isAfter2000();
		System.out.println("Expected: false");
		System.out.println("Actual:   " + isAfter2000);
	}

	/***
	 * Construct a product where the month is say, Feb, and then call isMonthEqual(2) which should return true.
	 * Show values to illustrate that return is correct.
	 */
	public static void testIsMonthEqual_True() 
	{
		System.out.println("\n-->testIsMonthEqual_True()");
		String plant = "VL";
		String batch = "4";
		String date = "02042000";
		String code = plant + date + batch;
		Product product = new Product(code);
		boolean isMonthEqual = product.isMonthEqual(2);
		System.out.println("Expected: true");
		System.out.println("Actual:   " + isMonthEqual);
	}

	/***
	 * Construct a product where the month is say, Feb, and then call isMonthEqual(3) which should return false.
	 * Show values to illustrate that return is correct.
	 */
	public static void testIsMonthEqual_False() 
	{
		System.out.println("\n-->testIsMonthEqual_False()");
		String plant = "VL";
		String batch = "4";
		String date = "02042000";
		String code = plant + date + batch;
		Product product = new Product(code);
		boolean isMonthEqual = product.isMonthEqual(3);
		System.out.println("Expected: false");
		System.out.println("Actual:   " + isMonthEqual);
	}

}
