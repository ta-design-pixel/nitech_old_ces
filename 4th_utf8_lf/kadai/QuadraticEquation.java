// サブクラスQuadraticEquationを書く
public class QuadraticEquation extends Equation{
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void print() {
        System.out.println(a+"x\u00B2 + " + b + " x + " + c +" = 0");
    }

    public void solve() {
        double D = b*b - 4*a*c;
        if(D > 0){
            double answer1 =(( -b + Math.sqrt(D))/(2*a));
            double answer2 =(( -b - Math.sqrt(D))/(2*a));
            System.out.println("x = "+ answer1 + "," + answer2);
        }else if(D == 0){
            double answer = (-b/(2*a));
            System.out.println("x = "+ answer);
        }else{
            double d = -D;
            System.out.println("x = " + (-b/(2*a)) + " + " + (Math.sqrt(d)/(2*a)) + "i ," + (-b/(2*a)) + " - " + (Math.sqrt(d)/(2*a)) + "i" );
        }
    }
}