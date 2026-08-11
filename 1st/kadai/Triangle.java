// Triangleクラスを書く
public class Triangle {

    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Triangle(double l,double m){
        this(l,l,m);
    }
    public Triangle(double n){
        this(n,n);
    }
    double getA() {return a;}
    double getB() {return b;}
    double getC() {return c;}

    void setA(double a) {this.a = a;}
    void setB(double b) {this.b = b;}
    void setC(double c) {this.c = c;}

    static boolean hantei1(Triangle t){
        return t.getA()==t.getB();
    }
    static boolean hantei2(Triangle t){
        return t.getA()==t.getB()&&t.getB()==t.getC();
    }
    static boolean hantei3(Triangle x,Triangle y){
        return x.getA()==y.getB()&&x.getB()==y.getB()&&x.getC()==y.getC();
    }

    public String toString() {
		return String.format("%02f,%02f,%02f", a, b, c);
	}
}
