// mainメソッドを含むFunctionTesterクラスを書く
public class FunctionTester {
    static double NewtonMethod(DifferentiableFunction f, double x0, int n) {
        double x = x0;
        for (int i = 1; i <= n; i++) {
            x = x - f.value(x) / f.dValue(x);
            System.out.println(i + "回 : x = " + x);
        }
        return x;
    }
    public static void main(String[] args) {
        DifferentiableFunction[] difFuncs = new DifferentiableFunction[2];
        difFuncs[0] = new QuadraticFunction("二次関数",1.0 ,-1.0);
        difFuncs[1] = new TrigonometricFunction("三角方程式", 1.0);
        for(Function f: difFuncs){
            double x = 1;
            f.print();
            System.out.println(f.value(x));
            System.out.println();
        }
        for(Differentiable d: difFuncs){
            double x = 1;
            System.out.println("一次導関数:" + d.dValue(x));
            System.out.println();
        }
        for(DifferentiableFunction df: difFuncs){
            System.out.println(NewtonMethod(df, 0.1, 30));
        }
    }
}
