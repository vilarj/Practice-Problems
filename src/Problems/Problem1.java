package Problems;

// Write a calculator that supports addition, subtraction, multiplication, division
public class Problem1 {
    private double n1, n2;

    public Problem1(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double Add() {return this.n1 + this.n2;}

    public double Subtract() {return this.n1 - this.n2;}

    public double Multiply() {return this.n1 * this.n2;}

    public double Divide() {
        if (this.n1 == 0) {return 0;}
        else if (IsDenominatorZero()) {
            System.out.println("Denominator can't be 0");
            return -1;
        }
        else {return this.n1 / this.n2;}
    }

    private boolean IsDenominatorZero() {return this.n2 == 0;}
}
