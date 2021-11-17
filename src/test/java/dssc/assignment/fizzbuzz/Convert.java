package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;

public class Convert {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2", "41, 41" })
    void numbers_not_divisible_by_3_or_5_to_strings(int number, String expected) {
        Assertions.assertEquals(expected, fizzBuzz.convert(number));
    }
}
