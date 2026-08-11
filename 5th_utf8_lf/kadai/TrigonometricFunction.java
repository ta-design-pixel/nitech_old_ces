// サブクラスTrigonometricFunctionを書く
public class TrigonometricFunction extends DifferentiableFunction{
    private String name;
    private double a;

    public TrigonometricFunction(String name, double a) {
        if (a < -1 || 1 < a) {
            System.out.println("エラー");
        }else{
        this.name = name;
        this.a = a;
    }
    }
    
    public void print() {
        System.out.println(name + ": f(x)= sinx + " + a);
    }
    public double value(double x){
        return Math.sin(x) + a;
    }
    public double dValue(double x){
        return Math.cos(x);
        
    }
}