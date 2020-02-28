package org.interview.rules;

import org.apache.commons.lang3.Validate;

public class ComposeWithBooleanOr implements GameRule {

    private GameRule firstRule;
    private GameRule secondRule;

    public ComposeWithBooleanOr(GameRule firstRule, GameRule secondRule) {
        Validate.notNull(firstRule, "FirstRule can not be null");
        Validate.notNull(firstRule, "SecondRule can not be null");
        this.firstRule = firstRule;
        this.secondRule = secondRule;
    }

    @Override
    public boolean evaluateRule(int itemToEvaluate) {
        return firstRule.evaluateRule(itemToEvaluate) || secondRule.evaluateRule(itemToEvaluate);
    }
}
