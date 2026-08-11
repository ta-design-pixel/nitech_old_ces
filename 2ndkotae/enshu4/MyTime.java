public class MyTime {
    private int hour; // UTC時
    private int minute; // UTC分
    private static int hourDifference = 0; // 時差

    public MyTime(int hour, int minute) {
        setTime(hour, minute);
    }

    public static void setHourDifference(int difference) {
        hourDifference = difference;
    }

    public static int getHourDifference() {
        return hourDifference;
    }

    public void setTime(int hour, int minute) { // ->UTC
        this.hour = (hour - hourDifference + 24) % 24;
        this.minute = minute;
    }

    public void setUTC(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public void printTime() {
        System.out.printf("時差を含む時刻: %02d:%02d\n", hour, minute);
    }

    public void printUTC() {
        int utcHour = (hour - hourDifference + 24) % 24;
        System.out.printf("標準時: %02d:%02d\n", utcHour, minute);
    }
}