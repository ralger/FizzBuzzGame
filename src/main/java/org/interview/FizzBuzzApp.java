package org.interview;

import org.interview.rules.*;

public class FizzBuzzApp {

  public static void main(String[] args) {
      System.out.println("Playing FizzBuzz with initial rules");
      printGameResults(FizzBuzzGame.playGame(100, new IsMultipleOfRule(3), new IsMultipleOfRule(5)));

      System.out.println("Playing FizzBuzz with Stage #2 rules");
      printGameResults(FizzBuzzGame.playGame(100, isMultipleOfOrContainsDigit(3), isMultipleOfOrContainsDigit(5)));

  }

  private static void printGameResults(String[] results) {
      for (String result: results) {
          System.out.println(result);
      }
  }

  private static GameRule isMultipleOfOrContainsDigit(int value) {
      return new ComposeWithBooleanOr(new IsMultipleOfRule(value), new ContainsDigitRule(value));
  }

}
