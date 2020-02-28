package org.interview;

import org.interview.rules.GameRule;
import org.interview.rules.IsMultipleOfRule;
import org.junit.Assert;
import org.junit.Test;

/*
    Test FizzBuzzGame using mocks in MockGameRules so that we don't indirectly test the GameRules.
    GameRules have their own tests and we want to keep tests specific to aid in debugging failed tests
 */
public class FizzBuzzGameTest {

    private static final String FIZZ_STRING = "Fizz";
    private static final String BUZZ_STRING = "Buzz";
    private static final String FIZZANDBUZZ_STRING = FIZZ_STRING + BUZZ_STRING;

    @Test(expected = IllegalArgumentException.class)
    public void validatesCountUntilIsPositive() {
        FizzBuzzGame.playGame(-1, new MockGameRules.AlwaysMatchRule(), new MockGameRules.AlwaysMatchRule());
    }

    @Test(expected = NullPointerException.class)
    public void validatesFizzRuleIsNotNull() {
        FizzBuzzGame.playGame(100, null, new MockGameRules.AlwaysMatchRule());
    }

    @Test(expected = NullPointerException.class)
    public void validatesBuzzRuleIsNotNull() {
        FizzBuzzGame.playGame(100, new MockGameRules.AlwaysMatchRule(), null);
    }

    @Test
    public void resultIsSameLengthAsCountUntil() {
        final int testLength = 5;
        final String[] gameResults = FizzBuzzGame.playGame(testLength, new MockGameRules.AlwaysMatchRule(), new MockGameRules.AlwaysMatchRule());
        Assert.assertEquals(testLength, gameResults.length);
    }

    @Test
    public void returnsNumbersWhenNoRuleMatches() {
        final int testLength = 5;
        final String[] gameResults = FizzBuzzGame.playGame(testLength, new MockGameRules.NeverMatchRule(), new MockGameRules.NeverMatchRule());
        Assert.assertArrayEquals(gameResults, new String[] { "1", "2", "3", "4", "5" });
    }

    @Test
    public void returnsFizzWhenFizzRuleMatches() {
        final int testLength = 5;
        final String[] gameResults = FizzBuzzGame.playGame(testLength, new MockGameRules.AlwaysMatchRule(), new MockGameRules.NeverMatchRule());
        Assert.assertArrayEquals(gameResults, new String[] { FIZZ_STRING, FIZZ_STRING, FIZZ_STRING, FIZZ_STRING, FIZZ_STRING });
    }

    @Test
    public void returnsBuzzWhenBuzzRuleMatches() {
        final int testLength = 5;
        final String[] gameResults = FizzBuzzGame.playGame(testLength, new MockGameRules.NeverMatchRule(), new MockGameRules.AlwaysMatchRule());
        Assert.assertArrayEquals(gameResults, new String[] { BUZZ_STRING, BUZZ_STRING, BUZZ_STRING, BUZZ_STRING, BUZZ_STRING });
    }

    @Test
    public void returnsFizzBuzzWhenBothRulesMatch() {
        final int testLength = 5;
        final String[] gameResults = FizzBuzzGame.playGame(testLength, new MockGameRules.AlwaysMatchRule(), new MockGameRules.AlwaysMatchRule());
        Assert.assertArrayEquals(gameResults, new String[] { FIZZANDBUZZ_STRING, FIZZANDBUZZ_STRING, FIZZANDBUZZ_STRING, FIZZANDBUZZ_STRING, FIZZANDBUZZ_STRING });
    }

}
