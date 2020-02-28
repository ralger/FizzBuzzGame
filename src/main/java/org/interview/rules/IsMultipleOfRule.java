package org.interview.rules;

import org.interview.rules.GameRule;

public class IsMultipleOfRule implements GameRule {

    private int multipleOfvalue;

    public IsMultipleOfRule(int multipleOfvalue) {
        this.multipleOfvalue = multipleOfvalue;
    }

    @Override
    public boolean evaluateRule(int itemToEvaluate) {
        return (itemToEvaluate % multipleOfvalue) == 0;
    }
}
