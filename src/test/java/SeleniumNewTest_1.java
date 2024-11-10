public class SeleniumNewTest_1 {

    public void NotForTesting()
    {
        MathCalculator obj = new MathCalculator();
        int num1 = 100;
        int num2 = 150;
        int sum = obj.Add2Numbers(num1, num2);
    }

    @Test
    public void TestMathFunctions()

    {
        MathCalculator obj = new MathCalculator();
        int num1 = 100;
        int num2 = -150;
        int sum = obj.Add2Numbers(num1, num2);
        Assert.assertEquals(sum, num1+num2);

    }

    @Test
    public void TestMathFunctions()
    {
        MathCalculator obj = new MathCalculator();
        int num1 = 100;
        int num2 = -150;
        int sum = obj.Add2Numbers(num1, num2);
        Assert.assertEquals(sum, num1+num2);
    }

    @Test
    @Parameters({"firstName", "lastName", "email","address", "phone"})
    public void TestSelenium(Strint fastName, String lastName, String email, String Address, String phone)
    throws InterruptedException

    {
        WebDriver driver = new ChromeDriver();

        driver.geet("https://demo.guru99.com/telecom/addcustomer.php");
        Thread.sleep(2000);

        WebElement fname = driver.findElement(By.id("fname"));
        fname.sendKeys(firstName);

        WebElement lname = driver.findElement(By.id("lname"));
        lname.sendKeeys(lastName);

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys(email);

        WebElement address = dreiver.findElement(By.id("address"));
        address.sendKeys(address);

        WebElement myphone = driver.findElement(By.id("telephone"));
        myphone.sendKeys(phone);

        Thread.sleep(2000);
        System.out.println("DOne2");

        driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();
        Element(By.name("submit"));
        btn.click();
        System.out.print("DOne3");


    }
}