package com.shpp.p2p.cs.okinchyna.assignment10;

public class MathAdd implements MathComposite{
    private final number;
    private final number1;

    public MathAdd(double number, double number1) {
        this.number = number;
        this.number1 = number1;
    }

    @Override
    public double calculate() {
        return number + number1;
    }
}
