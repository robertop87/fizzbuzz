package edu.tdd.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class GameTest {

  @Test
  public void testNormalNumber() {
    // 1. Prepare the scenario
    Game game = new Game();
    // 2. Define input-output values
    int input = 1;
    String expected = "1";
    // Optional: boolean isNormal = Boolean.TRUE;

    // 3. Assert (prove)
    String result = game.eval(input);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void testFizzBaseCase() {
    Game game = new Game();
    int input = 3;
    String expected = "Fizz";
    Assert.assertEquals(expected, game.eval(input));
  }

  @Test
  public void testFizzCaseSix() {
    Game game = new Game();
    Assert.assertEquals("Fizz", game.eval(6));
  }

  @Test
  public void testFizzCaseTwo() {
    Game game = new Game();
    Assert.assertEquals("2", game.eval(2));
  }

  @Test
  public void testBuzzCaseFive() {
    Game game = new Game();
    Assert.assertEquals("Buzz", game.eval(5));
  }

  @Test
  public void testFizzBuzzBaseCase() {
    Game game = new Game();
    Assert.assertEquals("FizzBuzz", game.eval(15));
  }

  @Test
  public void testMixCases() {
    Game game = new Game();
    Assert.assertEquals("Fizz", game.eval(99));
    Assert.assertEquals("Fizz", game.eval(303));
    Assert.assertEquals("Fizz", game.eval(69));
    Assert.assertEquals("Buzz", game.eval(500));
    Assert.assertEquals("Buzz", game.eval(125));
    Assert.assertEquals("Buzz", game.eval(50));
    Assert.assertEquals("FizzBuzz", game.eval(30));
    Assert.assertEquals("FizzBuzz", game.eval(90));
    Assert.assertEquals("FizzBuzz", game.eval(600));

  }
}
