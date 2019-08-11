package edu.tdd.fizzbuzz;

public class Main {

  public static void main(String[] args) {
    Game game = new Game();
    for (int i = 1; i <= 100; i++) {
      System.out.println(game.eval(i));
    }
  }
}
