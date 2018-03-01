import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void addtest() {
		Calc test = new Calc();
		
		int addOutput = Calc.add(4, 3);
		assertEquals(7,addOutput);

	}
	
	@Test
	public void subtest() {
		Calc test = new Calc();
		
		int subtractOutput = Calc.sub(10,7);
		assertEquals(3,subtractOutput);
	
	}
	
	@Test
	public void multitest() {
		Calc test = new Calc();

		int multiplyOutput = Calc.multi(9,6);
		assertEquals(54,multiplyOutput);

	}
	
	@Test
	public void divtest() {
		Calc test = new Calc();
		
		int divideOutput = Calc.div(33,11);
		assertEquals(3,divideOutput);
	}

}