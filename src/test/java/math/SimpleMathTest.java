package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math Operation in Simple Math  Class")
class SimpleMathTest {
	//Given define as varieveis que serao testadas
    SimpleMath math = new SimpleMath();
    double firstNumber = 6.2D;
    double secondNumber = 2D;
    //Teste temporarimente desativado
    @Disabled("TODO ,We Need  still work on it")
    @Test
    @DisplayName("Test 6.2+2 =8.2")
    void whenSixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() {
        double expectedSoma = 8.2D;
        //when quando sera testado 
        Double actual = math.sum(firstNumber, secondNumber);
        //then onde temos a resposta
        assertEquals(expectedSoma, actual,
                () -> firstNumber + " + " + secondNumber + " did not produce " + expectedSoma);
        fail();
    }

    @Test
    @DisplayName("Test 6.2-2 =4.2")
    void whenSixDotTwoIsSubtractedByTwo_ShouldReturnFourDotTwo() {
        double expectedMenos = 4.2;
        Double menos = math.subtraction(firstNumber, secondNumber);
        assertEquals(expectedMenos, menos,
                () -> firstNumber + " - " + secondNumber + " did not produce " + expectedMenos);
    }

    @Test
    @DisplayName("Test 6.2x2 =12.4")
    void whenSixDotTwoIsMultipliedByTwo_ShouldReturnTwelveDotFour() {
        double expectedMultiplica = 12.4;
        Double multiplica = math.multiplication(firstNumber, secondNumber);
        assertEquals(expectedMultiplica, multiplica,
                () -> firstNumber + " * " + secondNumber + " did not produce " + expectedMultiplica);
    }

    @Test
    @DisplayName("Test 6.2/2 =3.1")
    void whenSixDotTwoIsDividedByTwo_ShouldReturnThreeDotOne() {
        double expectedDivide = 3.1;
        Double divisao = math.division(firstNumber, secondNumber);
        assertEquals(expectedDivide, divisao,
                () -> firstNumber + " / " + secondNumber + " did not produce " + expectedDivide);
    }

    @Test
    @DisplayName("Test 6.2+2/2 =4.1")
    void whenSixDotTwoIsAveragedWithTwo_ShouldReturnFourDotOne() {
        double expectedMean = 4.1;
        Double mean = math.mean(firstNumber, secondNumber);
        assertEquals(expectedMean, mean,
                () -> "The mean of " + firstNumber + " and " + secondNumber + " did not produce " + expectedMean);
    }

    @Test
    @DisplayName("Test Raiz de 6.2 =2.4")
    void whenSixDotTwoIsSquareRooted_ShouldReturnTwoDotFourEightNine() {
        double expectedRaiz = 2.4899799195977463;
        Double raizDouble = math.squareRoot(firstNumber);
        assertEquals(expectedRaiz, raizDouble,
                () -> "The square root of " + firstNumber + " did not produce " + expectedRaiz);
        
        
        
     
        }
        
    //test [System Under Test]_[Condition or State Change ]_[Expected Result]
    @Test
    @DisplayName("Test division by zero")
    void TestDivision_When_FirstNunberIsDivided_ByZero_ShouldThRowAritimeticExeption() {
    	//given
        double firstNumber = 6.2D;
        double secondNumber = 0D;
        var expectedMessage ="Impossible to divide by zero";
        //when & Then
        ArithmeticException actual =	assertThrows(ArithmeticException.class,
        		()->{ math.division(firstNumber, secondNumber);
        		}, ()-> "Division by zero should throw an aritmetic Exeption "	);
    	
        		assertEquals(expectedMessage, actual.getMessage(),()->"Unexpected Exepition");
    	}
        
        
    }

