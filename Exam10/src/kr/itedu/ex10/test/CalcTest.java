package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test() {
		int a = 3;
		int b = 5;
		
		Assert.assertEquals(a + b, Calc.sum(a, b));
		
		a = 8;
		b = 9;
		
		Assert.assertEquals(a + b, Calc.sum(a, b));
		
		a = 16;
		b = 27;
		
		Assert.assertEquals(a + b, Calc.sum(a, b));
	}

}
