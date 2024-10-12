package com.shpp.p2p.cs.okinchyna.assignment10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpressionParser implements Constants {
    public static List<String> parse(String formula, HashMap<String, Double> variables) {
        formula = formula.replace(" ", "");
        validateFormula(formula);
        StringBuilder sb = new StringBuilder();
        List<String> elements = new ArrayList<>();
        for (int i = 0; i < formula.length(); i++) {
            char ch = formula.charAt(i);
            if (isUnaryMinus(formula, ch, i) ||
                    (Character.isDigit(ch) || Character.isLetter(ch))) {
                sb.append(ch);
            } else {
                elements.add(replaceVariablesIfExists(sb.toString(), variables));
                elements.add(String.valueOf(ch));
                sb.setLength(0);
            }
        }
        elements.add(replaceVariablesIfExists(sb.toString(), variables));
        return elements;
    }

    private static String replaceVariablesIfExists(String string, HashMap<String, Double> variables) {
        return variables.containsKey(string) ? String.valueOf(variables.get(string)) : string;
    }

    private static boolean isUnaryMinus(String formula, char ch, int i) {
        return (ch == '-' && i == 0) || (ch == '-' && OPERATORS.contains(formula.charAt(i - 1)));
    }

    private static void validateFormula(String formula) {
        String regex = "^[a-zA-Z0-9+-/*^]+$";
        if (!formula.matches(regex)) {
            throw new IllegalArgumentException(formula);
        }
    }

    public static HashMap<String, Double> extractVariables(String[] args) {
        HashMap<String, Double> variables = new HashMap<>();
        for (int i = 1; i < args.length; i++) {
            String[] parsedVariables = args[i].replace(" ", "").split("=");
            variables.put(parsedVariables[0], Double.valueOf(parsedVariables[1]));
        }
        return variables;
    }
}
