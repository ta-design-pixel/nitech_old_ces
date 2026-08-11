// mainメソッドを含むDayTesterクラスを書く
public class DayTester{
    public static void main (String [] args){
        int year = 2007;
        int month = 2;
        int date = 4;

        Day d1 = new Day();
        Day d2 = new Day(year);
        Day d3 = new Day(year,month);
        Day d4 = new Day(year,month,date);
        Day d5 = new Day(d4);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
    }
}
