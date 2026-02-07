public class Operators {
    public static void main(String args[]){
        int a=10;
        int b=20;

        System.out.println("Arithmetic operators");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo Division: " + (a % b));

        System.out.println("Relational operators");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        System.out.println("Assignment operators");
        a += b;
        System.out.println("a += b: " + a);
        a -= b;
        System.out.println("a -= b: " + a);
        a *= b;
        System.out.println("a *= b: " + a);
        a /= b;
        System.out.println("a /= b: " + a);
        a %= b;
        System.out.println("a %= b: " + a);

        System.out.println("Increment and Decrement");
        System.out.println("++a: " + (++a));
        System.out.println("a++: " + (a++));
        System.out.println("--a: " + (--a));
        System.out.println("a--: " + (a--));

        System.out.println("Logical/Bitwise operators");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
    }
}