package math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTestS4 {

    SimpleMath math;
    
    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
    }
//    A string não é nula
// @ValueSource(strings = {"Pele","Sena","Keith Moon"})
//    A string está no formato certo
//
//    A string contém algum valor esperado
//
//    Ou qualquer validação simples com valores fixos que você já conhece
    @ParameterizedTest
    @ValueSource(strings = {"Pele","Sena","Keith Moon"})
    void testValueSource(String firsName) {
    	System.out.println(firsName);
    	assertNotNull(firsName);
    } 
    @DisplayName("Test double subtraction [ firstNumber, secondNumber, expected]")

    @ParameterizedTest
//    @MethodSource("testDivisionInputParameters")
   @CsvFileSource(resources = "/testDivision.csv")
    void testDivision(double firstNumber, double secondNumber, double expected) {
//
            System.out.println("Test " + firstNumber + " / " +
               secondNumber + " = " + expected + "!");
        
        Double actual = math.division(firstNumber, secondNumber);
        
        assertEquals(expected, actual, 2D,
                () -> firstNumber + "/" + secondNumber +
                " did not produce " + expected + "!");
    }
    
    public static Stream<Arguments> testDivisionInputParameters() {
 
        return Stream.of(
            Arguments.of(6.2D, 2D, 3.1D),
            Arguments.of(71D, 14D, 6.07D),
            Arguments.of(18.3, 3.1D, 5.90D)
        );
    }
}