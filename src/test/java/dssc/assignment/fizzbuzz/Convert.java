package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Convert {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void number_1_is_1() {
        //preparing the test
        int one = 1;

        //actual actions
        String result = fizzBuzz.convert(one);

        //assert part
        Assertions.assertEquals("1", result); //we expect result to be equal to the string "1"
    }

    @Test
    void number_2_is_2() {
        int two = 2;

        String result = fizzBuzz.convert(two);

        Assertions.assertEquals("2", result);
    }
}
