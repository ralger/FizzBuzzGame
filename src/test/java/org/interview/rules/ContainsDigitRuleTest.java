package org.interview.rules;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDigitRuleTest {

    private final GameRule threeMultipleRule = new ContainsDigitRule(3);
    private final GameRule sevenMultipleRule = new ContainsDigitRule(7);

    @Test
    public void returnsTrueWhenContainsDigit() {
        Assert.assertTrue(threeMultipleRule.evaluateRule(3));
        Assert.assertTrue(threeMultipleRule.evaluateRule(13));
        Assert.assertTrue(threeMultipleRule.evaluateRule(33));

        Assert.assertTrue(sevenMultipleRule.evaluateRule(7));
        Assert.assertTrue(sevenMultipleRule.evaluateRule(17));
        Assert.assertTrue(sevenMultipleRule.evaluateRule(77));
    }

    @Test
    public void returnsFalseWhenDoesNotContainDigit() {
        Assert.assertFalse(threeMultipleRule.evaluateRule(6));
        Assert.assertFalse(threeMultipleRule.evaluateRule(12));
        Assert.assertFalse(threeMultipleRule.evaluateRule(66));

        Assert.assertFalse(sevenMultipleRule.evaluateRule(8));
        Assert.assertFalse(sevenMultipleRule.evaluateRule(14));
        Assert.assertFalse(sevenMultipleRule.evaluateRule(63));
    }


}
