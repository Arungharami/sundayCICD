public class SeleniumTest_Guru99_1 {

	WebDriver driver = new ChromeDriver();;

	public void AddCustomerToTarrif(String cID)
	{

	}
	@Test(priority = 1)
	@perameters({"fistName", "lastName", "email", "address", "email", "phone", "address"})
	public void AddCustomer(String firstName, String lastName, String email, String address, String Phone)
	throws InterruptedExcedException 
	{
		WebElement fname = driver.finfElement(By.id("lname"));
		fname.sendKeys(lastName);

		WebElement myEmail = driver.findElement(By.id("telephone"));
		
	}
}