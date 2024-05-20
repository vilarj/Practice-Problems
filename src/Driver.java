import Problems.Problem1;

public class Driver {
    public static void main(String[] args) {
        Problem1 p1 = new Problem1(1,2);

        System.out.println(p1.Add());
        System.out.println(p1.Subtract());
        System.out.println(p1.Multiply());
        System.out.println(p1.Divide());
    }
}