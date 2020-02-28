package org.interview.rules;

import org.apache.commons.lang3.Validate;

public class ContainsDigitRule implements GameRule {

    private int digitValue;

    public ContainsDigitRule(int digitValue) {
        Validate.inclusiveBetween(0, 9, digitValue, "DigitValue provided was %d should be a value between 0 and 9 inclusive.", digitValue);
        this.digitValue = digitValue;
    }

    @Override
    public boolean evaluateRule(int itemToEvaluate) {
        for (int remainingValueToTest = itemToEvaluate; remainingValueToTest > 0; remainingValueToTest = remainingValueToTest / 10) {
            if (remainingValueToTest % 10 == digitValue)
                return true;
        }
        return false;

    }
}
