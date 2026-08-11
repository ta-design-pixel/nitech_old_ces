// サブクラスQuadraticFunctionを書く
public class QuadraticFunction extends DifferentiableFunction{
    private String name;
    private double a;
    private double b;

    public QuadraticFunction(String name, double a, double b) {
        if (a * b > 0) {
            System.out.println("エラー");
        }else{
        this.name = name;
        this.a = a;
        this.b = b;
    }
    }
    
    public void print() {
        System.out.println(name + ": f(x)= "+a+"x\u00B2 " + b );
    }
    public double value(double x){
        return a*x*x+b;
    }
    public double dValue(double x){
        return 2*a*x;  
    }
}