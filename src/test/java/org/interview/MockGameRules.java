package org.interview;

import org.interview.rules.GameRule;

/*
    Mock implementations of GameRule so that we can test FizzBuzzGame and ComposeWithBooleanOr without indirectly testing the other GameRules
 */
 public class MockGameRules {
    public static class NeverMatchRule implements GameRule {
        public boolean evaluateRule(int itemToEvaluate) {
            return false;
        }
    }

     public static class AlwaysMatchRule implements GameRule {
        public boolean evaluateRule(int itemToEvaluate) {
            return true;
        }
    }
}
