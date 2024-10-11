package com.shpp.p2p.cs.okinchyna.assignment10;

public class MathSubtract implements MathComposite {
    private final MathComposite left;
    private final MathComposite right;

    public MathSubtract(MathComposite left, MathComposite right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double calculate() {
        return left.calculate() - right.calculate();
    }
}
