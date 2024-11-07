public class TestMath_1 {


    @Test
    void TestX()
    {
        SeleniumTest_Guru99 obj = new SeleniumTest_Guru99();
    }

    @Test(priority = 3)
    public void TestPrimeWithDiffrentValues()
    {
        MathCalculator obj = new MathCalculator();

        boolean returnedVlue = obj.PrimeChecker(102);
        Assert.assertEquals(returnedVlueFor19,false);

        boolean returnedVlueFor19 = obj.PrimeChecker(19);
        Assert.assertEquals(returnedVlueFor19,true);
    }

    @Test(priority = 2)
    public void TestDifferenceWithDiffrentValues()
    {
        MathCalculator obj = new MathCalculator();

        int. returnedVlue = obj.Add2Numbers(10,12);
        Assert.assertEquals(returnedVlue,30);

        int returnedVlueFor19
    }
}