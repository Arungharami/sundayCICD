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

        int returnedVlueFor19 = obj.Add2Numbers(-5 , 5);
        Assert.assertEquals(returnedVlue,30);

        int returnedVlueFor19 = obj.Add2Numbers(-5, 5);

        Assert.assertEquals(obj.Add2Number(-5, 2), -3);

        Assert.assertEquals(obj.Add2Numbers(0, 0), 0);
    }

    @Test(priotity = 1)
    puclic void TestAdditionWithDiffrentValues()
    {
        MathCalculator obj = new MathCalculator();

        Assert.assertEquals(obj.DifferenceNumbers(10,8),2);

        Assert.assertEquals(obj.DifferenceNumbers(0, 0), 0);

        Assert.assertEquals(obj.DifferenceNumbers(3, 0), 3);
    }
}