public class MyTimeTester {
    public static void main(String[] args) {
        // 日本
        MyTime.setHourDifference(9);
        MyTime jstTime = new MyTime(10, 30);
        System.out.println("現在の時差：" + MyTime.getHourDifference());
        jstTime.printTime();
        jstTime.printUTC();

        MyTime.setHourDifference(-5); // 時差を-5に変更
        MyTime estTime = new MyTime(10, 30);
        System.out.println("現在の時差：" + MyTime.getHourDifference());
        estTime.printTime();
        estTime.printUTC(); 

        // 日本標準時に戻す
        MyTime.setHourDifference(9);
        MyTime jstTime2 = new MyTime(15, 45);
        System.out.println("現在の時差：" + MyTime.getHourDifference());
        jstTime2.printTime(); 
        jstTime2.printUTC(); 
    }
}

