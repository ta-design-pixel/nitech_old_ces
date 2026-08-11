// サブクラスLinearEquationを書く
public class LinearEquation extends Equation{
    private double a;
    private double b;

    public LinearEquation(double a,double b){
        this.a = a;
        this.b = b;
    }
    public void print() {
        System.out.println(a+"x + " + b + " =  0");
    }

    public void solve() {
        System.out.println("x =" + -b/a);
    }
}