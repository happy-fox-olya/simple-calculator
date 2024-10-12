package com.shpp.p2p.cs.okinchyna.assignment10;

import java.util.List;
import java.util.Stack;

public class CompositeCreator implements Constants {
    public static MathComposite createComposite(List<String> parsedFormula) {
        Stack<String> operators = new Stack<>();
        Stack<MathComposite> operands = new Stack<>();
        for (int i = 0; i < parsedFormula.size(); i++) {
            String string = parsedFormula.get(i);
            if (string.length() == 1 && OPERATORS.contains(string.charAt(0))) {
                while (!operators.isEmpty() && isPriorityLower(operators, string)) {
                    operands.add(createMathComposite(operands, operators.pop()));
                }
                operators.add(string);
            } else {
                operands.add(new Number(Double.parseDouble(string)));
            }
        }
        while (!operators.isEmpty()) {
            operands.add(createMathComposite(operands, operators.pop()));
        }
        return operands.pop();
    }

    private static MathComposite createMathComposite(Stack<MathComposite> operands, String operator) {
        return switch (operator) {
            case "+" -> new MathAdd(operands.pop(), operands.pop());
            case "-" -> new MathSubtract(operands.pop(), operands.pop());
            case "*" -> new MathMultiply(operands.pop(), operands.pop());
            case "/" -> new MathDivide(operands.pop(), operands.pop());
            default -> new MathPower(operands.pop(), operands.pop());
        };
    }


    private static boolean isPriorityLower(Stack<String> operators, String operator) {
        return getPriority(operators.peek()) > getPriority(operator);
    }

    private static int getPriority(String operator) {
        return switch (operator) {
            case "+", "-" -> 1;
            case "/", "*" -> 2;
            default -> 3;
        };
    }
}
