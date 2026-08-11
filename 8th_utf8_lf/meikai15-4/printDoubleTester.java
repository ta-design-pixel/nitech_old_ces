// 以下に必要な記述を追加せよ

public class printDoubleTester {

    public static void printDouble(double x, int p, int w) {
        System.out.printf(String.format(String.format("%%%d.%df", w, p), x));
        System.out.println();
    }

    public static void main(String[] args) {
        double x =123.456;
        int p = 5;
        int w = 10;
        printDouble(x,p,w);
        return;
    }
}
