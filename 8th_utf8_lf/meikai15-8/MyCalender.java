// 以下に必要な記述を追加せよ
// カレンダーの表示形式には様々なものが考えられるが
// 代表的なものは以下のものであろう

//       2018. 5
// Su Mo Tu We Th Fr Sa
//        1  2  3  4  5
//  6  7  8  9 10 11 12
// 13 14 15 16 17 18 19
// 20 21 22 23 24 25 26
// 27 28 29 30
public class MyCalender {

    public static int dayOfWeek(int y, int m, int d) {
        // 必要であれば曜日を求めるこのメソッドを使用しても良い
        // ツェラーの公式による曜日の計算
        // [明解 Java,  p.322 より]
        if (m == 1 || m == 2) {
            y--;
            m += 12;
        }
        return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + d) % 7;
    }

    public static void printCalenderMonth(int year, int month) {
        System.out.println("      "+ year + ". " + month);
        System.out.println(" Su Mo Tu We Th Fr Sa");

        int Day = 0;
        int d = 0;
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        Day = 31;
                        break;
                    case 2:
                        Day = 29;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        Day = 30;
                        break;
                    default:
                        break;
                }
            } else {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        Day = 31;
                        break;
                    case 2:
                        Day = 28;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        Day = 30;
                        break;
                    default:
                        break;
                }
            }
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    Day = 31;
                    break;
                case 2:
                    Day = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    Day = 30;
                    break;
                default:
                    break;
            }
        }
        int x = dayOfWeek(year, month, 1);

        for (int i = 0; i < (Day + x) / 7; i++) {
            if (i == 0) {
                for (int j = 0; j < x; j++) {
                    System.out.print("   ");
                }
                for (int k = 0; k < 7 - x; k++) {
                    d += 1;
                    System.out.printf("%3d", d);
                }
                System.out.println();
            } else if (i != 0) {
                for (int j = 0; j < 7; j++) {
                    d = d + 1;
                    System.out.printf("%3d", d);
                }
                System.out.println();
            }
        }
        for (int i = d; i < Day; i++) {
            d = d + 1;
            System.out.printf("%3d", d);
        }
        System.out.println();
    }

    // この他にも必要なメソッドがあれば追加すること
    public static void printCalenderyear(int year) {
        for (int i = 1; i <= 12; i++) {
            printCalenderMonth(year, i);
        }
    }

    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);

        int month = 0;
        if (args.length > 1) {
            month = Integer.parseInt(args[1]);
        }
        if (month != 0) {
            printCalenderMonth(year, month);
        } else {
            printCalenderyear(year);
        }
        return;
    }
}
