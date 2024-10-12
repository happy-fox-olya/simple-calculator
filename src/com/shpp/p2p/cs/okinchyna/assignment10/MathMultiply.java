package com.shpp.p2p.cs.okinchyna.assignment10;

public class MathMultiply implements MathComposite {
    private final MathComposite left;
    private final MathComposite right;

    public MathMultiply(MathComposite right, MathComposite left) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double calculate() {
        return left.calculate() * right.calculate();
    }
}
