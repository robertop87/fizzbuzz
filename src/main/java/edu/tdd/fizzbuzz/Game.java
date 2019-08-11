package edu.tdd.fizzbuzz;

public class Game {

  public static final String FIZZ = "Fizz";
  public static final String BUZZ = "Buzz";
  public static final String FIZZ_BUZZ = "FizzBuzz";
  public static final int FIZZ_DIVISOR = 3;
  public static final int BUZZ_DIVISOR = 5;

  public String eval(int value) {
    if ( value % FIZZ_DIVISOR == 0
        && value % BUZZ_DIVISOR == 0 ) return FIZZ_BUZZ;
    if ( value % FIZZ_DIVISOR == 0 ) return FIZZ;
    if ( value % BUZZ_DIVISOR == 0 ) return BUZZ;
    return Integer.toString(value);
  }
}
