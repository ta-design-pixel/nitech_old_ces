// サブクラスTrigonometricEquationを書く
public class TrigonometricEquation extends Equation{
    private double a;

    public TrigonometricEquation(double a){
        this.a = a;
    }
    public void print() {
        System.out.println("sinx + " + a + " =  0");
    }

    public void solve() {
        if(-a < -1 || 1 < -a){
            System.out.println("解なし");
        }else {
            double answer = Math.asin(-a);
            System.out.println(" x = " + answer);
        }
    }
}