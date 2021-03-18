package tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
private Calculator calculator;
    @BeforeEach
    void startAllTestsWith() {
         calculator = new Calculator();
    }



    @Test
    void addTwoNumberTest(){
        assertEquals(5, calculator.add(3,2));
        
    }
    @Test
    @DisplayName("Testing for multiplication")
    void multiplicationOfTwoNumberTest() {
        assertEquals(8, calculator.multiply(2, 4));
        assertTrue( calculator.multiply(2,4)==8);
    }

    @Test
    @DisplayName("Two numbers can be divided")
            void divideTwoNumbersTest() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6,3));

    }

    @Test
    @DisplayName("float return")
    void floatNumberTest() {
        Calculator calculator = new Calculator();
        assertEquals(2.5, calculator.divide(5,2));

    }
    @Test
    @DisplayName("Division by zero")
    void divisionByZero(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.divide(5,0));
    }

    @Test
    void difference_canBeCalculated(){
        assertEquals(5, calculator.subtract(10,5));

    }
    @Test
    void difference_willProduceAbsoluteResult(){
        assertEquals(5, calculator.subtract(5,10));
    }
}

   //@Test
  // void calculatorCanCalculateAge(){
    //localDate bessieDob = localDate.Of(2018, 5, 8);
   // assertEquals(2 calculator.calculateAge);
  // }