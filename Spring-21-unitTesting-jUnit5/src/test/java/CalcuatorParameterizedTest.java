import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

public class CalcuatorParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"A","B","C"})
    void testcase1(String input) {
       System.out.println(input);
    }


    @ParameterizedTest
    @ValueSource(strings = {"A","B","C"})
    @EmptySource
    @NullAndEmptySource
    void testcase2(String input) {
        System.out.println(input);
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testcase3(String input) {
        System.out.println(input);
    }

    static String[] stringProvider() {
        return Stream.of("A", "B", "C").toArray(String[]::new);
    }

    @ParameterizedTest
    @CsvSource({"10,20,30","20,20,40"})
    void testcase4(int num1,  int num2 , int num3) {
        System.out.println(num1 + num2 + num3);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "C:\\Users\\akrem\\spring-study\\Spring-21-UnitTesting-JUnit5\\src\\main\\resources\\smaple-data.csv")
    void testcase5(int num1,  int num2 , int num3) {
        System.out.println(num1 + num2 + num3);
    }

}
