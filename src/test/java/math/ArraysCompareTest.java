package math;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Array;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArraysCompareTest {

	@Test
	void test() {
		int[] numbers = {25,8,21,32,3};
		int[] ExpectedArray = {3,8,21,25,32};
		Arrays.sort(numbers);
		
		
		assertArrayEquals(numbers, ExpectedArray);
		
	}

}
