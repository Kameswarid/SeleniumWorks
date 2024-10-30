package groupings;

import org.testng.annotations.Test;
public class groupmethods {
@Test(groups= {"smoke"},enabled=false)
	public void test1()
	{
		}
	@Test(groups= {"system"})
	public void test2()
	{
	}
	@Test(groups= {"smoke","integration"})
	public void test3()
	{
	}
	@Test(groups= {"smoke"},enabled=false)
	public void test4()
	{
		}
	}
		
		