package org.interview.rules;

import org.junit.Assert;
import org.junit.Test;

public class IsMultipleOfRuleTest {

    private final GameRule threeMultipleRule = new IsMultipleOfRule(3);
    private final GameRule sevenMultipleRule = new IsMultipleOfRule(7);

    @Test
    public void returnsTrueForValidMultiples() {
        Assert.assertTrue(threeMultipleRule.evaluateRule(3));
        Assert.assertTrue(threeMultipleRule.evaluateRule(6));
        Assert.assertTrue(threeMultipleRule.evaluateRule(60));

        Assert.assertTrue(sevenMultipleRule.evaluateRule(7));
        Assert.assertTrue(sevenMultipleRule.evaluateRule(14));
        Assert.assertTrue(sevenMultipleRule.evaluateRule(140));
    }

    @Test
    public void returnsFalseForNonMultiples() {
        Assert.assertFalse(threeMultipleRule.evaluateRule(2));
        Assert.assertFalse(threeMultipleRule.evaluateRule(7));
        Assert.assertFalse(threeMultipleRule.evaluateRule(32));

        Assert.assertFalse(sevenMultipleRule.evaluateRule(6));
        Assert.assertFalse(sevenMultipleRule.evaluateRule(15));
        Assert.assertFalse(sevenMultipleRule.evaluateRule(71));
    }

}
