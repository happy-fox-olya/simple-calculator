package com.shpp.p2p.cs.okinchyna.assignment10;

public class Number implements MathComposite{
    private final double num;

    public Number(double num) {
        this.num = num;
    }

    @Override
    public final double calculate() {
        return num;
    }

}
