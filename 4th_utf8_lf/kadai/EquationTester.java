// mainメソッドを含むEquationTesterクラスを書く
public class EquationTester {
        public static void main(String[] args) {
            Equation[] equations = new Equation[6];

        equations[0] = new LinearEquation(2.0, 4.0);       
        equations[1] = new QuadraticEquation(1.0, -5.0, 6.0); 
        equations[2] = new QuadraticEquation(1.0, -4.0, 4.0); 
        equations[3] = new QuadraticEquation(1.0, 2.0, 5.0);  
        equations[4] = new TrigonometricEquation(2.0);
        equations[5] = new TrigonometricEquation(1.0);

        for(int i=0;i<6;i++){
        equations[i].print();
        equations[i].solve();
        System.out.println();
        }
        }
}