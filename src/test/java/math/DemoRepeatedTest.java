package math;
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.RepeatedTest;
//import org.junit.jupiter.api.RepetitionInfo;
//import org.junit.jupiter.api.TestInfo;
//
//
//public class DemoRepeatedTest {
//
//	SimpleMath math;
//	
//	@BeforeEach
//	void beforEachMethod() {
//		math = new SimpleMath();
//		System.out.println("rodando @BeforeEach method!");
//	}
//	
//	@RepeatedTest(value = 3, name ="{displayName}.Repetition" +"{currentRepetition} of {totalRepetitions}")
//	@DisplayName("Test Division by Zero")
//	void testDivision_when_FirstNumberIsDivideByZero_ShowodTrowAritimeticExeption(
//			RepetitionInfo repetitionInfo,
//			TestInfo testInfo
//			) {
//			System.out.println("Repetition N" + repetitionInfo.getCurrentRepetition()+"of"+repetitionInfo.getTotalRepetitions());
//			System.out.println("Runing "+ testInfo.getTestMethod().get().getName());
//			
//			//given
//			double firstNunber=6.2D;
//			double secondNumber =0D;
//			
//			var expectedMessage ="impossible divide by zero";
//			
//			//when & then 
//			
//			ArithmeticException actual = assertThrows(
//					ArithmeticException.class,()->{
//						math.division(firstNunber ,secondNumber);
//						
//					},()->"Division by zero shoud thow an AritimetcExpression");
//			assertEquals(expectedMessage ,actual.getLocalizedMessage(),
//					()->"Unexpected exeption message");  
//					
//					
//	}
//}



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

class DemoRepeatedTest {

    SimpleMath math;
    
    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
        System.out.println("Running @BeforeEach method!");
    }

    @RepeatedTest(value = 3, name = "{displayName}. Repetition "
    + "{currentRepetition} of {totalRepetitions}!")
    @DisplayName("Test Division by Zero")
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException(
            RepetitionInfo repetitionInfo,
            TestInfo testInfo
        ) {
        
        System.out.println("Repetition N° " + repetitionInfo.getCurrentRepetition() +
            " of " + repetitionInfo.getTotalRepetitions());
        System.out.println("Running " + testInfo.getTestMethod().get().getName());
        
        //given
        double firstNumber = 6.2D;
        double secondNumber = 0D;
        //nao pode esquecer senhor Jarin que esta sendo comparado com a excessao declarada no metodo 
        var expectedMessage = "Impossible to divide by zero";
        
        //when & then
        ArithmeticException actual = assertThrows(
            ArithmeticException.class, () -> {
                //when & then
                math.division(firstNumber, secondNumber);
            }, () -> "Division by zero should throw an ArithmeticException");
        
        assertEquals(expectedMessage, actual.getMessage(),
            () -> "Unexpected exception message!");
    }
}
			
