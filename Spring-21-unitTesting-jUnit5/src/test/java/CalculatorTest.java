import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
    @Test
    void testCase1(){
        assertEquals("ADD", Calculator.operator);
    }
    @Test
    void testCase2(){
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3,});

    }
    @Test
    void testCase3(){
        Calculator calculator = new Calculator();
        Calculator calculator2 = calculator;
        assertSame(calculator2, calculator);

    }
    @Test
    void testCase4(){
    assertThrows(IllegalArgumentException.class, () -> Calculator.subtract(10,5));
    }
    @Test
    void testCase5(){

    }

    @Test
    void testAdd() {
    int actual = Calculator.add(2, 3);
    assertEquals(5, actual);
    }
  
}