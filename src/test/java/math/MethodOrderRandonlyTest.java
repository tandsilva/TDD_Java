package math;

import java.lang.reflect.Method;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(MethodOrderer.Random.class)

class MethodOrderRandonlyTest {

	@Test
	void testA() {
		System.out.println("Runing Test A ");
	}
	@Test
	void testB() {
		System.out.println("Runing Test A ");
	}
	@Test
	void testC() {
		System.out.println("Runing Test A ");
	}
	@Test
	void testD() {
		System.out.println("Runing Test A ");
	}
}
