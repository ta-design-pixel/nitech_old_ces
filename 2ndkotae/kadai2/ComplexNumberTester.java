public class ComplexNumberTester {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(3.0, 4.0);
        ComplexNumber b = new ComplexNumber(1.0, -2.0);
        ComplexNumber c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        c = ComplexNumber.add(a, b);
        System.out.println("a + b = " + c);

        c = a.add(b);
        System.out.println("a.add(b) = " + c);

        c = ComplexNumber.sub(a, b);
        System.out.println("a - b = " + c);

        c = a.sub(b);
        System.out.println("a.sub(b) = " + c);

        c = ComplexNumber.mul(a, b);
        System.out.println("a * b = " + c);

        c = a.mul(b);
        System.out.println("a.mul(b) = " + c);

        c = ComplexNumber.div(a, b);
        System.out.println("a / b = " + c);

        c = a.div(b);
        System.out.println("a.div(b) = " + c);
        double absA = ComplexNumber.abs(a);
        System.out.println("|a| = " + absA);

        absA = a.abs();
        System.out.println("a.abs() = " + absA);

        ComplexNumber conjA = ComplexNumber.conjugate(a);
        System.out.println("conj(a) = " + conjA);

        conjA = a.conjugate();
        System.out.println("a.conjugate() = " + conjA);

    }
}

