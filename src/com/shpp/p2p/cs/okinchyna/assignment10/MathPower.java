package com.shpp.p2p.cs.okinchyna.assignment10;

public class MathPower implements MathComposite{
    private final MathComposite left;
    private final MathComposite right;

     public MathPower (MathComposite left, MathComposite right) {
         this.left = left;
         this.right = right;
     }

    @Override
    public double calculate() {
        return Math.pow(left.calculate(), right.calculate());
    }
}
