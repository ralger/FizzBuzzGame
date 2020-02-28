package org.interview.rules;

import org.interview.MockGameRules;
import org.junit.Assert;
import org.junit.Test;

/*
    This test is essentially just a boolean truth table for OR
 */
public class ComposeWithBooleanOrTest {

    @Test(expected = NullPointerException.class)
    public void validatesRulesPassedAreNotNull() {
        new ComposeWithBooleanOr(null, null);
    }

    @Test
    public void returnsTrueWhenFirstRulePasses() {
        final GameRule firstRulePasses = new ComposeWithBooleanOr(new MockGameRules.AlwaysMatchRule(), new MockGameRules.NeverMatchRule());
        Assert.assertTrue(firstRulePasses.evaluateRule(1));
    }

    @Test
    public void returnsTrueWhenSecondRulePasses() {
        final GameRule secondRulePasses = new ComposeWithBooleanOr(new MockGameRules.NeverMatchRule(), new MockGameRules.AlwaysMatchRule());
        Assert.assertTrue(secondRulePasses.evaluateRule(1));
    }

    @Test
    public void returnsTrueWhenBothRulesPass() {
        final GameRule bothRulesPass = new ComposeWithBooleanOr(new MockGameRules.AlwaysMatchRule(), new MockGameRules.AlwaysMatchRule());
        Assert.assertTrue(bothRulesPass.evaluateRule(1));
    }

    @Test
    public void returnsTrueWhenNeitherRulePasses() {
        final GameRule neitherRulePasses = new ComposeWithBooleanOr(new MockGameRules.NeverMatchRule(), new MockGameRules.NeverMatchRule());
        Assert.assertFalse(neitherRulePasses.evaluateRule(1));
    }



}
