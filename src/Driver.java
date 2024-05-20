import Problems.Calculator;

public class Driver {
    public static void main(String[] args) {
        Calculator p1 = new Calculator(1,2);

        System.out.println(p1.Add());
        System.out.println(p1.Subtract());
        System.out.println(p1.Multiply());
        System.out.println(p1.Divide());
    }
}