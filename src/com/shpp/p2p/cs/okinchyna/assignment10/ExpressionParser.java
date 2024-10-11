package com.shpp.p2p.cs.okinchyna.assignment10;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class ExpressionParser {
    private static final Set<Character> OPERATORS = Set.of('+', '-', '/', '*', '^');
    public static List<String> parse(String formula, HashMap<String, Double> variables) {
        formula = formula.replace(" ", "");
        validateFormula(formula);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < formula.length(); i++) {
            char ch = formula.charAt(i);
            if(isUnaryMinus(formula, ch, i)) {
                sb.append(ch);
            } else if (OPERATORS.contains(ch)) {

            }
        }
        return List.of();
    }

    private static boolean isUnaryMinus(String formula, char ch, int i) {
        return (ch == '-' && i == 0) || (ch == '-' && OPERATORS.contains(formula.charAt(i - 1)));
    }

    private static void validateFormula(String formula) {
        String regex = "^[a-zA-Z0-9+-/*^]+$";
        if (!formula.matches(regex)) {
            throw new IllegalArgumentException("Entered incorrect formula");
        }
    }
}
