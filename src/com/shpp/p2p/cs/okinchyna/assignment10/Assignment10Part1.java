package com.shpp.p2p.cs.okinchyna.assignment10;

import static com.shpp.p2p.cs.okinchyna.assignment10.CompositeCreator.createComposite;
import static com.shpp.p2p.cs.okinchyna.assignment10.ExpressionParser.extractVariables;
import static com.shpp.p2p.cs.okinchyna.assignment10.ExpressionParser.parse;

public class Assignment10Part1 {
    public static void main(String[] args) {
        try {
            double result = createComposite(parse(args[0], extractVariables(args)))
                    .calculate();

            if (Double.isInfinite(result)) {
                System.out.println("Result is infinity");
            } else if (Double.isNaN(result)) {
                System.out.println("Result is NaN. Not correct operation");
            } else {
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println("Formula is not correct: " + e.getMessage());
        }
    }
}
