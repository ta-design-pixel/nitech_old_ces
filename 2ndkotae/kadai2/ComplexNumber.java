public class ComplexNumber {
    private double real;
    private double imaginal;

    // コンストラクタ
    public ComplexNumber(double real, double imaginal) {
        this.real = real;
        this.imaginal = imaginal;
    }

    // コピーコンストラクタ
    public ComplexNumber(ComplexNumber other) {
        this.real = other.real;
        this.imaginal = other.imaginal;
    }

    @Override
    public String toString() {
        if (imaginal >= 0) {
            return real + " + " + imaginal + "i";
        } else {
            return real + " - " + (-imaginal) + "i";
        }
    }

    public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.real + b.real, a.imaginal + b.imaginal);
    }

    public ComplexNumber add(ComplexNumber other) {
        return ComplexNumber.add(this, other);
    }

    public static ComplexNumber sub(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.real - b.real, a.imaginal - b.imaginal);
    }

    public ComplexNumber sub(ComplexNumber other) {
        return ComplexNumber.sub(this, other);
    }

    public static ComplexNumber mul(ComplexNumber a, ComplexNumber b) {
        double real = a.real * b.real - a.imaginal * b.imaginal;
        double imaginal = a.real * b.imaginal + a.imaginal * b.real;
        return new ComplexNumber(real, imaginal);
    }

    public ComplexNumber mul(ComplexNumber other) {
        return ComplexNumber.mul(this, other);
    }

    public static ComplexNumber div(ComplexNumber a, ComplexNumber b) {
        double denom = b.real * b.real + b.imaginal * b.imaginal;
        double real = (a.real * b.real - a.imaginal * b.imaginal) / denom;
        double imaginal = (a.imaginal * b.real + a.real * b.imaginal) / denom;
        return new ComplexNumber(real, imaginal);
    }

    public ComplexNumber div(ComplexNumber other) {
        return ComplexNumber.div(this, other);
    }

    public static double abs(ComplexNumber a) {
        double x = a.real*a.real + a.imaginal*a.imaginal;
        double X = Math.sqrt(x);
        return X;
    }

    public double abs() {
        return ComplexNumber.abs(this);
    }

    public static ComplexNumber conjugate(ComplexNumber a) {
        return new ComplexNumber(a.real, -a.imaginal);
    }

    public ComplexNumber conjugate() {
        return ComplexNumber.conjugate(this);
    }
}