package com.shpp.p2p.cs.okinchyna.assignment10;

public class Test {
    public static void main(String[] args) {
        Assignment10Part1.main(new String[] {"augkjgh", "a=5"});
        Assignment10Part1.main(new String[] {"-a-5", "-a=-5"});
        Assignment10Part1.main(new String[] {"a+d-f*c", "a=5", "b=-14", "c = 4", "d=0", "f=2.5"});
        Assignment10Part1.main(new String[] {"a+b", "b=-14"});
        Assignment10Part1.main(new String[] {"a+15", "b=-14"});
        Assignment10Part1.main(new String[] {"a+15^c", "a=-14", "c=3"});
        Assignment10Part1.main(new String[] {"a/0", "a=-14"});
        Assignment10Part1.main(new String[] {"a/2+15", "a=-14"});
        Assignment10Part1.main(new String[] {"a / 2+ 15", "a=-14"});
        Assignment10Part1.main(new String[] {"22+-12^2"});
        Assignment10Part1.main(new String[] {null});
        Assignment10Part1.main(new String[] {""});
        Assignment10Part1.main(new String[] {"", null});
    }
}
