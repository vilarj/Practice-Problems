import Problems.cigarParty;

public class Driver {
    public static void main(String[] args) {
        cigarParty c = new cigarParty();

        System.out.println(c.cigars(30, false)); // false
        System.out.println(c.cigars(50, false)); // true
        System.out.println(c.cigars(70, true)); // true
        System.out.println(c.cigars(30, true)); // false
        System.out.println(c.cigars(39, true)); // false
    }
}