// Periodクラスを書く
public class Period {

    private Day from;
    private Day to;

    public Period(Day from, Day to) {
        this.from = from;
        this.to = to;
    }

    public String toString() {
        int year = to.getYear() - from.getYear();
        int d1 = to.getDay();
        int d2 = from.getDay();
        for (int i = 0; i < to.getMonth(); i++) {
            if (i + 1 == 1 || i + 1 == 3 || i + 1 == 5 || i + 1 == 7 || i + 1 == 8 || i + 1 == 10 || i + 1 == 12) {
                d1 += 31;
            } else if (i + 1 == 2 && (to.getYear()) % 4 == 0) {
                d1 += 29;
            } else if (i + 1 == 2 && (to.getYear()) % 4 != 0) {
                d1 += 28;
            } else {
                d1 += 30;
            }}
        for (int i = 0; i < from.getMonth(); i++) {
            if (i + 1 == 1 || i + 1 == 3 || i + 1 == 5 || i + 1 == 7 || i + 1 == 8 || i + 1 == 10 || i + 1 == 12) {
                d2 += 31;
            } else if (i + 1 == 2 && (from.getYear()) % 4 == 0) {
                d2 += 29;
            } else if (i + 1 == 2 && (from.getYear()) % 4 != 0) {
                d2 += 28;
            } else {
                d2 += 30;
            }
        }
        int days = d1-d2;
        if(days< 0) days += 365;
        return String.format("%04d年と%02d日", year, days);
    }
    
}
