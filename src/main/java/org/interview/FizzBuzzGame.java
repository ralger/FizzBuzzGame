package org.interview;


import org.apache.commons.lang3.Validate;
import org.interview.rules.GameRule;

public class FizzBuzzGame {

    public static String[] playGame(int countUntil, GameRule fizzRule, GameRule buzzRule) {
        Validate.notNull(fizzRule, "FizzRule can not be null");
        Validate.notNull(buzzRule, "BuzzRule can not be null");
        Validate.inclusiveBetween(1,Integer.MAX_VALUE, countUntil, "countUntil passed was %d but should be a positive number greater than 0", countUntil);


        String[] result = new String[countUntil];
        for (int i = 1; i <= countUntil; i++) {
            result[i-1] = evaluateItem(i, fizzRule, buzzRule);
        }
        return result;
    }

    private static String evaluateItem(int value, GameRule fizzRule, GameRule buzzRule) {

        boolean matchesFizzRule = fizzRule.evaluateRule(value);
        boolean matchesBuzzRule = buzzRule.evaluateRule(value);

        if (matchesFizzRule && matchesBuzzRule) {
            return "FizzBuzz";
        } else if (matchesFizzRule) {
            return "Fizz";
        } else if (matchesBuzzRule) {
            return "Buzz";
        } else {
            return String.valueOf(value);
        }
    }

}
