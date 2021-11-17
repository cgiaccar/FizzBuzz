package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Convert {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2", "41, 41" })
    void numbers_not_divisible_by_3_or_5_to_strings(int number, String expected) {
        assertEquals(expected, fizzBuzz.convert(number));
    }

    @Test
    void number_3_to_Fizz() {
        assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    void number_6_to_Fizz() {
        assertEquals("Fizz", fizzBuzz.convert(6));
    }
}
