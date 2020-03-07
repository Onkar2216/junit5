package junit5Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit5Code.calculator;

public class CalculatorTest 
{
	static calculator cl;
	static Logger log;
	
	@BeforeAll
	public static void intializer()
	{
		System.out.println("I am in Intializer.");
		PropertyConfigurator.configure("calculator.properties");
		log=Logger.getLogger("CalculatorTest.class");
		cl=new calculator();
	}
	
	@BeforeEach
	public void before()
	{
		log.info("I am in Before");
	}
	@AfterEach
	public void after()
	{
		log.info("I am in after");
	}
	
	@AfterAll
	public static void afterall()
	{
		log.info("I am in After all");
	}
	@Test
	public void sumTest()
	{
		log.info("I am in Sum Test ");
		int sum=cl.sum(15, 15);
		assertEquals(30, sum);
	}
	
	@Test
	public void subTest()
	{
		log.info("I am in Sub Test ");
		int sub=cl.sub(15, 10);
		assertEquals(5, sub);
	}
	
	@Test
	public void mulTest()
	{
		log.info("I am in mul Test ");
		int mul=cl.mul(15, 5);
		assertEquals(75, mul);
	}
	
	@Test
	public void divTest()
	{
		log.info("I am in div Test ");
		log.warn("Diviser should not be zero");
		int div=cl.div(15, 5);
		assertEquals(3, div);
	}
	
}
