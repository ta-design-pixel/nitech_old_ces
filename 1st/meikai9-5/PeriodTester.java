// mainメソッドを含むPeriodTesterクラスを書く
public class PeriodTester {

    public static void main(String[] args) {
        Day from = new Day(2007, 2, 4);
        Day to = new Day(2025, 4, 7);

        Period a = new Period(from, to);
        System.out.println(a);
    }
    
   
}
