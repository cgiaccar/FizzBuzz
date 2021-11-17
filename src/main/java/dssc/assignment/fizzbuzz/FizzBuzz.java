//We want to write a Java program that prints the numbers from 1 to 100 to the
// "standard" output stream and follows these rules.
//
//For multiples of 3 it prints Fizz instead of the number.
//For multiples of 5 it prints Buzz instead of the number.
//For numbers which are multiples of both 3 and 5 it prints FizzBuzz.

package dssc.assignment.fizzbuzz;

public class FizzBuzz {
    public static void main(String... args) {
        for (int i = 1; i <= 105; i++) {
            String result = "";
            result += (i % 3) == 0 ? "Fizz" : "";
            result += (i % 5) == 0 ? "Buzz" : "";
            result += (i % 7) == 0 ? "Bang" : "";
            System.out.println(!result.isEmpty() ? result : i);
        }
    }

    public String convert(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(number); //or Integer.toString(number);
        }
    }
}
